package com.pluralsight;
import java.util.*;

public class FullNameGenerator2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        String firstname = PromptForString(" First name");
        String middleName = PromptForString("Middle name");
        String lastName = PromptForString(" Last name ");
        String suffix = PromptForString(" Your suffix is ");

        String fullName;

        if (middleName.isBlank()) {
            if (suffix.isBlank())
                fullName = firstname + " " + lastName;
        } else {
            fullName = firstname + " " + lastName + ", " + suffix;
        }
    }











    }


    public static String PromptForString(String prompt){
            System.out.println(prompt);
            return scanner.nextLine().trim();



    }


}