// Method overloading
class calculator{
    public int add(int n1, int n2){
        return n1 +n2 ;
    }
    public int add(int n1, int n2, int n3){
        return n1+ n2+ n3;
    }
    public double add(int n1, double n2, int n3){
        return n1 +n2 +n3 ;
    }

}
public class testx {
    public static void main(String[] args) {
        calculator x = new calculator();
        int r =  x.add(1, 2, 5);
        System.out.println(r);

    }
}
