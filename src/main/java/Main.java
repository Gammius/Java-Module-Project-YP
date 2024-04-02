import java.util.Scanner;
public class Main {
    static String product;
    static float price;
    public static int quantity;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Products products = new Products();
        Calculator result = new Calculator();

        while (true) {
            System.out.println("На скольких человек необходимо разделить счёт?");
            quantity = scanner.nextInt();
            if (quantity > 1) {
                while (true) {
                    System.out.println("Введите название блюда или команду Завершить");
                    product = scanner.next();
                    if (product.equalsIgnoreCase("Завершить")) {
                        break;
                    }
                    while (true) {
                        System.out.println("Введите цену блюда");
                        if (scanner.hasNextFloat()) {
                            float price = scanner.nextFloat();
                            result.addPrice(price);
                            break;
                        } else {
                            System.out.println("Введите корректное значение");
                        }
                    }
                    products.addProduct(product);
                    System.out.println("Товар успешно добавлен");
                }
                break;
            } else {
                System.out.println("Введите значение больше 2");
            }
        }
        products.outputProducts();
        result.samib();
        scanner.close();
    }
}