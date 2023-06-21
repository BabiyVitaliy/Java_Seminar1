package Lession4_Seminar;
import java.util.Scanner;
import java.util.Stack;
public class Babiy_JavaSeminar4_HW {

    public static void main(String[] args) {
        String a;


        Scanner in = new Scanner(System.in);
        Stack<String> stack = new Stack<>(); //
        do {
            a = in.next();
            if (!a.equals("print") && !a.equals("revert") && !a.equals("exit")) {
                stack.push(a);
            } else if (a.equals("print")) {
                for (int i=stack.size()-1; i>=0; i--) {
                    System.out.println(stack.elementAt(i));
                }
            } else if (a.equals("revert")) {
                stack.pop();
            }
        } while (!a.equals("exit"));System.out.println(stack);
    }
}
