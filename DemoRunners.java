/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runner2;

/**
 *
 * @author hp
 */
import java.util.Scanner;
public class DemoRunners 
{
public static void main(String [] args)
{
    Scanner skoosh = new Scanner(System.in);
    
    
    System.out.println("WELCOME TO YOUR VIRTUAL DICTIONARY ");
    System.out.println("IN THIS SECTION WE'LL BE DISCUSSING THE DIFFERENT WAYS TO IMPLEMENT THE WORD'RUN'");
    System.out.println("HERE ARE YOUR SELECTIONS>>");
    System.out.println("INPUT IN 'A' FOR THE ATHLETE IMPLEMENTATION");
    System.out.println("INPUT IN 'M' FOR THE MACHINE IMPLEMENTATION");
    System.out.println("INPUT IN 'P' FOR THE POLITICAL CANDIDATE IMPLEMENTATION");
    String t = skoosh.nextLine();
    if (t.equalsIgnoreCase("A"))
    {
        System.out.println("YOU HAVE SELECTED THE ATHLETE IMPLEMENTATION >>>");
        Athlete runner = new Athlete();
        runner.run();
    }
    else if (t.equalsIgnoreCase("M"))
    {
        System.out.println("YOU HAVE SELECTED THE MACHINE IMPLEMENTATION >>>");
        Machine runner = new Machine();
        runner.run();
    }
    else
    {
        System.out.println("YOU HAVE SELECTED THE POLITICAL CANDIDATE IMPLEMENTATION >>>");
        PoliticalCandidate runner = new PoliticalCandidate();
        runner.run();
    }
    
    System.out.println("HOPE YOU HAVE LEARNT SOMETHING NEW TODAY YOUNG PADOWAN>>>");
    System.out.println("HAVE YOURSELF A LOVELY DAY");
}
}
