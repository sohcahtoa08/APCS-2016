/**
 * This program tests objects and methods in 5 different classes:
 * Person, Student, Employee, Faculty, Staff
 * 
 * @author Pranshu Suri
*/

public class Test {

	public static void main(String[] args) {
		
		// create objects from each of 5 different classes
		Person person = new Person("Tom", "123 Main Street", "thaverford@gmail.com",
				"123-456-7890", new Date(5, 25, 1984));
		
		Student student = new Student("Andy", "125 Main Street", "adwyer@gmail.com",
				"908-765-4321", new Date(10, 4, 2000), "sophomore");
		
		Employee employee = new Employee("Leslie", "127 Main Street", "lknope@gmail.com",
				"483-189-1385", new Date(1, 27, 1989), 100000, new Date(1,1, 2017));
		
		Faculty faculty = new Faculty("April", "129 Main Street", "aludgate@gmail.com",
				"289-922-2894", new Date(4, 12, 1994), 200000, new Date(9, 3, 2016),
				"9 am - 5 pm", "professor");
		
		Staff staff = new Staff("Ann", "131 Main Street", "aperkins@gmail.com",
				"720-198-2741", new Date(12, 13, 1985), 250000, new Date(11, 15, 2016),
				"nurse");
		
		// invoke 'toString()' methods
		System.out.println(person.toString());
		System.out.println(student.toString());
		System.out.println(employee.toString());
		System.out.println(faculty.toString());
		System.out.println(staff.toString());
		
	}

}
