import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        sum();
    }

    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number");
        int fNumber = in.nextInt();
        System.out.println("Enter second number");
        int sNumber = in.nextInt();

        int sum = fNumber + sNumber;
        System.out.println(sum);
    }
}
