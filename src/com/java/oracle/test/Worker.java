package com.java.oracle.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Worker implements Runnable 
{
  public static void main (String[] args)
  {
    System.out.println("This is currently running on the main thread, " +
    		"the id is: " + Thread.currentThread().getId());
    Worker worker = new Worker(); 
    Thread thread = new Thread(worker,"t1");
    Thread thread2 = new Thread(worker,"t2");
    thread.setName("one");
    thread2.setName("TWO");
    
    //thread2.start();thread.start();
   
    
    ExecutorService exes=Executors.newFixedThreadPool(2);
    exes.execute(thread2);
    exes.execute(thread);
    
    
    
    ExecutorService exes2=Executors.newFixedThreadPool(2);
    exes2.execute(thread2);
    exes2.execute(thread);
  }
  
  @Override
  public void run() 
  {
	  for(int i=5;i<9;i++){
		  
		  try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    System.out.println("This is currently running on a separate thread, " +
    		"the id is: " + Thread.currentThread().getId()+"Name is "+Thread.currentThread().getName());
	  }
  }
}
