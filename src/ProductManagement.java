import java.util.ArrayList;
import java.util.Scanner;


public class ProductManagement {
    ArrayList<Product> productsList = new ArrayList<>();

    public void createList() {
        Product product1 = new Product("11", "Iphone 11", "Apple", 999);
        Product product2 = new Product("88", "Galaxy S10", "SanSung", 1089);
        Product product3 = new Product("33", "Reno2 F", "OPPO", 309);
        Product product4 = new Product("64", "Joy 3", "VSmart", 109);
        Product product5 = new Product("99", "BPhone 2", "BKAV",589);
        productsList.add(product1);
        productsList.add(product2);
        productsList.add(product3);
        productsList.add(product4);
        productsList.add(product5);
    }

    public void addProduct() {
        Product product = new Product();
        product.inputData();
        productsList.add(product);
    }

    public void displayProduct() {
        System.out.printf("%-8s%-13s%-17s%-15s","ID","NAME","MANUFACTURER","PRICE ($)");
        try {
            for (Product product : productsList) {
                System.out.printf("\n%-8s%-13s%-17s%-15d",product.getID(),product.getName(),product.getManufacturer(),product.getPrice());
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void findByID() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ID you want to find: ");
        String idToFind = sc.nextLine();
        for (Product product : productsList) {
            if (product.getID().equals(idToFind)) {
                System.out.println("This is the ID you want to find: ");
                product.display();
            }
        }
    }

    public void removeID() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ID you want to remove: ");
        String idForRemove = sc.nextLine();
        for (int i = 0; i < productsList.size(); i++) {
            if (productsList.get(i).getID().equals(idForRemove)) {
                productsList.remove(productsList.get(i));
            }
        }
    }

    public void replaceID() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ID you want to replace: ");
        String idForReplace = sc.nextLine();
        for (int i = 0; i < productsList.size(); i++) {
            if (productsList.get(i).getID().equals(idForReplace)) {
                productsList.remove(productsList.get(i));
                Product newProduct = new Product();
                newProduct.inputData();
                productsList.add(i, newProduct);
            }
        }
    }

}
