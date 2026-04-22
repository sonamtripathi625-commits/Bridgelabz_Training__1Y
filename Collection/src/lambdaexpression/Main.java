package lambdaexpression;

import java8.Demo;

public class Main {
    public static void main(String[] args) {

        Demo d1= ()->
        {
            System.out.println("This is im first lambda expression");
            int a=20,b=10;
            int c=a+b;
            int d=a-b;
            int g=a*b;
            double e=a/b;
            int f=b%a;
            System.out.println(c);
            System.out.println(d);
            System.out.println(e);
            System.out.println(f);
            System.out.println(g);

        };

        d1.info();

    }
}
