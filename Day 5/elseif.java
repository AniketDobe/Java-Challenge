import java.util.Scanner;

public class elseif {
    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        // if(age>56){
        //     System.out.println("Ypu are experiencecd!");
        // }
        // else if(age>46){
        //     System.out.println("You are semi experience!");
        // }
        // else if(age>36){
        //     System.out.println("You are semi semi experience!");
        // }
        // else {
        //     System.out.println("You are not experience!");
        // }

        switch(age){
            case 18: 
                System.out.println("You are going to adult");
                break;
            case 23: 
                System.out.println("You are going to job");
                break;
            case 60: 
                System.out.println("You are going to get retired");
                break;
            default:
                System.out.println("Enjoy your life");
                
        }
    }
}


// switch is also work with the char datatype