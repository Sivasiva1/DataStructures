class Node1 {
    int data;
    Node1 left;
    Node1 right;

    public Node1(int item) {
        data = item;
        left = right = null;
    }
}

class TreeTraversal {

    static void Postorder(Node1 node) {
        if (node == null) return;
        Postorder(node.left);
        Postorder(node.right);
        System.out.print(node.data + " ");
    }

    static void Preorder(Node1 node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        Preorder(node.left);
        Preorder(node.right);
    }

    static void Inorder(Node1 node) {
        if (node == null) return;
        Inorder(node.left);
        System.out.print(node.data + " ");
        Inorder(node.right);
    }

    public static void main(String[] args) {
        Node1 root = new Node1(2);
        root.left = new Node1(3);
        root.right = new Node1(4);
        root.left.left = new Node1(5);

        System.out.println("Inorder");
        Inorder(root);
        System.out.println("\nPreorder");
        Preorder(root);
        System.out.println("\nPostorder");
        Postorder(root);
    }
}
