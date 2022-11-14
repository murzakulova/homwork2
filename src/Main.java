import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int one = scanner.nextInt();
        int two;
        a(one);
        two = scanner.nextInt();
        a(two);
    }
    public static void a(int a) {
        if (a > 999 || a < -999) {
            System.out.println(0);
        } else if (a<0) {
            String str = String.valueOf(a);
            char[]win = new char[a];
            for (int i = win.length -1; i >=0 ; i--) {
                System.out.println(win[i]);
            }
    } else {
        int one = (a / 100) % 10;
        int two = (a / 10) % 10;
        int three = a % 10;
        System.out.println(three + "" + two + "" + one);
        }
    }


         }


