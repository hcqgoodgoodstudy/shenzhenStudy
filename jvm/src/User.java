import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class User {
    public static void main(String[] args) {
        List list=new ArrayList(3);
           list.add(1);
        Iterator iterator = list.iterator();
        for (Object o : list) {
            while(iterator.hasNext()){
                System.out.println(2);
            }
        }
    }
}
