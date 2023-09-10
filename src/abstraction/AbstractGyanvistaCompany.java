package abstraction;


abstract class GyanvistaCompany {
	String str ="Hello";
	final String nameCompany ="Gyanvista";
	public void printCompanyName() {
		System.out.println(this.nameCompany);
		}
	abstract void printStr();
	
}

public class AbstractGyanvistaCompany extends GyanvistaCompany {
	
		
	@Override
	void printStr() {
		this.str ="Hello Gyanvista";
		System.out.println(this.str);	
	}
	
    @Override 
    public void printCompanyName() {
    
    	System.out.println("Hello Company Name");	
    }
    
    
	
}
