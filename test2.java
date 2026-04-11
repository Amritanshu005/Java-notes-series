public class test2 {
    public static void main(String[] args) {
    //    ternary operator
        int n = 4;
        int result = 0;
        // if (n%2==0)
        //     result = 10;
        // else
        //     result = 20;
        // in ternary operator if condition is true use the first value after ? else use the second value after :
        result = n%2==0 ? 10 :20 ;
        System.out.println(result);
    }
}