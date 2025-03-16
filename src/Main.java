public class Main {
    public static void main(String[] args) {
//        Stack stack = new Stack();
//
//
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(2);
//        stack.push(5);
//
//
//        System.out.println(stack.pop()); // Output: 5
//        System.out.println(stack.pop()); // Output: 2
//        System.out.println(stack.pop()); // Output: 3
//
//        System.out.println("");
//
//        System.out.println(stack.peek()); // Output: 1
//        System.out.println(stack.isEmpty()); // Output: false
//
//        stack.push(5);
//        stack.push(6);
//        stack.push(7);
//        stack.push(9);
//        stack.push(4);
//        stack.push(6);
//        stack.push(9);
//        stack.push(3);
//        stack.print();


//        stack.push(3);
//        stack.print();
//        stack.push(3);


       /*
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
        queue.print();

        System.out.println(queue.dequeue()); // Output: 1

        queue.print();
        System.out.println(queue.dequeue()); // Output: 2
        queue.print();


        // Peek at the front element of the queue
        System.out.println(queue.peek()); // Output: 3

        // Check if the queue is empty
        System.out.println(queue.isEmpty()); // Output: false

        queue.print();

        */

//        LinkedList list = new LinkedList();
//        Node firstnode = new Node(8);
//        Node secondnode = new Node(9);
//        Node thirdnode = new Node(5);
//
//        list.addNode(firstnode);
//        list.addNode(secondnode);
//        list.addNode(thirdnode);
//
//        list.printList();
//
//        list.removeNode(thirdnode);
//        list.printList();


        BinaryTree tree = new BinaryTree();

        BinaryNode bnone = new BinaryNode(5);
        BinaryNode bntwo = new BinaryNode(3);
        BinaryNode bnthree = new BinaryNode(2);
        BinaryNode bnfour = new BinaryNode(4);
        BinaryNode bnfive = new BinaryNode(7);
        BinaryNode bnsix = new BinaryNode(1);

        tree.insert(bnone);
        tree.insert(bntwo);
        tree.insert(bnthree);
        tree.insert(bnfour);
        tree.insert(bnfive);
        tree.insert(bnsix);

        System.out.println(tree.root.value);
        System.out.println(tree.root.leftchild.rightchild.value);// should print out 4
        tree.search(5);
        tree.search(4);
        tree.search(8);

    }
}