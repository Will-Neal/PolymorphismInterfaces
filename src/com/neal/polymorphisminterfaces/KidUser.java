package com.neal.polymorphisminterfaces;

public class KidUser implements LibraryUser {
	int age;

	public KidUser() {
		this.age = 0;
	}

	public KidUser(int age) {
		this.age = age;
	}

	public KidUser(String bookType) {
		this.age = 0;
	}

	public KidUser(int age, String bookType) {
		this.age = age;
	}

	@Override
	public void registerAccount() {
		if (age <= 11) {
			System.out.println("You have successfully registered under a Kids Account");
		} else {
			System.out.println("Sorry, Age must be less than 12 to register as a kid");
		}

	}

	@Override
	public void requestBook(String bookType) {
		if (bookType == "Kids") {
			System.out.println("Book Issued successfully, please return the book within 10 days");
		} else {
			System.out.println("Oops, you are allowed to take only kids books");
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
