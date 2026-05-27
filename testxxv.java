class Cal{
    public int add(int n1, int n2){
    return n1+n2;
    }
}
class Acal extends Cal{
    public int add(int n1, int n2){
        return n1+n2+1;
    }
}

public class testxxv {
    public static void main(String[] args) {
        Acal obj = new Acal();
        int r1 = obj.add(4,7);
        System.out.println(r1);
    }}
    
//     java testxxv.java
// 11
//      java testxxv.java
// 12