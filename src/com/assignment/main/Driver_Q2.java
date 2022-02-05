package com.assignment.main;
import com.assignment.model.BSTree;
import com.assignment.model.Node;

public class Driver_Q2 {
    public static void main(String[] args) {

    	BSTree bstree = new BSTree();
    	bstree.setRoot(new Node(50));
    	bstree.getRoot().setLeft(new Node(30));
    	bstree.getRoot().setRight(new Node(60));
    	bstree.getRoot().getLeft().setLeft(new Node(10));
    	bstree.getRoot().getRight().setLeft(new Node(55));

    	bstree.convertToRST2(bstree.getRoot());
    	bstree.print(bstree.getSkewRoot());
    }
}
