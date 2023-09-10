package functionalInterfaces;

interface parentOFGyan{
	void printSomeThing ();
}

@FunctionalInterface
interface gyanvista {
	
	String printMethod(String string);
}

public class EffectielyFinalVariable {
	
	String str ="Hello Gyanvista";
	// Enclosing type  || Variable Capture || Effectively final variable.
	public static void main(String[] args) {
		
		EffectielyFinalVariable efec = new EffectielyFinalVariable();
		//String str = "Gyanvista";
//		gyanvista gyan = (strLambda) -> {
//			System.out.println(str);
//			str = "I am gonna rich, since i have started learning";
//			return str;
//		};
	}
}
