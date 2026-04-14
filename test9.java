class calculator{
    public int add(int n1, int n2)
    {
        return n1 + n2;
    }
}

public class test9 {
    public static void main(String[] args) {
        calculator obj = new calculator();
        int r = obj.add(1,2);
        System.out.println(r);
    }
}