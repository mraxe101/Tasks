 class Car{
	String Brand;
	String colour;
	int length;
	int weight;
	String category;
	
	public Car(){
		
	}
	
	public static void movingspeed(){
		int movingsped = 120;
		System.out.println("Moving with 120 km/h");;
	}
}

class Testcar{
	public static void main(String[] args){
		Car car1 = new Car();
		
		car1.Brand="Toyota";
		System.out.println("Brand = "+ car1.Brand);
		
		car1.colour="Black";
		System.out.println("Colour = "+car1.colour);
		
		car1.length=5;
		System.out.println("Length is ="+car1.length+"feet");
		
		car1.weight=100;
		System.out.println("Weight is ="+car1.weight+"kg");
		
		car1.movingspeed();
	}
}
