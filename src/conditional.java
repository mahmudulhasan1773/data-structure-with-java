public class conditional {
    public static  void main(String[] args){

        int salary = 100000000;
        if(salary>10000000){
            salary = salary + 55;
        }else {
            salary = salary + 10;
        }

        System.out.println("the salary is " + salary);
    }
}
