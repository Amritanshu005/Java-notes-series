 class computer {
    public void playmusic(){
        System.out.println("Music playing...");
    }
    public String GetMePen(int cost){
        if (cost >= 10)
          return "pen";
        
            return "Nothing";
    }



    
}
public class test8 {
    public static void main(String[] args) {
        computer obj = new computer();
        String str = obj.GetMePen(2);
        obj.playmusic();
        System.out.println(str);
        
    }
}
