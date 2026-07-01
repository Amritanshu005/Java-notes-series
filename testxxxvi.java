class Laptop{
    public void code(){
        System.out.println("code, compile, run");
    }

}
class Developer{
    public void devApp(Laptop lap){
        lap.code();
    }
}



public class testxxxvi {
    public static void main(String[] args) {
        Laptop lap = new Laptop();

        Developer amrit = new Developer();
        amrit.devApp(lap);
    }
}
    

