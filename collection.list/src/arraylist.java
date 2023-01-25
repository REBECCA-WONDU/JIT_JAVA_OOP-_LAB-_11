import java.util.ArrayList;
import java.util.ListIterator;

class  Main{
    public static void main(String[] args){
        ArrayList <String> city=new ArrayList<>();
        city.add("Addis ABABA");
        city.add("HAWASSA");
        city.add("JIMMA");
        ListIterator<String> iterate=city.listIterator();
        System.out.println("the cities are:" + city);
        iterate.next();
        iterate.next();
        String village=iterate.previous();
        System.out.println("the previous city was:" + village);
    }
}