import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
                int nthNumber = input.nextInt();

                int fNumber = 0;
                int SNumber = 1;

                int count = 2;

                while (count<=nthNumber){
                    int tempNumner = SNumber;
                    SNumber = SNumber+fNumber;
                    fNumber = tempNumner;
                    count++;
                }
                System.out.println(SNumber);
    }
}