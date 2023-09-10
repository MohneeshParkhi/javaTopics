package javaTopics.immutableClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class ImmutabilityCheck{
	final private String id ;
	final private List<String> empName;
	
	public ImmutabilityCheck(List<String> employeeName, String id ) {
		this.id = id;
		this.empName = employeeName;
	}
	
	public String getEmpId(){
		return this.id;
	}
	
	public List<String> getEmployeeList(){
	 // Note: this list is immutable...the how to make it immutable...	
		List<String> tempList = Collections.unmodifiableList(this.empName);
		return tempList;
	
	}
} 

// no Subclassing allowed ...if class is final
public class CustomObjectImmutableCheck {
	public static void main(String[] args) {
		List arr = new ArrayList();
		arr.add("1");
		arr.add("k");
		arr.add("m");
		arr.add("l");
		
		
		ImmutabilityCheck imutability = new  ImmutabilityCheck(arr,"1");
		
		System.out.println("Iniatilizing immutable class");
		System.out.println(imutability.getEmpId() + imutability.getEmployeeList());
		
		arr = new ArrayList();
		arr.add("kr");
		
		System.out.println("Changing refrence of arrayList and printing imuutable object");
		
		System.out.println(imutability.getEmpId()+ imutability.getEmployeeList());
		
		
	  
	}
}


/*
 * 
 * 	Iniatilising immutable class
	1[1, k, m, l]
	Changing reference of arrayList and printing imuutable object
	1[1, k, m, l]

     As you can see, no Object state is changed.you have to make a defensive copy in the constructor. I.e., make a copy of any mutable parameter, and store the copy in Employee. If you can't make a defensive copy, there's really no way to make Employee immutable.
 *
 */
