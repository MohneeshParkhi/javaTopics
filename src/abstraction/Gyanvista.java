package abstraction;


interface website{
  String websiteName ="Gyanvista";
  static String domain = "Gyanvista.com";
  
}


public class Gyanvista {
	public static void main(String args[]) {
		System.out.println(website.domain);
	}
}
