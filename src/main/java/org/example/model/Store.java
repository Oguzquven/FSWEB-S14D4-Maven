package org.example.model;

public class Store {

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
            System.out.println("----------");
        }
    }

    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[3];
        products[0] = new Chocolate("Snack", 5.99, "Milk chocolate", "Milka");
        products[1] = new Coke("Beverage", 2.99, "Sparkling drink", 330);
        products[2] = new Bread("Food", 1.99, "Whole wheat bread", 500);

        listProducts(products);
    }
}