import java.io.Serializable;
import java.util.Scanner;

public class Product implements Serializable, Comparable<Product> {
    private String iD;
    private String name;
    private String manufacturer;
    private int price;

    public Product() {
    }

    public Product(String iD, String name, String manufacturer, int price) {
        this.iD = iD;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public String getID() {
        return iD;
    }

    public void setID(String iD) {
        this.iD = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ID:");
        this.iD = scanner.nextLine();
        System.out.println("Enter the name:");
        this.name = scanner.nextLine();
        System.out.println("Enter the manufacturer:");
        this.manufacturer = scanner.nextLine();
        System.out.println("Enter the price:");
        this.price = scanner.nextInt();
    }

    public void display() {
        System.out.println("Product{"
                + " ID = "
                + iD
                + ", name = "
                + name
                + ", manufacturer = "
                + manufacturer
                + ", price = "
                + price
                + "$ }");
    }

    @Override
    public String toString() {
        return "Product{"
                + " ID = "
                + iD
                + ", name = "
                + name
                + ", manufacturer = "
                + manufacturer
                + ", price = "
                + price
                + "$ }";
    }

    @Override
    public int compareTo(Product product) {
        return -this.price - product.price;
    }
}
