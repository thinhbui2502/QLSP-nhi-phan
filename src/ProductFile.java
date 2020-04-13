import java.io.*;
import java.util.ArrayList;

public class ProductFile {

    public static void writeProduct (ArrayList<Product> arrayList,String path) throws IOException {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(path);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(arrayList);
            System.out.println("Successful Writing!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            objectOutputStream.close();
            fileOutputStream.close();
        }
    }

    public static void readProduct (String path) throws Exception {
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream(path);
            objectInputStream = new ObjectInputStream(fileInputStream);
            ArrayList<Product> products = (ArrayList<Product>) objectInputStream.readObject();
            System.out.println(products);
            System.out.println("Successful Reading!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            objectInputStream.close();
            fileInputStream.close();
        }
    }
}
