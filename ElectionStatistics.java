//Chapter 2, 5/22/2023, ElectionStatistics.java

import java.util.Scanner; 

public class ElectionStatistics 
{ 
    public static void main(String[] args) { 
        // Variables and constants 
        int vote1, vote2, vote3; 
        String person1, person2, person3; 
        int total; 
        double pct1, pct2, pct3; 
        Scanner input = new Scanner(System.in); 

        // Input phase 
        System.out.print("Enter name for first candidate >> "); 
        person1 = input.nextLine(); 
        System.out.print("Enter votes received >> "); 
        vote1 = input.nextInt(); 
        input.nextLine(); 

        System.out.print("Enter name for second candidate >> "); 
        person2 = input.nextLine(); 
        System.out.print("Enter votes received >> "); 
        vote2 = input.nextInt(); 
        input.nextLine(); 

        System.out.print("Enter name for third candidate >> "); 
        person3 = input.nextLine(); 
        System.out.print("Enter votes received >> "); 
        vote3 = input.nextInt(); 
        input.nextLine(); 

        // Processing phase 
        total = vote1 + vote2 + vote3; 
        pct1 = (double) vote1 / total * 100; 
        pct2 = (double) vote2 / total * 100; 
        pct3 = (double) vote3 / total * 100; 

        // Output phase 
        System.out.println(person1 + " got " + pct1 + " percent of the vote"); 
        System.out.println(person2 + " got " + pct2 + " percent of the vote");  
        System.out.println(person3 + " got " + pct3 + " percent of the vote");  
    } // end of main()
} // end of class