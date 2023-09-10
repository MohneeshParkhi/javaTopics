package accessModifiers;


class PrivateAccessModifiers{

		private String name;

		private void returnName(String name){
			this.name = name;
	System.out.println("Name is :"+name);
		}


		public void checkAccessibility(){
			 returnName("Gyanvista");
		}
	}  


public class DriverClassModifiers {
	public static void main(String args[]){
 		PrivateAccessModifiers obj = new PrivateAccessModifiers();
// commenting this statement..
 	//	obj.returnName("Gyanvista"); // compilation error
 	
 		obj.checkAccessibility();
	
	}
}
