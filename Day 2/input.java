import java.util.Scanner;

public class input {
    public static void main(String args[]){
        System.out.println("Taking input from user");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        // int a = sc.nextInt();
        float a = sc.nextFloat();
        System.out.print("Enter number 2: ");
        // int b = sc.nextInt();
        float b = sc.nextFloat();
        float sum = a+b;
        System.out.println(sum);

        boolean bool = sc.hasNextInt();
        System.out.println(bool);

        String str = sc.nextLine();
        System.out.println(str);
    }
}
