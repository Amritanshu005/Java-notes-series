// interface

interface  A{
    void show(); // methods show&config
    void config();
    // final & static
    int age=44;
    String area="Mumbai";
}

interface X{
    void run();
}

interface Y extends X{

}

// A single class can handle multiple interface

// class B implements A,X{
class B implements A,Y{
    public void show(){
        System.out.println("in show");
    }
    public void config(){
        System.out.println("in config");
    }
    public void run(){
        System.out.println("running....");
    }
}

public class testxxxv {
    public static void main(String [] args){
        A obj;
        obj = new B();
        obj.show();
        obj.config();

        X obj1;
        obj1= new B();
        obj1.run();

        // A.area="hyderabad"; it will not work

        System.out.println(A.area);
        System.out.println(A.age);


    }    
}
