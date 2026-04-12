package WrapperClasses;

import java.util.ArrayList;

public class Question7 {
    public static void main(String[]args){
        ArrayList<Double> list=new ArrayList<>();

        double[] prices ={10.5,20.0,35.75,5.5};

        for (double p : prices) {
            list.add(p);
        }


        double max= list.get(0);
        for (double price : list) {
            if (price > max) {
                max = price;
            }
        }
        double sum = 0;

        for (double price : list) {
            sum += price;
        }

        double avg = sum / list.size();

        System.out.println("Highest Price: " + max);
        System.out.println("Average Price: " + avg);
    }

}
