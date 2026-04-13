package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        String firstName = "";
        String lastName = "";

        while (firstName.equals("")){
            System.out.println("please enter your first name");
            System.out.print("First name: ");
            firstName = scanner.nextLine();

            if(firstName.equals("")){
                System.out.println("must have a first name");
            }
        }



        System.out.print("Middle name: ");
        String middleName = scanner.nextLine();


        while (lastName.equals("")){
            System.out.println("please enter your Last name");
            System.out.print("Last name: ");
            lastName = scanner.nextLine();

            if(lastName.equals("")){
                System.out.println("must have a Last name");
            }
        }

        System.out.print("Suffix: ");
        String suffix = scanner.nextLine();

        String fullName = firstName + " " + middleName + " " + lastName + " " + suffix;


        System.out.print("Full name: " + fullName);

    }
}
