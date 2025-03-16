public class LinkedList {
    Node head = null;

    public LinkedList() {

    }

    public void addNode(Node node) {
        if (head == null) {
            head = node;
        }
        else {
            getLast().pointerNext = node;

        }
    }

    public void removeNode(Node node) {
        if (head == null) {
            System.out.println("linked list is empty");
        }
        else {
            Node currentnode = head;
            if (head==node) {
                head = head.pointerNext;
            }
            while (currentnode.pointerNext != null) {
                if (currentnode.pointerNext == node) {
                    currentnode.pointerNext = currentnode.pointerNext.pointerNext;
                    return;
                }
                currentnode = currentnode.pointerNext;
            }
        }
    }

    public Node getLast(){
        if (head == null) {
            System.out.println("linked list is empty");
            return null;
        }
        else {
            Node current = head;
            while (current.pointerNext != null) {
                current = current.pointerNext;
            }
            return current;
        }
    }

    public void printList() {
        Node current = head;
        System.out.print("{");
        while (current.pointerNext != null) {
            System.out.print(current.value + ", ");
            current = current.pointerNext;
        }
        System.out.println(current.value + "}");
    }


    public Node find(int x){
        Node current = head;
        while (current.pointerNext != null) {
            if (current.value == x) {
                System.out.println(x + " was found in the linked list");
                return current;
            }
        }
        System.out.println(x + " was not found in the linked list");
        return null;
    }


}
