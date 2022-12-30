package id.ac.undiksha.siak;

import id.ac.undiksha.siak.entities.*;
public class Main {

	public static void main(String[] args) {
		Student siA = new Student();
		siA.setName("Ni Putu Karisma Dewi");
		siA.setAddress("Singaraja");
		siA.setNim("2115101059");
		siA.setGender(false);
		siA.getStudyProgram().setStudyProgramCode("2115101");
		siA.getStudyProgram().setStudyProgramName("Ilmu Komputer");
//		Student -> Study Program -> Coordinator -> Name
		siA.getStudyProgram().getCoordinator().setName("Novita");
		siA.getStudyProgram().getCoordinator().setNip("21151010110");
		siA.getStudyProgram().getCoordinator().setGender(false);
		siA.getStudyProgram().getCoordinator().setAddress("Gedung ME Undiksha");
		siA.printAllInfo();
		siA.getName();
		siA.getStudyProgram().getStudyProgramName();		

		
	}

}