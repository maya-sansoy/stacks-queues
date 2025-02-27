public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();


        stack.push(1);
        stack.push(2);
        stack.push(3);


        System.out.println(stack.pop()); // Output: 3
        System.out.println(stack.pop()); // Output: 2

        System.out.println("");

        System.out.println(stack.peek()); // Output: 1
        System.out.println(stack.isEmpty()); // Output: false

        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(9);
        stack.push(4);
        stack.push(6);
        stack.push(9);
        stack.push(3);
        stack.print();
//        stack.push(3);
//        stack.print();
//        stack.push(3);


        Queue queue = new Queue();

        // Enqueue elements into the queue
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(2);
        queue.enqueue(5);
        queue.enqueue(2);
        queue.enqueue(7);

        // Dequeue elements from the queue
        System.out.println(queue.dequeue()); // Output: 1
        System.out.println(queue.dequeue()); // Output: 2

        // Peek at the front element of the queue
        System.out.println(queue.peek()); // Output: 3

        // Check if the queue is empty
        System.out.println(queue.isEmpty()); // Output: false

        queue.print();


    }
}