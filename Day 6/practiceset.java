public class practiceset {
    public static void main(String[] args) {
    // Practice Problem 1
    //    int n = 4;
    //    for (int i=n; i>0; i--){
    //        for(int j=0;j<i;j++){
    //            System.out.print("*");
    //        }
    //        System.out.print("\n");
    //    }

        // Practice Problem 2
//        int sum=0;
//        int n=4;
//        for(int i=0;i<n;i++){
//            sum = sum + (2*i);
//        }
//        System.out.print("Sum of even numbers is: ");
//        System.out.println(sum);
        // First 4 even numbers are - 0 2 4 6

        // Practice Problem 3
//        int n = 5;
//        //for(int i=0; i<10; i++) - Goes from i=0 to i=9
//        for(int i=1;i<=10;i++){
//            System.out.printf("%d X %d = %d\n", n, i, n*i);
//        }

        // Practice Problem 4
//        int n = 10;
//        //for(int i=0; i<10; i++) - Goes from i=0 to i=9
//        for(int i=10;i>=1;i--){
//            System.out.printf("%d X %d = %d\n", n, i, n*i);
//        }

        // Practice Problem 6
//        int n = 5;
//        // What is factorial n = n * n-1 * n-2 ..... 1
//        // 5! = 5*4*3*2*1 = 120
//        int i = 1;
//        int factorial = 1;
//        while(i<=n){
//            factorial *= i;
//            i++;
//        }
//        System.out.println(factorial);

        // Practice Problem 9
       int n = 8;
       int sum = 0;
       //for(int i=0; i<10; i++) - Goes from i=0 to i=9
       for(int i=1;i<=10;i++){
           sum += n*i;
       }
       System.out.println(sum);

    }
}
