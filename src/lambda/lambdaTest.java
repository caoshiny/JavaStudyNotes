package lambda;

import java.util.Arrays;

public class lambdaTest {
    public static void main(String[] args) {
        String[] planets = new String[]{
                "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune" };
        System.out.println(Arrays.toString(planets));
        System.out.print("按字典序排序数组：");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));

        // lambda
        System.out.print("按长度排序数组：");
        Arrays.sort(planets, (first, second) -> first.length() - second.length());
        System.out.println(Arrays.toString(planets));
    }
}
