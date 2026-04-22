package LambdaExpression;

import java.util.Arrays;
import java.util.*;
import java.util.List;

public class Practice {

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,20,30,40,50);
        System.out.println(list);

    Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
       Integer max= Collections.max(list);
        System.out.println(max);
        Integer min=Collections.min(list);
        System.out.println(min);
        Collections.shuffle(list);
        System.out.println(list);


    }
}
