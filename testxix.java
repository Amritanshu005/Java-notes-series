class Student{
    private int age;
    private String name;

    public void setAge(int a){
        age=a;
    }
    public int getAge(){
        return age;
    }
    
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
}

public class testxix{
    public static void main(String[] args) {
        Student obj = new Student();
        obj.setAge(30);
        obj.setName("Tiwari");
        System.out.println(obj.getName()+":"+obj.getAge());



    }
}

