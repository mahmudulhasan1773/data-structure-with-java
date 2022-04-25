public class Function2 {
    public static void main(String[] args) {
        int myAge = age(23, 34, 78);
        System.out.println(myAge);
    }

    static  int age(int first, int second, int third){
        int totalAge = first + second + third;
        return totalAge;
    }
}
