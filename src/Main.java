import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
a(scanner.nextInt());




    }
   public  static void a(int a){
   if (a>999 || a<-999){
       System.out.println(0);


       }


        int one = scanner.nextInt();
      minus(one);
    }
    public static void minus(int a){
     int one = (a/100)%10;
     int two = (a/10)%10;
     int three = a%10;
        System.out.println(three+""+two+""+one);
    }

       }
}