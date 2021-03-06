package com.bridgelabz.designpatterns.creationalpatterns.singleton;

public class ThreadSafeSingleton 
{
	 private static ThreadSafeSingleton instance;
	    
	    private ThreadSafeSingleton(){}
	    
	    public static synchronized ThreadSafeSingleton getInstance(){
	        if(instance == null){
	            instance = new ThreadSafeSingleton();
	        }
	        return instance;
	    }

}
