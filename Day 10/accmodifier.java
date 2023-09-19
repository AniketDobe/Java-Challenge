class MyEmployee{
    private int id;
    private String name;

    public int getId(){
        return id;
    }
    public void setId(int i){
        // id = i;
        this.id = i;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        // name = n;
        this.name = n;
    }

}

public class accmodifier{
    public static void main(String[] args) {
        MyEmployee emp = new MyEmployee();
        // emp.id= 45;
        // emp.name="Aniket";  --> throws an error due to private access modifier

        emp.setId(5);
        System.out.println(emp.getId());

        emp.setName("Aniket");
        System.out.println(emp.getName());
    }
}