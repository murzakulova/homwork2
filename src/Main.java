import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int one = scanner.nextInt();
      minus(one);
    }
    public static void minus(int a){
        int []array ={a};
        for (int i = array.length ; i <=0; i++) {
            System.out.print(array[i]);

        }
    }

}