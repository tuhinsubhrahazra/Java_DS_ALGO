package com.company.tree;

import java.util.*;
import java.io.*;
import java.lang.*;

class node
{
    int key;
    node left;
    node right;
    node(int k){
        key=k;
        left=right=null;
    }
}

public class sampleCode {
    public static void main(String args[])
    {
        node root=new node(10);
        root.left=new node(20);
        root.right= new node(30);
        root.right.left=new node(40);
        root.right.right=new node(50);

        inorder(root);
    }
    public static void inorder(node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.key+" ");
            inorder(root.right);
        }
    }
}
