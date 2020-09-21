
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
public class Sum_Of_Numbers {
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in); 
        System.out.println("Please enter a positive, non-zero number: ");
        int SumRange = Keyboard.nextInt(); 
        while (SumRange < 1) {
            System.out.println("Invalid Number. Please enter a number greater than 0");
            SumRange = Keyboard.nextInt(); 
        }
        int output = 0;
        for (int i = 1; i <= SumRange; i++) {
            output+= i;
        }
        
      System.out.println("The sume of the numbers 1 through " + SumRange + " is " + output);
      }
    }



