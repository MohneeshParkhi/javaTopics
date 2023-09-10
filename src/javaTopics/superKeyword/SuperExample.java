package javaTopics.superKeyword;

class SuperParent{
	public int  counter = 5;  
	
	SuperParent(){
		super();// calling Object class constructor as it is parent to all class
	}
	
	
	void decreaseCounter() {
		System.out.println("Counter value before Decrement Option :" + counter);
		this.counter--;
		System.out.println("Current Counter Value :" + counter);
	}
	
	
}



public class SuperExample extends SuperParent{
	
	SuperExample(){
	super(); // calling SuperParent constructor
	
	}
	
	void callSuperExample() {
		super.counter = 6 ; // accessing and chaning the value of Parent class variable
		
		System.out.println("Counter Vlaue in Child class" + counter);
		
		super.decreaseCounter(); // accessing the PArent class method
	}
	
	public static void main(String args[]) {
		SuperExample superObject = new SuperExample();
		
		superObject.callSuperExample();
		
	}
}

//Note : The value of Parent class is subject to change in child class, while accessing it usinh super keyword.
