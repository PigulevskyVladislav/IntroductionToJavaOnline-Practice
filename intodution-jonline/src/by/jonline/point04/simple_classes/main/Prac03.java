package by.jonline.point04.simple_classes.main;

import by.jonline.point04.simple_classes.main.prac03.Student;

public class Prac03 {

	public static void main(String args[]) {
		
		int[] perform;
		Student[] studs = new Student[10];
		
		//Init studs
		perform = new int[] {6, 9, 2, 7, 4};
		Student s1 = new Student("Aayush Mcknight", 2010, perform);
		perform = new int[] {6, 1, 10, 2, 4};
		Student s2 = new Student("William Daniel", 2030, perform);
		perform = new int[] {4, 5, 6, 4, 9};
		Student s3 = new Student("Raiden Regan", 2510, perform);
		perform = new int[] {2, 9, 2, 5, 10};
		Student s4 = new Student("Taya Allison", 2011, perform);
		perform = new int[] {8, 7, 9, 9, 9};
		Student s5 = new Student("Jazmin Hooper", 2050, perform);
		perform = new int[] {4, 8, 7, 7, 5};
		Student s6 = new Student("Kiri Alexander", 2210, perform);
		perform = new int[] {9, 9, 10, 10, 9};
		Student s7 = new Student("John-James Swift", 2610, perform);
		perform = new int[] {9, 9, 10, 7, 9};
		Student s8 = new Student("Kain Mellor", 2014, perform);
		perform = new int[] {10, 9, 10, 10, 10};
		Student s9 = new Student("Frederic Kirkland", 2110, perform);
		perform = new int[] {5, 9, 3, 5, 8};
		Student s10 = new Student("Ronaldo Waters", 2060, perform);
		
		//Push studs into in array
		studs[0] = s1;
		studs[1] = s2;
		studs[2] = s3;
		studs[3] = s4;
		studs[4] = s5;
		studs[5] = s6;
		studs[6] = s7;
		studs[7] = s8;
		studs[8] = s9;
		studs[9] = s10;
		
		PrintExcellentStuds(studs);
	}
	
	private static void PrintExcellentStuds(Student[] studs) {
		
		System.out.println("Excellent students: ");
		for(Student s : studs) {
			
			if(IsExcStud(s)) {
				
				System.out.println(s.toString());
			}
		}
	}
	
	private static boolean IsExcStud(Student s) {
		
		int[] perform = s.getPerform();
		
		for(int i = 0; i < perform.length; i++) {
			
			if(perform[i] != 9 && perform[i] != 10) {
				
				return false;
			}
		}
		
		return true;
	}
}
