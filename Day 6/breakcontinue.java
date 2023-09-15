public class breakcontinue {
    public static void main(String[] args) {
        int i=0;
        // break and continue using loops
        // for(i=0; i<5; i++){
        //     System.out.println(i);
        //     System.out.println("Java is great");
        //     if(i==2){
        //         System.out.println("Ending loop");
        //         break;
        //     }
        // }

        
        // do{
        //     System.out.println(i);
        //     System.out.println("Java is great");
        //     if(i==2){
        //         System.out.println("Ending loop");
        //         break;
        //     } 
        //     i++;
        // }while(i<5);


        // for(i=0; i<5; i++){
        //     if(i==2){
        //         System.out.println("Ending loop");
        //         continue;
        //     }
        //     System.out.println(i);
        //     System.out.println("Java is great");
        // }

        do{
            i++;
            if(i==2){
                System.out.println("Ending loop");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is great"); 
        }while(i<5);

    }
}
