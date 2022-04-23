import java.util.Scanner;

public class Calculatro {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //input user till user does not press "X" or 'x'

        int result=0;

        while (true){
            System.out.println("enter an operator");
            char mathSymble = input.next().trim().charAt(0);

            if(mathSymble == '+'|| mathSymble =='-'||mathSymble =='*'||mathSymble =='/' ||mathSymble =='%'){
                //input two numbers
                System.out.println("enter two number");
                int numOne = input.nextInt();
                int numTwo = input.nextInt();
                System.out.println();

                if(mathSymble == '+'){
                    result = numOne+numTwo;
                }if(mathSymble == '-'){
                    result = numOne-numTwo;
                }if(mathSymble == '*'){
                    result = numOne*numTwo;
                }if(mathSymble == '/'){
                    if(numTwo!=0){
                        result = numOne/numTwo;
                    }

                }
                if(mathSymble == '%'){
                    result = numOne%numTwo;
                }
            }else if(mathSymble == 'X' || mathSymble == 'x'){
                break;
            }else {
                System.out.println("invalid operation");
            }
            System.out.println(result);
        }

    }

}
