package WrapperClasses;

public class Question5 {
  public void utilityMethods(){

     int a= Integer.parseInt("123");
    double b=  Double.parseDouble("3.14");
     boolean c=Boolean.parseBoolean("true");
      String d=Integer.toBinaryString(10);
      boolean e=Character.isDigit('5');
     char f= Character.toUpperCase('a');

      System.out.println("print for result first="+a);
      System.out.println("print for result second="+b);
      System.out.println("print for result third="+c);
      System.out.println("print for result forth="+d);
      System.out.println("print for result fifth="+e);
      System.out.println("print for result sixth="+f);
  }
    public static void main(String[] args){
        Question5 q5=new Question5();
        q5.utilityMethods();
    }
}
