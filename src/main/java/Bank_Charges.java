
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mdpra
 */
public class Bank_Charges {
    public static void main(String[] args) {
        //Ask the user to enter the amount of checks they wrote during the month
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the amount of checks you wrote this month: ");
        int NumberOfChecks = keyboard.nextInt(); 
        //Calculate the check fee
        final double BASE_FEE = 10;
        double CheckFee = 0;
        if (NumberOfChecks >= 60) {
            CheckFee = NumberOfChecks * 0.04;
            }
        else if (NumberOfChecks >= 40) {
            CheckFee = NumberOfChecks * 0.06;
            }
        else if (NumberOfChecks >= 20) {
            CheckFee = NumberOfChecks * 0.08;
            }
        else {
            CheckFee = NumberOfChecks * 0.10;
            }
        //Calculate the total service fee and display it
        System.out.printf("\n Base service fee: $%.2f", BASE_FEE);
        System.out.printf("\n Your check fee is: $%.2f",  CheckFee);
        double ServiceFee = CheckFee + BASE_FEE; 
        System.out.printf("\n Your total service fee for this month is: $%.2f", ServiceFee);
    }
}
