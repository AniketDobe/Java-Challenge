public class varargs {

    // static int sum(int a, int b){
    // return a+b;
    // }

    // static int sum(int a, int b, int c){
    // return a+b;
    // }

    // static int sum(int a, int b, int c, int d){
    // return a+b;
    // }

    static int sum(int... arr) {
        // available as int []arr;
        int result = 0;
        for (int element : arr) {
            result += element;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to varargs session");
        System.out.println("the sum of Nothing is : " + sum());
        System.out.println("the sum of 4 and 5 is : " + sum(4, 5));
        System.out.println("the sum of 4, 3 and 5 is : " + sum(4, 3, 5));
        System.out.println("the sum of 2, 4, 3 and 5 is : " + sum(2, 4, 3, 5));

    }

}

    // the var arg method need zero or more parameters
    // if 1 argument is necessary the we have to add explicitly are as follows
            // static int sum(int a, int ...arr){
            //     int result = a;
            //     for(int element: arr){
            //         result+=element;
            //     }
            //     return result;
            // }