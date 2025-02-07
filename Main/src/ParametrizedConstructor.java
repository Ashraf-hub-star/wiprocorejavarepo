//Parameterized Constructor
//A parameterized constructor is a constructor that accepts arguments. It allows you to set initial values for object attributes when creating an object.

/*class ClassName{
	public ClassName(dataType parameter1, dataType parameter2, ..) {
		
	}
}*/

class Student1 {
    String name;
    int age;

    
    public Student1(String studentName, int studentAge) {
        name = studentName; 
        age = studentAge;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ParametrizedConstructor {
    public static void main(String[] args) {
        Student1 student = new Student1("Ashraf", 22);
        student.display(); 
    }
}

