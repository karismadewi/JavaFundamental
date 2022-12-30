package id.ac.undiksha.siak;

import id.ac.undiksha.siak.entities.*;
public class Main {

	public static void main(String[] args) {
		Person siX 	= new Student();
		Student siZ = new Student("2115101059", "Komputer", "Teknik Informatika", "FTK");
		Student siA = new Student("Karisma Dewi", "BULELENG", false, "2115101058", "Komputer", "TIK", "FTK");

		Student std1 = new Student();
		std1.setName("Karisma");
		std1.setAddress("Singaraja");
		std1.printAllInfo();
		System.out.println(std1.getAddress());
		System.out.println(std1.getName());
//		overidding
		Student std2 = new Student(
				"Anaphalis Javanica", "DreamWorld", true, "001100011",
				"Fiction",
				"Informatics",
				"FTK"
				
		);
		
		Lecturer lect1 = new Lecturer(
				"12345678",
				"Wayan Marti",
				"Jalan Bisma",
				false,
				"Information System",
				"Informatics",
				"FTK"
		);
		
		Staff staff1 = new Staff(
				"12343342",
				"Andika",
				true,
				"Taiwan",
				"Unit Unitan"
		);
		
//		print functions
		std2.printAllInfo();
		lect1.printAllInfo();
		staff1.printAllInfo();
		
	}

}