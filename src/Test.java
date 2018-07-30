import java.util.Scanner;

public class Test {
    

    private Product scanner(){
    Scanner scan = new Scanner(System.in);
        System.out.println("Podaj nazwę");
        String name = scan.nextLine();
        System.out.println("Podaj cenę");
        double price = scan.nextDouble();

       return new Product(name,price);

    }



}
