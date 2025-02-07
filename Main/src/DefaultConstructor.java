////Syntax:
//
//class ClassName{
//	//Default Constructor
//	public ClassName() {
//		//Initialization code
//	}
//}

//What Are Constructors in Java?
//A constructor in Java is a special method used to initialize objects. It is automatically called when an object is created. Constructors help set up the initial state (e.g., values of variables) of an object.
////Default Constructor: A default constructor is a constructor with no parameters, automatically created by the java compiler if you don't define any constructors in your class.

class Vehical {
    String brand;
    int year;

    
    public Vehical() {
        brand = "Toyota";  
        year = 2023;       
    }

    public void display() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

public class DefaultConstructor {
    public static void main(String[] args) {
        // Create an object using the default constructor
    	Vehical myCar = new Vehical();

        
        myCar.display(); 
    }
}


