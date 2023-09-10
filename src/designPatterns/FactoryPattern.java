package designPatterns;


abstract class Speed{
	int distance;
	int time ;
	abstract void setDistance(int distance);
	abstract void setTime(int time);
	void calculateSpeed() {
		System.out.println("The Speed is :" + distance * time);
	}	
}

class carSpeed extends Speed{

	@Override
	void setDistance(int distance) {
		this.distance = distance;
		
	}

	@Override
	void setTime(int time) {
		// TODO Auto-generated method stub
		 this.time= time;
	}
	
	
}


class CreateSpeedFactory {
	
	static Speed getSpeed(String value) {
		if(value.equals("car")) {
		  return new carSpeed();
		}
		return null;
	}
	
	
}

public class FactoryPattern {
	public static void main(String[] args) {
		Speed carSpe = CreateSpeedFactory.getSpeed("car");
	
	    carSpe.setDistance(10);
	    carSpe.setTime(6);

	    carSpe.calculateSpeed();
	}	
	
}
