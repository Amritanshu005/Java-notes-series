class A {  // a class
    public A (){   // a method
        super(); // default
        System.out.println("in A");
    }
    public A(int n){
        super(); // specifed version
        System.out.println("int in A");
    }

}
class B extends A{
    public B(){
        super(); // super is already there no need to specify 
        System.out.println("in B");
    }
    public B(int n){
        // super(n); // but when we need to bring something else rather than default .... we specify
        // System.out.println("int in B");

        this();
        System.out.println("int in B");
    }
}


public class testxxiii {
    public static void main(String[] args) {
        B obj = new B(5);
    }
}
    

//      java testxxiii.java
// in A
// in B
//      java testxxiii.java
// in A
// int in B
//       java testxxiii.java
// in A
// int in B
//        java testxxiii.java
// int in A
// int in B
//        java testxxiii.java
// int in A
// in B
//        java testxxiii.java
// in A
// in B
// int in B
