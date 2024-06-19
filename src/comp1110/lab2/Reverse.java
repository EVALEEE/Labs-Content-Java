package comp1110.lab2;

/**
 * @author EVA LEE
 * @version 1.0
 * @time 26/2/2024 12:19 pm
 */
public class Reverse {
    public static void main(String[] args) {
        /*
        Using a while loop, write a program that prints (on separate lines) the numbers
        between and including 10 and 30 in reverse order

        i.e. the program should print on separate lines: 30 29 28 ... 10.
         */

        int num1 = 30;
        int num2 = 10;

        // the first method:
//        while (true) {
//            System.out.println(num1);
//            num1--;
//            if (num1 < num2) {
//                break;
//            }
//        }

        // the second method:
        while (num1 >= num2) {
            System.out.println(num1);
            num1--;
        }

        //use do-while:
//        do {
//            System.out.println(num1);
//            num1--;
//        } while (num1 >= num2);
    }
}
