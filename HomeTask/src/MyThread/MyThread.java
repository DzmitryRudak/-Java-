package MyThread;

import java.util.Scanner;

public class MyThread extends Thread{
		private static Scanner scan;
		public static void main(String[] args){
			
		  // enter start
			 scan = new Scanner(System.in);
		        String start = scan.nextLine();
		        System.out.println(start);	 
			 
	     NameRunnable nr= new NameRunnable();
	     Thread t1 = new Thread(nr);
	     Thread t2 = new Thread(nr);
	     t1.setName("Thread1:"); 
	     t1.start();
	     t2.setName("Thread2:");
	     t2.start();
	    }
	        public void run(){
	        
	            int ab=1;
	            for(int i=1;i<=10;i++){
	            System.out.print(Thread.currentThread().getName());    
	            for (int j=1;j<=10;j++){
	            System.out.print(" "+(ab++)+" ");
	            }
	            System.out.println();
	        }
	    }
	}
	  class NameRunnable implements Runnable{
	  public void run() {
	       
		  MyThread o1 =new MyThread();
	  o1.run();
	   }
  }
	 		
	   
