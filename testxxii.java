class Mobile{
    String brand;
    int price;
    static String name; // static make it comman for all
    
    public void show(){
        System.out.println(brand+" : "+price+" : "+name);
    }
}
public class testxxii {
    public static void main(String[] args) {
        Mobile obj=new Mobile();
        obj.brand="Realme";
        obj.price=27000;
        Mobile.name="SmartPhone"; // static medthod should be call by its class name 
        // Mobile.name;

        Mobile obj1=new Mobile();
        obj1.brand="Apple";
        obj1.price=70000;
        Mobile.name="SmartPhone";

        Mobile obj2=new Mobile();
        obj2.brand="Samsung";
        obj2.price=50000;
        Mobile.name="SmartPhone";

        Mobile.name="Phone";



        obj.show();
        obj1.show();
        obj2.show();
    }
}
    

