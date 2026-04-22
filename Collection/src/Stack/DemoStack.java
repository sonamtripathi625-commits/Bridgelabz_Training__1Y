package Stack;

import java.util.LinkedList;
import java.util.Stack;

public class DemoStack {
    public static void main(String[] args) {
        Stack<String> Stack=new Stack<>();
        Stack.push("riya");
        Stack.push("sonam");
        Stack.push("jyoti");

        System.out.println(Stack);

        String s1=Stack.peek();
        System.out.println(s1);

        String s2=Stack.pop();
        System.out.println("remove the top element="+s2);

        System.out.println(Stack);


        LinkedList<String> ll= new LinkedList<>();
        ll.push("ram");
        ll.push("shaam");
        ll.push("gita");
        ll.push("sita");
        System.out.println(ll);

        String s3=ll.peek();
        System.out.println(s3);

        String s4=ll.pop();
        System.out.println("remove the top element="+s4);
    }
}
