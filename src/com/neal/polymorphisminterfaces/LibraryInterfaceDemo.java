package com.neal.polymorphisminterfaces;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		KidUser fifthGrader = new KidUser(10);
		KidUser teenager = new KidUser(18);
		
		fifthGrader.registerAccount();
		teenager.registerAccount();
		
		System.out.println("================\n");
		
		fifthGrader.requestBook("Kids");
		fifthGrader.requestBook("Fiction");
		
		System.out.println("================\n");
		
		AdultUser baby = new AdultUser(5);
		AdultUser gradStudent = new AdultUser(23);
		
		baby.registerAccount();
		gradStudent.registerAccount();
		
		System.out.println("================\n");
		
		gradStudent.requestBook("Kids");
		gradStudent.requestBook("Fiction");
	}

}
