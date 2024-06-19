package comp1110.lab2;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

/**
 * @author EVA LEE
 * @version 1.0
 * @time 26/2/2024 12:39 pm
 */
public class Triangle {
    public static void main(String[] args) {

        //read in from the console an integer which represents the height (in characters) of the triangle
        Scanner scanner = new Scanner(System.in);
//        System.out.println("input the height of the Triangle~");
        int height = scanner.nextInt();

        //create a Two-dimensional array
        char[][] chars = new char[height][(height * 2) - 1];

        //put '*' into the certain position
        for (int i = 0; i < height - 1; i++) {
            for (int j = 0; j < ((height * 2) - 1); j++) {
                chars[i][height - 1 - i] = '*';
                chars[i][height - 1 + i] = '*';
            }
        }
        for (int i = 0; i < ((height * 2) - 1); i++) {
            chars[height - 1][i] = '*';
        }

        //remove the empty-character from the array[][]
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < ((height * 2) - 1); j++) {
                if (chars[i][j] == '\0') {
                    chars[i][j] = ' ';
                }
            }
        }

        //print the array[][]:
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < ((height * 2) - 1); j++) {
                System.out.print(chars[i][j]);
            }
            System.out.println();
        }
    }
}