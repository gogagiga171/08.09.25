import java.util.Stack;

class Main
{
    public static void main()
    {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
    }
}