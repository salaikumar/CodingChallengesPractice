import Util.Node;

import java.util.List;

/**
 * A Simple Implementation of Binary Tree for Practice
 */
public class BinaryTree<Key,Value> {
    Node<Key,Value> root;

    public BinaryTree(Key key,Value value){
        this.root = new Node<Key, Value>(key,value);
    }

    public void insert(Key key,Value value){
        // Check if root is present
        if (root == null){
            root = new Node<Key, Value>(key,value);
            return;
        }

        // If node with key already present, update the value
        if (hasKey(key)){
            Node existingNode = getNode(key);
            existingNode.updateValue(value);
        }

        // put the node into the tree

    }

    private boolean hasKey(Key key) {
        return false;
    }

    public void delete(Key key){

    }

    public Value find(Key key){
        return null;
    }

    public List<Node> inOrder(){
        return null;
    }

    public List<Node> preOrder(){
        return null;
    }

    public List<Node> postOrder(){
        return null;
    }

    public Node<Key,Value> getNode(Key key){
        return null;
    }
}

