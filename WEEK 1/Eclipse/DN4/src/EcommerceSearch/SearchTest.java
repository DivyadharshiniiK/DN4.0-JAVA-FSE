package EcommerceSearch;

import java.util.*;


public class SearchTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Shirt", "Clothing"),
            new Product(3, "Phone", "Electronics"),
            new Product(4, "Shoes", "Footwear"),
            new Product(5, "Watch", "Accessories")
        };

        System.out.print("Enter product name to search: ");
        String searchName = scanner.nextLine();

        Product result1 = SearchUtility.linearSearch(products, searchName);
        if (result1 != null) {
            System.out.println("Found (Linear):" + result1.productId +
                    "," + result1.productName +
                    "," + result1.category);
        } else {
            System.out.println("Not Found (Linear)");
        }

        Arrays.sort(products, Comparator.comparing(p -> p.productName));

        Product result2 = SearchUtility.binarySearch(products, searchName);
        if (result2 != null) {
            System.out.println("Found (Binary):" + result2.productId +
                    "," + result2.productName +
                    "," + result2.category);
        } else {
            System.out.println("Not Found (Binary)");
        }

        scanner.close();
    }
}
