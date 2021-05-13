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
public class PetShop {
    String pdName , Brand, Breeds, Age;
    float Price;
    
    
   
    Scanner input = new Scanner(System.in);
    

    void menucat(){
        Cats menucat = new Cats();
        System.out.println(" Cats Menu ");
        System.out.println("<...........>");
        System.out.println("What breeds are you looking for ?");
        System.out.println("1. Mainecoon");
        System.out.println("2. Ragdoll");
        System.out.println("3. Munchkin");
        System.out.print("Choose by number : ");
        int choose = input.nextInt();
        switch (choose){
            case 1 :menucat.setBreeds("Mainecoon"); 
                    menucat.setAge("10 months"); 
                    menucat.setPrice(5000000); 
                    menucat.getBreeds();
                    menucat.getAge();
                    menucat.getPrice();
                    break;
            case 2 :menucat.setBreeds("Ragdoll"); 
                    menucat.setAge("12 months"); 
                    menucat.setPrice(2000000); 
                    menucat.getBreeds();
                    menucat.getAge();
                    menucat.getPrice();
                    break;
            case 3 :menucat.setBreeds("Munchkin"); 
                    menucat.setAge("1 year"); 
                    menucat.setPrice(10000000); 
                    menucat.getBreeds();
                    menucat.getAge();
                    menucat.getPrice();
                    break;
            default : System.out.println ("Menu Not Available ^^ ");
        }
    }
    
    void menudog(){
        Dogs menudog = new Dogs();
        System.out.println(" Dogs Menu ");
        System.out.println("<...........>");
        System.out.println("What breeds are you looking for ?");
        System.out.println("1. Poodle");
        System.out.println("2. Bulldog");
        System.out.println("3. Husky");
        System.out.print("Choose by number : ");
        int choose = input.nextInt();
        switch (choose){
            case 1 :menudog.setBreeds("Poodle"); 
                    menudog.setAge("10 months"); 
                    menudog.setPrice(5000000); 
                    menudog.getBreeds();
                    menudog.getAge();
                    menudog.getPrice();
                    break;
            case 2 :menudog.setBreeds("Bulldog"); 
                    menudog.setAge("12 months"); 
                    menudog.setPrice(2000000); 
                    menudog.getBreeds();
                    menudog.getAge();
                    menudog.getPrice();
                    break;
            case 3 :menudog.setBreeds("Husky"); 
                    menudog.setAge("1 year"); 
                    menudog.setPrice(10000000);
                    menudog.getBreeds();
                    menudog.getAge();
                    menudog.getPrice();
                    break;
            default : System.out.println ("Menu Not Available ^^ ");
        }
    }
    
    void menugs(){
         Goods_Supply menugs = new Goods_Supply();
        System.out.println(" Cats Menu ");
        System.out.println("<...........>");
        System.out.println("What Goods & supply are you looking for ?");
        System.out.println("1. Pet Cage");
        System.out.println("2. Food Supply");
        System.out.println("3. Grooming Supply");
        System.out.print("Choose by number : ");
        int choose = input.nextInt();
        switch (choose){
            case 1 :menugs.setpdName("Pet Cage"); 
                    menugs.setBrands("PetVet"); 
                    menugs.setPrice(500000); 
                    menugs.getpdName();
                    menugs.getBrand();
                    menugs.getPrice();
                    break;
            case 2 :menugs.setpdName("Food Supply"); 
                    menugs.setBrands("Wishkas"); 
                    menugs.setPrice(20000); 
                    menugs.getpdName();
                    menugs.getBrand();
                    menugs.getPrice();
                    break;
            case 3 :menugs.setpdName("Grooming Supply"); 
                    menugs.setBrands("PetVet"); 
                    menugs.setPrice(1000000); 
                    menugs.getpdName();
                    menugs.getBrand();
                    menugs.getPrice();
                    break;
            default : System.out.println ("Menu Not Available ^^ ");
        }
    }
    
    
}
