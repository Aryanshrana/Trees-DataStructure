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

    public void prettydisplay() {
        prettydisplay(this.root, 0);
    }

    private void prettydisplay(Node node, int count) {
        if (node == null) {
            return;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTrees tree = new BinaryTrees();
        tree.populate(scanner);
        tree.display();
        tree.prettydisplay();

    }

}