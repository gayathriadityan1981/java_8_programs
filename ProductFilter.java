import java.util.*;
import  java.util.stream.Collectors;  

class Product {
    private int productId;
    private String productName;
    private double price;
    
    public  Product(int productId,String productName,double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }
    public String getProductName() {
        return productName;
    }
     public int getProductId() {
        return productId;
    }
     public double getPrice() {
        return price;
    }
}
class ProductFilter {
    public static void main(String[] args) {
        /* Filter an element in an array
        */
        List<Product> pdtList = new ArrayList<>();
        pdtList.add(new Product(1,"Samsung Galaxy",12500.50));
        pdtList.add(new Product(2,"Oppo",10500.50));
        pdtList.add(new Product(3,"Apple Iphone",112500.50));
        pdtList.add(new Product(4,"Nokia",16500.50));
        
        List<Product> result = pdtList.stream()
        .filter(i-> i.getProductName().equalsIgnoreCase("Oppo"))
        .collect(Collectors.toList());
        System.out.println("Result :" + String.valueOf(result.get(0).getProductId()));
        System.out.println("Result :" + String.valueOf(result.get(0).getProductName()));
        System.out.println("Result :" + String.valueOf(result.get(0).getPrice()));
    }
}
