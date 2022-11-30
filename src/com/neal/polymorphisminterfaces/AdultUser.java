package com.neal.polymorphisminterfaces;

public class AdultUser implements LibraryUser {
	
	private int age;
	
	public AdultUser() {
		this.age = 0;
	}
	
	public AdultUser(int age) {
		this.age = age;
	}
	
	public AdultUser(String bookType) {
		this.age = 0;
	}
	
	public AdultUser(int age, String bookType) {
		this.age = age;
	}
	
	@Override
	public void registerAccount() {
		if (age >= 12) {
			System.out.println("You have successfully registered under an Adult Account");
		} else {
			System.out.println("Sorry, Age must be greater than 12 to register as an adult");
		}
	}

	@Override
	public void requestBook(String bookType) {
		if (bookType == "Fiction") {
			System.out.println("Book Issued successfully, please return the book within 7 days");
		} else {
			System.out.println("Oops, you are allowed to take only adult Fiction books");
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
