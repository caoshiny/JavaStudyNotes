import sun.plugin.dom.css.CSSStyleDeclaration;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.net.URL;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;

public class ChapterFirst {
    public static void main(String[] args) {
        int a = 2147483647;
        int b = -2147483648;
        System.out.println(a + b);
        URL url1 = ChapterFirst.class.getResource("snake/shiny/1.txt");
        System.out.println(ChapterFirst.class.getAnnotatedSuperclass());
        System.out.println(url1.toString());
        String $a = "asda";
        System.out.println($a);

        BigDecimal bigDecimal = new BigDecimal(12313);
        System.out.println(bigDecimal);
        System.out.println(bigDecimal.multiply(BigDecimal.valueOf(10)));

        String[] ss = new String[10];
        for(int i=0; i < ss.length; i++){
            System.out.println(ss[i]);
        }

        for (String s : ss) {
            System.out.println(s);
        }

        int[] smallPrimes = {1, 2, 3, 4, 5};
        System.out.println(smallPrimes.toString() + Arrays.toString(smallPrimes) + smallPrimes.hashCode());
        System.out.println(smallPrimes.getClass().getName());

        int[] bigPrimes = Arrays.copyOf(smallPrimes, 2 * smallPrimes.length);
        System.out.println(Arrays.toString(bigPrimes));
        System.out.println(smallPrimes.hashCode());

        System.out.println(smallPrimes.length);
        smallPrimes = new int[]{3, 5, 2, 1, 4, 6};
        System.out.println(Arrays.toString(smallPrimes) + smallPrimes.hashCode());
        Arrays.sort(smallPrimes);
        System.out.println(Arrays.toString(smallPrimes));

        int[][] balance = new int[][]{{1,2,3},{1,2,3}};
        System.out.println(Arrays.deepToString(balance));
        System.out.println(Arrays.toString(balance));
        for(int[] b1 : balance)
            for (int b2: b1)
                System.out.println(b2);

        String[][] strings = new String[12][];

        Date date = new Date();
        System.out.println(date);
        System.out.println(date.toString());
        System.out.println(ChapterFirst.class.getAnnotatedSuperclass().getClass().getName());
        System.out.println(new Date().hashCode());
        System.out.println(new Date().hashCode());

        System.out.println(LocalDate.now());

        LocalDate myDate = LocalDate.of(1997, 12, 8);
        System.out.println(myDate);

        LocalDate ld = myDate.plusDays(10000);
        System.out.println(ld);
        System.out.println(ld.getDayOfWeek());
        System.out.println(myDate.getDayOfWeek());
    }
}
