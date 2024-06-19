package comp1110.lab5;

import java.util.Scanner;

/**
 * @author EVA LEE
 * @version 1.0
 * @time 18/3/2024 1:36 pm
 */

@SuppressWarnings("all")
public class HeadsOrTails {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);

        label1:
        while (true) {
            char c = scanner.next().charAt(0);
            if (!(c == 'h' || c == 't' || c == 'd')) {
                System.out.println("Unexpected input");
            } else if (c == 'd') {//exist
                break label1;
            }

            Dice coin = new Dice(1, 6);
            num = coin.rollDice();
            if (num >= 1 && num <= 3 && c == 'h') {//head
                System.out.println("Good guess!" + " " + num);
            } else if (num > 3 && num <= 6 && c == 't') {//tale
                System.out.println("Good guess!"+ " " + num);
            } else {
                System.out.println("Bad luck!"+ " " + num);
            }
        }
    }
}
