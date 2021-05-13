/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet.shop;

import java.util.Scanner;

/**
 *
 * @author apple
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //objek
        PetShop Display = new PetShop();
        //menu utama
        Scanner input = new Scanner(System.in);
        System.out.println(" WELCOME TO PET SHOP ");
        System.out.println("<...................>");
        System.out.println("What are you looking for ?");
        System.out.println("1. Cat");
        System.out.println("2. Dog");
        System.out.println("3. Goods & Supply");
        System.out.print("Choose by number : ");
        int choose = input.nextInt();
        switch (choose){
            case 1 :Display.menucat(); break;
            case 2 :Display.menudog(); break;
            case 3 :Display.menugs(); break;
            default : System.out.println ("Menu Not Available ^^ ");
        }
        
    }
}
