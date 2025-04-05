package org.example;

import java.util.Objects;

public class Product implements  Comparable<Product> {

    int id;
    String name;
    double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }


    @Override
    public int compareTo(Product o) {
        return Double.compare(this.price,o.price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
