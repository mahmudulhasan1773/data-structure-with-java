public class RevearseNumer {
    public static void main(String[] args) {
        int num = 123456789;

        int ans = 0;

        while (num>0){
            int remNumber = num%10;
            num = num / 10;

            ans = ans * 10 +remNumber;
        }

        System.out.println(ans);
    }
}
