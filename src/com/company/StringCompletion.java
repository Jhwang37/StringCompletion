package com.company;

import java.util.Scanner;

public class StringCompletion {

    public static void main(String[] args) {
	String name;
	String breed;
	int age;
	Scanner scan = new Scanner(System.in);

        System.out.println("Hello! What is your pet's name? ");
        name = scan.nextLine();

        System.out.println("What breed is your pet: ");
        breed = scan.nextLine();

        System.out.println("How old is your pet: ");
        age = scan.nextInt();

        System.out.println(name + " is your pet's name. " + breed +
                " is your pet's breed, and it is " + age + " years old");

    }
}
