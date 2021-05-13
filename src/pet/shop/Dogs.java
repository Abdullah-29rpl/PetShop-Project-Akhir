/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet.shop;

/**
 *
 * @author apple
 */
public class Dogs extends PetShop {
    
    public void setBreeds(String Breeds){
        super.Breeds = Breeds;
    }
    
    public String getBreeds(){
        System.out.println("Dogs Breeds :" + Breeds);
    return Breeds ;
    }
    
    public void setAge(String Age){
        super.Age = Age;
    }
    
    public String getAge(){
        System.out.println("Dogs Age :" + Age);
    return Age ;
    }
    
    public void setPrice(float Price){
        super.Price = Price;
    }
    
    public float getPrice(){
        System.out.println(Price);
    return Price ;
    }
}
