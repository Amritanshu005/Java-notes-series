// Condition statements
public class test {
    public static void main(String[] args) {
       int x =5;
       int y =8;
        //  if (x>y)
        //     System.out.println(x);
        // else
        //     System.out.println(y);
// when there is only one statement in if and else block we can skip the curly braces but it is not a good practice to do so because it can lead to bugs in future when we will add more statements in if and else block
        if (x>y){
            System.out.println(x);
            System.out.println(true);
        }
        else
            System.out.println(y);
    }
}