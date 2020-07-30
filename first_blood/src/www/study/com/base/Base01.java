package www.study.com.base;
import java.util.*;
public class Base01 {
    public static void main(String[] args) {
        System.out.println("today is:");
        System.out.println(new Date());
        int x = 1, y = 2, z = 3;
        int a = x + y - 2/2 + z; // [1]
        int b = x + (y - 2)/(2 + z); // [2]
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
