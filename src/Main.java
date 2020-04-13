import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManagement productManagement = new ProductManagement();
        productManagement.createList();
        System.out.println("MENU:");
        System.out.println("0. Print the current list");
        System.out.println("1. Add a product");
        System.out.println("2. Write to file");
        System.out.println("3. Read from file");
        System.out.println("4. Find by ID");
        System.out.println("5. Remove by ID");
        System.out.println("6. Replace by ID");
        System.out.println("7. Sorting by comparator");
        System.out.println("8. Sorting by comparable");
        System.out.println("What you want to do?");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        try {
            while (choice >= 0 && choice <= 8) {
                switch (choice) {
                    case 0:
                        productManagement.displayProduct();
                        break;
                    case 1:
                        productManagement.addProduct();
                        break;
                    case 2:
                        ProductFile.writeProduct(productManagement.productsList, "product.txt");
                        break;
                    case 3:
                        ProductFile.readProduct("product.txt");
                        break;
                    case 4:
                        productManagement.findByID();
                        break;
                    case 5:
                        productManagement.removeID();
                        break;
                    case 6:
                        productManagement.replaceID();
                        break;
                    case 7:
                        productManagement.productsList.sort(new Comparator<Product>() {
                            @Override
                            public int compare(Product product1, Product product2) {
                                return product1.getPrice() - product2.getPrice();
                            }
                        });
                        System.out.println("After sorting with comparator: ");
                        productManagement.displayProduct();
                        break;
                    case 8:
                        Collections.sort(productManagement.productsList);
                        System.out.println("After sorting with comparable: ");
                        productManagement.displayProduct();
                        break;

                    default:
                        System.out.println("Not available!");
                }
                System.out.println();
                System.out.println("What you want to do next?");
                Scanner sc = new Scanner(System.in);
                choice = sc.nextInt();
            }
        } catch (Exception ex) {
            ex.getMessage();
        }
    }
}

