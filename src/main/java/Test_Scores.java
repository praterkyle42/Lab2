
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kylep
 */
public class Test_Scores {
    public static void main(String[] args) {
        //Get Test Scores from the User 
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your score for Test 1: ");
        double TestScore1 = keyboard.nextDouble();
        System.out.println("Enter your score for Test 2: ");
        double TestScore2 = keyboard.nextDouble(); 
        System.out.println("Enter your score for  Test 3: ");
        double TestScore3 = keyboard.nextDouble();
     
        //Calculate the Average of the Test Scores and Display it
        double TestAverage = (TestScore1 + TestScore2 + TestScore3)/ 3;
        System.out.println("Your test average was: " + TestAverage);
        
        //Decide what letter grade to assign to the average
        if (TestAverage >=90){
            System.out.println("Your grade is an A");
           }
        else if (TestAverage >= 80) {
            System.out.println("Your grade is a B");
            }
        else if (TestAverage >=70) {
            System.out.println("Your grade is a C"); 
            }
        else if (TestAverage >=60) {
            System.out.println("Your grade is a D");
            }
        else {
            System.out.println("Your grade is an F");
            }
        }
    }
