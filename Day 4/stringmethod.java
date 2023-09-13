public class stringmethod {
    public static void main(String[] args) {
        String name = "Aniket";
        System.out.println(name);

        // int value = name.length();
        // System.out.println(value);

        // String lstring = name.toLowerCase();
        // System.out.println(lstring);

        // String ustring = name.toUpperCase();
        // System.out.println(ustring);

        // String nonTrimString = "        Aniket";
        // System.out.println(nonTrimString);
        // System.out.println(nonTrimString.trim());

        // System.out.println(name.substring(3 ));
        // System.out.println(name.substring(1,4)); // 4 is excluded

        // System.out.println(name.replace('A', 'S'));
        // System.out.println(name.replace("Aniket", "Sanket"));

        // System.out.println(name.startsWith("An"));
        // System.out.println(name.endsWith("An"));
        
        // System.out.println(name.charAt(2));

        // System.out.println(name.indexOf('A'));
        // System.out.println(name.indexOf("ke"));

        // System.out.println(name.lastIndexOf("ket"));

        System.out.println(name.equals("aniket"));      // case sensitive

        System.out.println(name.equalsIgnoreCase("aniket"));      
         
        // Escape sequence characters 
        System.out.println("\nNew Line, \tTab, \'Single quote");
    }
}
