package LambdaExpression;

public class Java8 {
    public static void main(String[] args) {
            Demo d1=new Demo() {
                @Override
                public void info() {
                    System.out.println("this is my first anonymous class");
                }
            };
            d1.info();


            Demo d2=new Demo() {
                @Override
                public void info() {
                    System.out.println("this is my second anonymous class");
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

                }
            };

            d2.info();

        }
    }


