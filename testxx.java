class Student{
    private int age;  // this age is instance varibale
    private String name;

    public void setAge(int age){  // int age is local variable
        this.age =age;  // this age is instance variable
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name; // local variable
    }
    public int getAge(){
        return age;
    }

}





public class testxx {
    public static void main(String [] args){
        Student obj = new Student();
        obj.setName("Amrit");
        obj.setAge(20);
        System.out.println(obj.getName()+":"+obj.getAge());

    }
    
}



