package designpattern.creational;


class SynchoronizedBlock {
	private volatile static SynchoronizedBlock synchonizedBlock ;
	private static Object mutex = new Object();
	private SynchoronizedBlock() {}
	
	static SynchoronizedBlock getInstance() {
		SynchoronizedBlock result = synchonizedBlock;
		if(result.equals(null)) {
			 synchronized(mutex) {
				 	result = synchonizedBlock;
				 	if(result == null)
				 		return result = synchonizedBlock = new SynchoronizedBlock();
			 }
			 }
		return result;
		}
			
	}
 	



public class ThreadSafeSingletonPattern {
	 public static void main(String[] args) {
		
	}
	 
}
