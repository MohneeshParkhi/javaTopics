package designpattern.creational;

/*
 * 
 * Factory method pattern, interface or abtract class  methods 
 * implementation by child class.
 * 
 * So, child class have ability to provide implementation of method bodies.
 * 
 * Also called virtual constructor.
 * 
 * We have flexibility about implementing the methods.
 * 
 * Changing the behaviour
 */


interface Car {
	void printCarModel();
	void printCarDetails();
	void printCarPrices();
}


class BMW implements Car {

	@Override
	public void printCarModel() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printCarDetails() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printCarPrices() {
		// TODO Auto-generated method stub
		
	}
	
}


class  Volkswagen implements Car {

	@Override
	public void printCarModel() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printCarDetails() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printCarPrices() {
		// TODO Auto-generated method stub
		
	}
	
}



// intermediate class for obtaining the type of object, required at run time.
class GetCarType {
	public  static Car getCarType(String ar) {
		if(ar.equals("BMW")) {
			return new BMW();
		} else if(ar.equals("Volkswagen")) {
			return new Volkswagen();
		}
		return null;	
	}
}



public class FactoryMethodPattern {
	public static void main(String[] args) {
		
		Car bmwCar = GetCarType.getCarType("BMW");
		Car volksWagen = GetCarType.getCarType("Volkswagen");
	
		
		
	}
}
