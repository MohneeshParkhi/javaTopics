package javaTopics.thisKeyword;

public class ThisKeyword {
	
	public int gyanvista = 0;
	public String gyan = "Gyanvista";
	
	
	ThisKeyword(){
		// cannot call 
	}
	 
	ThisKeyword(int k){
		this(); // calling default constructor from overloaded constructor
		this.gyanVista(); // calling method using this keyword
	}
	
	
	// method returns current instance of 
	public ThisKeyword returnObject() {
		return this;
	}
	
	public void gyanVista() {
	   	
		this.gyan =""; // reasigning value to instance varaiable
		
		this.gyanvista =5; // referring to instance variable
			
	}
	
	public static void main (String args[]) {
	
		ThisKeyword obj = new ThisKeyword();
	
	     // calling methods...
		
		obj.gyanVista();
          
		
		
 }
}
