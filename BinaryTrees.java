import java.io.*;
import java.util.*;

public class BinaryTrees {
    public BinaryTrees() {

    }

    private static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    // inserting elements
    public void populate(Scanner scanner) {
        System.out.println("enter the root node: ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);

    }

    private void populate(Scanner scanner, Node node) {
        System.out.println("Do you want to add left of: " + node.value);
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("enter the value of left of: " + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }
        System.out.println("Do you want to add the right of: " + node.value);
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("enter the value of right of: " + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }

    public void display() {
        display(this.root, "");
    }

    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    public void preOrderTraversal() {
        preOrderTraversal(root);
    }

    private void preOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + "--->");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    public void inOrderTraversal() {
        inOrderTraversal(root);
    }

    private void inOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        inOrderTraversal(node.left);
        System.out.print(node.value + "--->");
        inOrderTraversal(node.right);
    }

    public void postOrderTraversal() {
        postOrderTraversal(root);
    }

    private void postOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.value + "--->");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTrees tree = new BinaryTrees();
        tree.populate(scanner);
        tree.display();
        System.out.println("preorder traversal");
        tree.preOrderTraversal();
        System.out.println("inorder traversal");
        tree.inOrderTraversal();
        System.out.println("postorder traversal");
        tree.postOrderTraversal();

    }

}