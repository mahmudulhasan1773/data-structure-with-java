public class ReverseNumbe2 {
    public static void main(String[] args) {
        int myNumber = 54321;

        int ans = 0;

        while (myNumber>0){
            int remNUm = myNumber % 10;

                myNumber = myNumber / 10;
            ans = ans *10 +remNUm;
        }
        System.out.println(ans);
    }
}
