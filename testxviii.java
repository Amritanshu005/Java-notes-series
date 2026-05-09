class Human{
    private int age =11;
    private String name ="Amrit";

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
}
public class testxviii {
    public static void main(String[] args) {
      Human obj = new Human();
    //   obj.name="Amrit";
    //   obj.age=20;

      System.out.println(obj.getName() +":"+ obj.getAge());

    }
}
    

