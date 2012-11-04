/**
 This program will test the Dog.java class.
 @author Matthew C Morgan - 3430092
*/
public class DogTestDriver {
	public static void main(String[] args) {
/**
 This will create the 3 dog objects used for testing our new class.
*/
		Dog d1 = new Dog("Fido", 3);
		Dog d2 = new Dog("Sparky", 5);
		Dog d3 = new Dog("Yuki", 2);
/**
This will print out a summary of our dog objects.
*/		
		System.out.println("This class is testing Dog objects.  Their names and ages are:" + '\n' +
					d1.getName() + "\t:\t " + d1.getAge() + '\n' + 
					d2.getName() + "\t:\t " + d2.getAge() + '\n' +
					d3.getName() + "\t:\t " + d3.getAge());
/** Sparky gets a new name!
*/
		d2.setName("Imadog");
/**
This functions increments the age of the object by 1.
*/
		d3.birthday();
/**
This will print the change after incrementing.
*/		

		System.out.println(d3.getName() + " just had a birthday.  Her new age is " + d3.getAge() + ".");
/**
This will resummarize the dog objects after change.
*/

		System.out.println("After the birthday, their names, ages, and human ages are:"+'\n' +
					d1.getName() + "\t:\t " + d1.getAge() + "\t:\t " + d1.humanAge() + '\n' + 
					d2.getName() + "\t:\t " + d2.getAge() + "\t:\t " + d2.humanAge() + '\n' +
					d3.getName() + "\t:\t " + d3.getAge() + "\t:\t " + d3.humanAge());
	}
}

