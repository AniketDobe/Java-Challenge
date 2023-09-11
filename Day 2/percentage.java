import java.util.Scanner;

public class percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first subject marks: ");
        int m1 = sc.nextInt();
        System.out.println("Enter second subject marks: ");
        int m2 = sc.nextInt();
        System.out.println("Enter third subject marks: ");
        int m3 = sc.nextInt();
        System.out.println("Enter fourth subject marks: ");
        int m4 = sc.nextInt();
        System.out.println("Enter fifth subject marks: ");
        int m5 = sc.nextInt();
        double sum = m1+m2+m3+m4+m5;
        double percentage = sum/5;
        System.out.println("Percentage: "+percentage);
        

    }
}
