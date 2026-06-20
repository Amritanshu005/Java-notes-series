// Anonymous inner class

class A{
    public void show(){
        System.out.println("in a show");
    }
}



public class testxxxiii {
    public static void main (String [] args){
        A obj = new A(){
            public void show(){
                System.out.println("in new show");
            }
        };
        obj.show();
    }
    
}
