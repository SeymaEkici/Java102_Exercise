import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PatikaStore {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while (choice != 0){
            System.out.println("PatikaStore Management Panel:\n" +
                    "1 - Notebook Operations\n" +
                    "2 - Phone Operations\n" +
                    "3 - List the Brands\n" +
                    "0 - Exit\n" +
                    "Enter your choice:");

            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    Product notebook = new Product();
                    operations(notebook.getProductType());
                    break;

                case 2:
                    Product phone = new Product();
                    operations(phone.getProductType());
                    break;

                case 3:
                    listBrands();
                    break;

                case 0:
                    System.out.println("Thank you for visiting, see you again!");
                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + choice);
            }
        }
    }

    public static void listBrands() {
        System.out.println("Our Brands\n------------------");

        List<String> sortedBrands = new ArrayList<>(Product.getValidBrands());
        Collections.sort(sortedBrands);

        for (String brand : sortedBrands) {
            System.out.println("- " + brand);
        }
    }

    public static void operations(String productType) {

        int choice = -1;

        while(choice != 0){

            System.out.println("Enter your choice:\n" +
                    "1 - List the " + productType + "s\n" +
                    "2 - Add a product\n" +
                    "3 - Delete a product\n" +
                    "4 - Back to the main menu\n");

            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    ProductService.listProducts(productType);
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 0:
                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + choice);
            }
        }
    }
}