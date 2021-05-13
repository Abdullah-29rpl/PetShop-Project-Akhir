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
public class Goods_Supply extends PetShop {
    public void setpdName(String pdName){
        super.pdName = pdName;
    }
    
    public String getpdName(){
        System.out.println("Product Name :" + pdName);
    return pdName ;
    }
    
    public void setBrands(String Brand){
        super.Brand = Brand;
    }
    
    public String getBrand(){
        System.out.println("Brand :" + Brand);
    return Brand ;
    }
    
    public void setPrice(float Price){
        super.Price = Price;
    }
    
    public float getPrice(){
        System.out.println(Price);
    return Price ;
    }
}
