import java.util.ArrayList;

public class Queue {
    //ArrayList<> queue = new ArrayList<>();
    Integer[] queue = new Integer[10];
    int counter = 0;

    public Queue() {
    }

    public boolean isEmpty() {
        boolean isempty = true;
        for (int i = 0; i < 10; i++) {
            if (queue[i] != null) {
                isempty = false;
            }
        }
        return isempty;
    }

    public void enqueue(Integer x) {
        if (counter < 10) {
            queue[counter] = x;
            counter++;
        }
        else {
            System.out.println("overflow! cannot exceed more than 10 items");
        }
    }

    public Integer dequeue() {
        Integer num = 0;
        Integer hold;
        if (counter == 0) {
            System.out.println("queue is empty");
            num = -1;
        } else {
            num = queue[0];
            queue[0] = null;

        }

        for (int i = 0; i<counter; i++)  {
            hold = queue[i + 1];
            queue[i] = hold;
        }

        counter--;
        return num;
    }

    public Integer peek() {
        if (this.isEmpty()) {
            return -1;
        }
        else {
            return queue[0];
        }

    }

    public void print() {
        System.out.print("[");

        for (int i = 0; i<counter; i++) {
            if (i == counter-1) {
                System.out.print(queue[i]);
            }
            else {
                System.out.print(queue[i] + ", ");
            }

        }
        System.out.println("]");
    }

}
