public class methodoverloading {

    static void msg(){
        System.out.println("Good Morning");
    }

    static void msg(String a){          //parameters are formal parameters
        System.out.println("Good Morning "+a+ " bro!");
    }

    public static void main(String[] args) {
        msg();
        msg("Aniket");      // arguments are actual parameters
    }
}

// we can do mehod overloading by changing the paraeters only
// we can not change the methd return type for method overloading