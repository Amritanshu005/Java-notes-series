class A{
    public void show1(){
        System.out.println("in A show");
    }
}

class B extends A{
    public void show2(){
        System.out.println("in B show ");
    }
}
// Typecasting
public class testxxix{
    public static void main(String a[]){
        //    upcasting
        A obj = new B();
        obj.show1();
        // downcasting
        B obj1 = (B) obj;
        obj1.show2();



    }

}