package id.ac.undiksha.siak;

import id.ac.undiksha.siak.entities.*;
public class Main {

	public static void main(String[] args) {
		Student std01 = new Student("Andika", "Taiwan", false, "0000001", "Komputer", "TIK", "FTK");
		
		Staff stf01 = new Staff("Chino", "Bisma", true, "01", "Dog_1_spy");
		
		Lecturer ltr01 = new Lecturer("Mama Dewi", "Bisma", true, "0099", "ILKOM", "Tik", "FTK");
		
		System.out.println("Identity : Student 1");
		std01.printAllAttribute();
		System.out.println( );
		
		System.out.println("Staff Monitor : Stf1");
		stf01.printAllInfo();
		System.out.println( );
		
		System.out.println("Main Lecturer : LTR01");
		ltr01.printAllInfo();		
	}

}