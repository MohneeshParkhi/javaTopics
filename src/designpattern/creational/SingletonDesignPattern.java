package designpattern.creational;


// saves memeory as no new instance is created at run time on based of request. 
// most used in multithreaded and database design pattern
// Database layer, Caching, threadpools, configuration settings


// Rules -> 

class Singleton {
//  1. private static member
	private static Singleton singleton = new Singleton(); // Early instantiation
// private constructor
	private Singleton(){
		
	}

// getor method for obtaining instance
	static Singleton getSingleton() {
		return singleton;
	}	
}

/*
 * Significance of Singleton Class loader : If two or more classloader loads singleton class, 
 * than two instance will be allocated
 */

public class SingletonDesignPattern {
	public static void main(String[] args) {
		
		Singleton s = Singleton.getSingleton();
		Singleton s1 = Singleton.getSingleton();
	
		if(s.hashCode() == s1.hashCode()) {
			System.out.println("Same objects"+ "S Hashcode" + s.hashCode() + "\n"+ "S1 Hashcode  " + s1.hashCode());
		}
	
	}
}
