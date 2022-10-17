import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        int a, b = 23;
//        double c = 23.43434;
//        String imie = "Jan";
//        System.out.println("witaj");
//
//        Scanner input = new Scanner(System.in);
//        a = input.nextInt();
//        System.out.println(a + " + " +b + " = " + (a+b));

//        System.out.println(getName());
//        System.out.println(getAge());
//
        Scanner input = new Scanner(System.in);
//        System.out.println("Podaj a = ");
//        int a = input.nextInt();
//        System.out.println("Podaj b = ");
//        int b = input.nextInt();
//
//        getResult(a, b);

        System.out.println("Podaj x = ");
        int x = input.nextInt();

        System.out.println(czyParzysta(x));

        int z = 12;
        System.out.println(isDividedBy(z));

        double y = 3;
        System.out.println(numPow(y));

        double c = 9;
        System.out.println(numSquare(c));

        Random rand = new Random();

        int h = 3;
        int i = 5;

        int d = rand.nextInt(i-h+1)+h;
        int e = rand.nextInt(i-h+1)+h;
        int f = rand.nextInt(i-h+1)+h;

        System.out.println("Wylosowana liczba to: " + d + " " + e + " " + f);
        System.out.println(validTriangle(d, e, f));

    }
//    public static String getName() {
//        return "Tomek";
//    }
//
//    public static int getAge() {
//        return 21;
//    }
//
//
//    public static void getResult(int a, int b) {
//        System.out.println(a + " + " +b + " = " + (a+b));
//        System.out.println(a + " - " +b + " = " + (a-b));
//        System.out.println(a + " * " +b + " = " + (a*b));
//    }

    public static Boolean czyParzysta(int x) {
        if(x % 2 == 0) {
            return true;
        } else return false;
    }

    public static Boolean isDividedBy(int x) {
        if(x % 3 == 0 && x % 5 == 0) {
            return true;
        } else return false;
    }

    public static double numPow(double x) {
        return Math.pow(x, 3);
    }

    public static double numSquare(double x) {
        return Math.sqrt(x);
    }

    public static Boolean validTriangle(double a, double b, double c) {
        if(a == 0 || b == 0 || c == 0) {
            return false;
        }else {
            if((Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2)) ||
                (Math.pow(a,2) + Math.pow(c,2) == Math.pow(b,2)) ||
                (Math.pow(b,2) + Math.pow(c,2) == Math.pow(a,2))) {
                return true;
            }else return false;
        }
    }

}

