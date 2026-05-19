package com.pluralsight.loops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        List<Person> allNames = new ArrayList<>();
        allNames.add(new Person("Olivia","Carpenter", 15));
        allNames.add( new Person("Maddison","Stout", 18));
        allNames.add(new Person("Rodrigo", "Roman",22));
        allNames.add(new Person("Carly", "Owen", 30));
        allNames.add(new Person("Robert", "Tyler",16 ));
        allNames.add(new Person("Zaniyah", "Hull", 12));
        allNames.add(new Person("Eleanor", "Wright", 47));
        allNames.add(new Person("Dakota", "Rose", 10));
        allNames.add(new Person("Shaun", "Harvey", 25));
        allNames.add(new Person("Sanai", "May", 33));

        // Ask user for name to search(first or last)
        System.out.println("Enter First OR Last Name to Search");
        Scanner userScanner = new Scanner(System.in);
        String userNameSearch = userScanner.nextLine();

        // For Loop and new List for Saved matches
        List<Person> matchedName = new ArrayList<>();
        for (Person p : allNames){
            if (p.getFirstName().equalsIgnoreCase(userNameSearch)){
                matchedName.add(p);
            }
            if (p.getLastName().equalsIgnoreCase(userNameSearch)){
                matchedName.add(p);
            }
        }
        //Loop through Matches and display
        for (Person person : matchedName){
            System.out.println(person);
        }
    }


}
