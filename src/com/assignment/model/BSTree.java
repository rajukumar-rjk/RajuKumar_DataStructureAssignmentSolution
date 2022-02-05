package com.assignment.model;

public class BSTree {
    Node root;
    Node skewRoot, current;

    public Node getRoot() {
        return root;
    }

    public Node getSkewRoot() {
        return skewRoot;
    }

    public void setRoot(Node root) {
        this.root = root;
    }


    public void convertToRST2(Node root) {
        if (root == null) {
            return;
        }

        convertToRST2(root.left);
        if (skewRoot == null) {
            skewRoot = root;
            root.left = null;
            current = root;
        }else {
            current.right = root;
            root.left = null;
            current = current.right;
        }
        convertToRST2(root.right);
    }


    public void print(Node root) {
        if (root == null) {
            return;
        }

        print(root.left);
        System.out.print(root.key + " ");
        print(root.right);
    }

}
