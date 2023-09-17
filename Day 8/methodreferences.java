public class methodreferences {

    // static void change(int a){
    //     a = 90;
    // }

    static void change2(int []arr){
        arr[0] = 98;
    }

    static void msg(){
        System.out.println("Hey Good morning!");
    }


    public static void main(String[] args) {
        // msg();

        // case 1: changing the integer
        // int x= 45;
        // change(x);
        // System.out.println("After returning x :"+x);

                
        // case 1: changing the Array
        int [] marks = {52,78,65,48,98};
        change2(marks);
        System.out.println("After returning array :"+marks[0]);

    }
}
