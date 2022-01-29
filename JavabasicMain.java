import java.util.ArrayList;
import java.util.Random;

import models.Product;

public class JavabasicMain {
	public static void main(String[] args) {

        /*
        Product p1 = new Product(123, "Paytm", "Transport", 20.35, true);
        
        System.out.println(p1);
        System.out.println(p1.id);
        System.out.println(p1.name);
        System.out.println(p1.category);
        System.out.println(p1.price);
        System.out.println(p1.available);
*/

        String[] cats = {"Transport", "Electronics", "Furnitures", "Entertainment", "Fitness", "Sports"};

        Random rand = new Random();
        int maxPrice = 10000;

        // Create list of product
        ArrayList<Product> pdtArr = new ArrayList<Product>();

        // add 100 products with random values
        for (int i=1; i < 101; i++) {

            int randomPrice = rand.nextInt(maxPrice) + 1; // random price maxm to 10000

            int catIndex = rand.nextInt(cats.length); // 0-5

            pdtArr.add(new Product(i, "Pdt"+i, cats[catIndex], randomPrice, rand.nextBoolean()));

        }

        int count = 1;
        // Print all 100 created products with values
        for (Product pdt1: pdtArr) {
            System.out.println("Product " + count + " details: ");
            System.out.println("ID: " + pdt1.id);
            System.out.println("Name: " + pdt1.name);
            System.out.println("Category: "+ pdt1.category);
            System.out.println("Price: " + pdt1.price);
            System.out.println("Is Available? : " + pdt1.available);
            count++;
            System.out.println("\n==========================\n\n");
        }

    }

}
