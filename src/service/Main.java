package service;


import model.Cart;
import model.Product;

public class Main {
    public static void main(String[] args){
        Cart cart1 = new Cart();
        Product product1 = new Product("Sajt", 250);
        cart1.addNewProduct(product1);
        Product product2 = new Product("sonka", 450);
        cart1.addNewProduct(product2);
        System.out.println(cart1.getFullPrice());
    }
}
