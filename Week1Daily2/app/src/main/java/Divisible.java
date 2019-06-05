import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Divisible {
    public static void divis(int i){
        int mod3 = i % 3;
        int mod5 = i % 5;
        if(mod3 == 0 && mod5 == 0){
            System.out.println("fizzbuzz");
        }
        else if(mod3 == 0 && mod5 !=0){
            System.out.println("fizz");
        }
        else if(mod3 != 0 && mod5 ==0){
            System.out.println("buzz");
        }
        else if(mod3 != 0 && mod5 !=0){
            System.out.println(i +" is not divisible by 3 or 5.");
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(56);
        list.add(75);
        list.add(9);
        list.add(45);
        list.add(25);
        list.add(87);
        list.add(35);
        Iterator i = list.iterator();
        while (i.hasNext()) {
            Integer it = (Integer) i.next();
            divis(it);
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();
        divis(num);
    }
}
