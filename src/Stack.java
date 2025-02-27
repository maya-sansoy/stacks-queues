import java.util.ArrayList;

public class Stack {
    ArrayList<Integer> stack = new ArrayList<>();

    public Stack() {

    }

    public void push(int x) {
        if (stack.size() < 10) {
            stack.add(x);
        }
        else {
            System.out.println("stack overflow! cannot exceed more than 10 items");
        }

    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int pop() {
        int num = -1;
        if (!stack.isEmpty()) {
            num = stack.getLast();
            stack.remove(stack.getLast());
        }

        return num;
    }

    public int peek() {
        int num = -1;
        if (!stack.isEmpty()) {
            num = stack.getLast();
        }

        return num;
    }

    public void print() {

        System.out.print("[");


        for (int i = 0; i<stack.size(); i++) {
            if (i == stack.size()-1) {
                System.out.print(stack.get(i));
            }
            else {
                System.out.print(stack.get(i) + ", ");
            }

        }
        System.out.println("]");

    }

    public void clear() {
        while (!stack.isEmpty()) {
            stack.remove(stack.getLast());
        }
    }


}

