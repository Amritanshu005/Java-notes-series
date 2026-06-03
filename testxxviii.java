
import java.util.Objects;

class Laptop{
    String model;
    int price;

    public String toString(){
        return model +":"+ price;
    }
    // left click source action--> generate hashcode and eqauls

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.model);
        hash = 79 * hash + this.price;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Laptop other = (Laptop) obj;
        if (this.price != other.price) {
            return false;
        }
        return Objects.equals(this.model, other.model);
    }

}

public class testxxviii{
    public static void main(String[] args)
    {
        Laptop obj = new Laptop();
        obj.model = "lenvo Yoga";
        obj.price = 1000;

        // System.out.println(obj.toString());
        System.out.println(obj);
    }
}