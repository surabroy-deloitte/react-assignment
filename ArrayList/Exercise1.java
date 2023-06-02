package ArrayList;

import java.util.ArrayList;
import java.util.*;
public class Exercise1 {
    public static void main(String[] args) {
        List<String>colors=new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Yellow");
        for(String c:colors)
            System.out.println(c);

    }
}
