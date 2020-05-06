package model;

import java.util.ArrayList;

public class Cart {
    private int id;
    private ArrayList<Product> purchasedProducts = new ArrayList<Product>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Product> getPurchasedProducts() {
        return purchasedProducts;
    }

    public void setPurchasedProducts(ArrayList<Product> purchasedProducts) {
        this.purchasedProducts = purchasedProducts;
    }
    public void addNewProduct(Product productToAdd){
        this.purchasedProducts.add(productToAdd);
    }

    public double getFullPrice(){
        return purchasedProducts.stream()
                .map(Product::getPrice).mapToDouble(Double::doubleValue).sum();
    }

}
