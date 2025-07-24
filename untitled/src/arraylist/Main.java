package arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.remove(1);
        System.out.println(list);
    }
}
