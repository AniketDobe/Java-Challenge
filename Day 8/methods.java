public class methods {

    static int logic(int x, int y) {
        int z;
        if (x > y) {
            z = (x + y);
        } else {
            z = (x + y) * 5;
        }
        return z;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c;
        // method invocation using object creation
        // methods obj = new methods();
        // c = obj.logic(a, b);
        c = logic(a, b);
        // if(a>b){
        // c = (a+b);
        // }
        // else{
        // c = (a+b) * 5;
        // }

        int a1 = 15;
        int b1 = 7;
        int c1;
        c1 = logic(a1, b1);
        // c1 = obj.logic(a1, b1);
        // if(a1>b1){
        // c1 = (a1+b1);
        // }
        // else{
        // c1 = (a1+b1) * 5;
        // }
        System.out.println(c);
        System.out.println(c1);
    }
}


// static method in static class create otherwise it will give an error
// static class having only static methods

// another way if we not declare a static method then it object we have to create