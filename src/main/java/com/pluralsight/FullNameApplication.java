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

        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1) + " ";



        System.out.print("Middle name: ");
        String middleName = scanner.nextLine();

        if (middleName.equals("")){
            middleName = "";
        }else {
            middleName = middleName.substring(0,1).toUpperCase() + ". ";

        }



        while (lastName.equals("")){
            System.out.println("please enter your Last name");
            System.out.print("Last name: ");
            lastName = scanner.nextLine();

            if(lastName.equals("")){
                System.out.println("must have a Last name");
            }
        }

        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1);

        System.out.print("Suffix: ");
        String suffix = scanner.nextLine();

        if (suffix.equals("")){
            suffix = "";
        }else {
            suffix = ", " + suffix;
        }

        String fullName = firstName + middleName + lastName + suffix;

        System.out.print("Full name: " + fullName);
    }
}
