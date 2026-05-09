public class testxvii {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Navin");
        System.out.println(sb.capacity()); // capacity is 16bytes
        System.out.println(sb.length());
        sb.append(" Tiwari");
        System.out.println(sb); // this is of type StringBuffer

        String str = sb.toString();
        System.out.println(str); // this is of type string

        //sb.delete(1, 2);
        //sb.insert(5," Java");
        System.out.println(sb);



    }
}
    

