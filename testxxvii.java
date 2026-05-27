// final in varibale, method, class
// final class Cal{ --> this will not let extends class Cal 
 class Cal{
    public int add(int n1, int n2){
        return n1+n2;

    }
    // public final  void show(){ --> this will not let overwrite show() method
    public final  void show(){
        System.out.println("By Amrit");
        
    }


}
class AvdCal extends Cal{
    // public void show(){
    //     System.out.println("By John");
    // }

}

public class testxxvii {
    public static void main(String[] args) {
        AvdCal obj = new AvdCal();
        obj.show();
        int r1 = obj.add(4,5);
        System.out.println(r1);

    }
    
}
