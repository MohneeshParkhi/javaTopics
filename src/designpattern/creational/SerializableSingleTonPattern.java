package designpattern.creational;

import java.io.Serializable;

/*
 * Example of Singleton Serilizable class
 */




// Following early intialization...
public class SerializableSingleTonPattern implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static SerializableSingleTonPattern singleton  = new SerializableSingleTonPattern();
	
	private SerializableSingleTonPattern() {}
	
	protected static SerializableSingleTonPattern readResolve() {
		return singleton;	
	}
	
	public static void main(String[] args) {
		SerializableSingleTonPattern single = readResolve();	
	}
	
}
