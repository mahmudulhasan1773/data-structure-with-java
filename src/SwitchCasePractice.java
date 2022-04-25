import java.util.Scanner;

public class SwitchCasePractice {
    public static void main(String[] args) {
        Scanner inFruit = new Scanner(System.in);
        String friuts = inFruit.next();


        switch(friuts){
            case "mango":
                System.out.println(" this is mango ");
                break;
            case "apple":
                System.out.println(" this is apple ");
                break;
            case "banana":
                System.out.println(" this is banana ");
                break;

            default:
                System.out.println("this is not listed food");

        }
    }
}
