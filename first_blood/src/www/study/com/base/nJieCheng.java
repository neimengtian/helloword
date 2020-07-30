package www.study.com.base;
import java.util.*;
import java.math.*;

    public class nJieCheng {
        public static void main(String[] args) {
            System.out.println(factorial(100));
        }
        public static String  factorial(int count) {
            BigInteger result = new BigInteger(String.valueOf(1));
            for (int i = 1; i <= count; i++) {
                BigInteger i_value = new BigInteger(String.valueOf(i));
                result = result.multiply(i_value);
            }
            return result.toString();
        }
    }
