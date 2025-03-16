public class Node {
    int value;
    Node pointerNext;

    public Node(int value) {
        this.value = value;
    }

    public void assignPointerNext(Node next){
        this.pointerNext = next;
    }
}
