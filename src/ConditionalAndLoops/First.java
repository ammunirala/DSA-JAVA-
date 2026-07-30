package ConditionalAndLoops;

public class First {
    public static void main(String[] args) {
        int salary = 25400;
//        if(salary > 10000){
//            System.out.println(salary = salary + 2000);
//        } else {
//            System.out.println(salary = salary + 1000);
//        }

        // multiple if-else
        if(salary > 10000){
            System.out.println(salary+=2000); // salary = salary + 2000 same


        } else if(salary >20000){
            System.out.println(salary += 3000);
        }else {
            System.out.println(salary +=1000);
        }

    }
}
