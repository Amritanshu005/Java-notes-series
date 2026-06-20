// inner class
class A{
    int age;
    public void show(){
        System.out.println("in show");
    }
// static class B{ 
    // refering to line number -->20
    class B{
        public void config(){
            System.out.println("in config");
        }
    }
}


public class testxxxii {
    public static void main(String [] args){
        A obj = new A();
        obj.show();

        // A.B obj1 = new A.B();
        A.B obj1 = obj.new B();
        obj1.config();



    }
    
}
