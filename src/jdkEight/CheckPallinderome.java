package jdkEight;

public class CheckPallinderome {
	
	static void  checkpallindrome(String st) {
	 int size = st.length();
	 int indexOfString =0;	
	 
	 int CountCheckSubtringPallin = 0;
	 
	 // basic logic of removing first character....
	 while(indexOfString != size)
			
			if(indexOfString == size) {
					break;
			
			}else
			{
	
				String temp = st.substring(indexOfString, size);
				indexOfString++;
				StringBuilder sb = new StringBuilder(temp);
				String tempReverse = sb.reverse().toString();
				
				if(tempReverse.equals(st)) {
					System.out.println(tempReverse);
					CountCheckSubtringPallin++;
					System.out.println("PAllindrome" +CountCheckSubtringPallin);
				}
				// write logic here...to check pallindrome
				
				checkpallindrome(temp);
			}
 
	  }
	
	public static void main(String[] args) {
		
		String str = "NAMAN";
		
	 checkpallindrome(str);
		
	}
}
