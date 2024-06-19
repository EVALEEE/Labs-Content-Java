package comp1110.lab2;

/**
 * @author EVA LEE
 * @version 1.0
 * @time 26/2/2024 12:08 pm
 */
public class Countries {
    public static void main(String[] args) {
        String[] s = {"Germany", "Argentina", "Netherlands", "Brazil"};
        for (int i = 0; i < s.length; i++) {
            if (!(s[i].equals("Argentina"))) {
                System.out.println(s[i]);
            }
        }
//        System.out.println(s[0]);
//        System.out.println(s[1]);
//        System.out.println(s[2]);
//        System.out.println(s[3]);
    }
}
