class Car{
	String brand;
	int year;
	
	Car(String carBrand, int launchYear){
		brand=carBrand;
		year=launchYear;
	}
	public void display()
	{
		System.out.println("Brand: " + brand  + " Year: " + year);
	}
}

class Practice{
	public static void main(String[] args)
	{
		Car newCar = new Car("BMW", 2025);
		newCar.display();
	}
}