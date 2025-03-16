public class BinaryTree {
    BinaryNode root;

    public BinaryTree() {

    }

    public void insert(BinaryNode node) {
        if (root == null){
            root = node;
            return;
        }

        BinaryNode current = root;

        while (true) {
            if (node.value <= current.value) {
                if (current.leftchild == null) {
                    current.leftchild = node;
                    return;
                }
                else {
                    current = current.leftchild;
                }
            } else {
                if (current.rightchild == null) {
                    current.rightchild = node;
                    return;
                } else {
                    current = current.rightchild;
                }

            }
        }
    }

    public BinaryNode search(int x) {
        if (root == null) {
            System.out.println("this node is not in the tree");
            return null;
        } else if (root.value == x) {
            System.out.println("this node was found in the tree");
            return root;

        }
        BinaryNode current = root;

        while (current != null) {
            if (x < current.value) {
                if (current.leftchild == null) {
                    System.out.println("this node is not in the tree");
                    return null;
                }

                if (current.leftchild.value == x) {
                    System.out.println("this node was found in the tree");
                    return current;
                }

                else {
                    current = current.leftchild;
                }
            } else {
                if (current.rightchild == null) {
                    System.out.println("this node is not in the tree");
                    return null;
                }
                if (current.rightchild.value == x) {
                    System.out.println("this node was found in the tree");
                    return current;
                }
                else {
                    current = current.rightchild;
                }
            }
        }
        System.out.println("this node is not in the tree");
        return null;
    }


}
