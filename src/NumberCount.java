import java.util.Scanner;

public class NumberCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
                int numb = in.nextInt();

                int count = 0;

                while (numb>0){
                    int rem = numb % 10;
                    if(rem == 2){
                        count++;
                    }
                    numb = numb/10;
        }
                System.out.println(count);
    }
}
