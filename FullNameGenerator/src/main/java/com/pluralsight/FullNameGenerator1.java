package com.pluralsight;

import java.util.Scanner;

public class FullNameGenerator1 {

    public static void main (String[]  args) {
    Scanner scanner = new Scanner(System.in);

        //prompt the user for their name
        System.out.println(" What is your First name ?");
        String firstName = scanner.nextLine();

        System.out.println(" What is your last name ?");
        String lastName = scanner.nextLine();

        System.out.println(" Enter your suffix ");
        String suffix = scanner.nextLine();

        System.out.println(" Your Full name is: " + firstName + " " + lastName +", "  + suffix);
        String fullName = scanner.nextLine();




}



}
