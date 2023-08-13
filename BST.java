import java.lang.*;
import java.io.*;
import java.util.*;

public class BST {
    double count = 0;

    private static class Node {
        Node left;
        Node right;
        int value;
        int height;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    private Node root;

    public BST() {

    }

    public int height(Node node) {
        if (node == null) {
            return -1;
        } else {
            return node.height;
        }
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void populate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            insert(nums[i]);
        }
    }

    public void insert(int value) {
        root = insert(value, root);
    }

    private Node insert(int value, Node node) {
        if (node == null) {
            node = new Node(value);
            return node;
        }
        if (value < node.value) {
            node.left = insert(value, node.left);
        }
        if (value > node.value) {
            node.right = insert(value, node.right);
        }
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return node;
    }

    public void isBalanced() {
        isBalanced(root);
    }

    private boolean isBalanced(Node node) {
        int h1 = height(node.left);
        int h2 = height(node.right);

        return Math.abs(h1 - h2) <= 1 && isBalanced(node.left) && isBalanced(node.right);
    }

    public void display() {
        display(root, "Root node");
    }

    private void display(Node node, String details) {
        if (node == null) {
            return;
        }
        System.out.println(details + node.getValue());
        display(node.left, "left node of: " + node.getValue() + "\t");
        display(node.right, "right node of: " + node.getValue() + "\t");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BST bst = new BST();
        int[] nums = { 15, 12, 20, 8, 13, 17, 24, 7, 18, 19 };
        bst.populate(nums);
        bst.display();
        bst.isBalanced();

        // System.out.println(bst.height(root));
    }
}
