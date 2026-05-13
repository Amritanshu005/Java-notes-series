class Student{
    private int age;
    private String name;

    public Student() // default constructor
    {
        age=15;
        name="Java";
    }
    public Student(int age, String name){ // parametrized constructor
        this.age=age;
        this.name=name;
    }

    public Student(String name) { // obtained from source action
        this.name = name;
    }

    public Student(int age) {
        this.age = age;
    }

    public void setAge(int age){
        this.age=age;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
}




public class testxxi {
    public static void main(String[] args) {
        Student obj= new Student();
        Student obj1 = new Student(20, "Amrit");
        System.out.println(obj.getName()+":"+obj.getAge()); // here it prints default value as set in constructor
        // obj.setAge(20);
        // obj.setName("Amrit");
        System.out.println(obj1.getName()+":"+obj1.getAge());

    }
}
    

