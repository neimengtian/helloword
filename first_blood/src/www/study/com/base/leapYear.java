package www.study.com.base;

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String name = sc.nextLine();
        //System.out.println(name);
        int year = sc.nextInt();
        System.out.println(year);
        if (year<=0){
            System.out.println("game over");
        }
        if (year%4==0&&year%100!=0||year%400==0){
            System.out.println("is leap year");
        }else{
            System.out.println("not leap year");
        }


    }
}
