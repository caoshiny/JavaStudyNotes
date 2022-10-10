import java.text.MessageFormat;

public class Test {
    public static void main(String[] args) {
        String name = "曹赛年";
        System.out.println(String.format("我是%s", name));
        System.out.println(MessageFormat.format("我是{0}", name));

        System.getProperties().list(System.out);

        Integer n1 = new Integer(47);
        Integer n2 = new Integer(47);
        System.out.println(n1 == n2);

        int[] arr = new int[]{1, 2, 4, 6, 10};

    }
}
