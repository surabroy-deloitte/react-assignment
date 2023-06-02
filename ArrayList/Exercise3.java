package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Exercise3 {
    public static void main(String[] args) {
        List<String> colors=new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Yellow");
        for(String c:colors)
            System.out.println(c);

        colors.add(0,"Black");
        System.out.println("After adding element at first");
        for(String c:colors)
            System.out.println(c);

    }
}
