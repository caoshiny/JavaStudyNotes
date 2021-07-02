import java.util.Date;

import static java.lang.Math.*;

public class ChapterThird {
    public static void main(String[] args) {
        byte b = 127;
        double d = 265165.84;
        String s = "snake/shiny";
        System.out.println(Double.isNaN(b));
        System.out.println(Double.isNaN(d));
        System.out.println(Double.isNaN(Double.NaN));
        System.out.println(9.0/0 == 9.00/0);
        System.out.println("snake/shiny" + '\u2122');
        System.out.println("'a'");
        System.out.println("\u005c\u005c");
        System.out.println("a" + 'b');
        System.out.println('a' + 'b');
        System.out.println(Math.sqrt(4));
        System.out.println(Math.pow(3, 2.5));
        System.out.println(E + PI);
        int x = 1;
        x += 3.5;
        System.out.println(x);
        System.out.println(x + "");
        String all = String.join(" ", "S", "D");
        System.out.println(all);

        String a = "snake/shiny";
        String m = "snake/shiny";
        String n = m.substring(0,1) + "hiny";
        System.out.println(n + n.hashCode());
        System.out.println(a + a.hashCode());
        System.out.println(a == n);
        System.out.println(a.equals(n));

//        Console console = System.console();
//        String username = console.readLine("User Name: ");
//        char[] passwd = console.readPassword("Password: ");
        {
            x = 2;
            System.out.println(x);
        }


        System.out.println(new Date().hashCode());
    }
}
