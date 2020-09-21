
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
public class Bar_Chart {
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);   
    // Get the Sales from the user
        System.out.println("Enter the sales for store 1: ");
        int Store1 = Keyboard.nextInt();
        System.out.println("Enter the sales for store 2: ");
        int Store2 = Keyboard.nextInt();
        System.out.println("Enter the sales for store 3: ");
        int Store3 = Keyboard.nextInt();
        System.out.println("Enter the sales for store 4: ");
        int Store4 = Keyboard.nextInt();
        System.out.println("Enter the sales for store 5: ");
        int Store5 = Keyboard.nextInt();
        
    // Divide Sales by 100 and Display Sales in Bar Chart   
        int Store1Output = Store1/100;
        int Store2Output = Store2/100;
        int Store3Output = Store3/100;
        int Store4Output = Store4/100;
        int Store5Output = Store5/100;
        System.out.println("SALES BAR CHART");
        System.out.print("Store 1: ");
        for (int i = 1; i <= Store1Output; i++ ) {
            System.out.print("*");
        }
        System.out.print("\nStore 2: ");
        for (int i = 1; i <= Store2Output; i++) {
            System.out.print("*");
        }
        System.out.print("\nStore 3: ");
        for (int i = 1; i <= Store3Output; i++ ) {
            System.out.print("*");
        }
        System.out.print("\nStore 4: ");
         for (int i = 1; i <= Store4Output; i++ ) {
            System.out.print("*");
         } 
        System.out.print("\nStore 5: "); 
          for (int i = 1; i <=Store5Output; i++ ) {
            System.out.print("*");
        }
    }
       
}
