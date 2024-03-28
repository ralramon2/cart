

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Product> productSet = new HashSet<>();

        Product p1 = new Product("A", "김구름", 1000);
        Product p2 = new Product("B", "박구름", 2000);
        Product p3 = new Product("C", "최구름", 3000);
        Product p4 = new Product("B", "장구름", 4000);
        Product p5 = new Product("D", "이구름", 5000);

        productSet.add(p1);
        productSet.add(p2);
        productSet.add(p3);
        productSet.add(p4);
        productSet.add(p5);

        System.out.println("고유한 상품 목록 : ");
        for (Product product : productSet) {
            System.out.println(product.getName() + " : " + product.getPrice());
        }

        Cart myCart = new Cart();

        myCart.addProduct(p1, 3);
        myCart.addProduct(p2, 1);
        myCart.addProduct(p3, 1);
        myCart.addProduct(p5, 2);

        myCart.removeProduct(p1, 1);
        myCart.removeProduct(p3, 4);
        myCart.removeProduct(p3, 1);

        myCart.showItems();

        Cart cart = new Cart();

        String csvFilePath = "./products.csv";

        cart.importCSV(csvFilePath);

        cart.showItems();

    }
}