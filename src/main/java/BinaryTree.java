import Util.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * A Simple Implementation of Binary Tree for Practice
 */
public class BinaryTree<Key,Value> {

    public Node<Key, Value> root;
    public BinaryTree(Key key, Value value) {
        this.root = new Node<Key, Value>(key, value);
    }
    public void insert(Key key, Value value) {
        Node<Key, Value> newNode = new Node<Key, Value>(key,value);
        if (root == null) {
            root = newNode;
        }
        else{
            Node currentNode = root;
            while( true ){
                if ( currentNode == null){
                    currentNode =  newNode;
                    break;
                }
                else if ( currentNode.left == null || currentNode.right == null){
                    if (currentNode.left == null)
                        currentNode.left = newNode;
                    else
                        currentNode.right = newNode;
                    break;
                }
                else{
                    currentNode = height(currentNode.left) < height(currentNode.right) ? currentNode.left : currentNode.right;
                }
            }
        }
    }

    public int height(Node root) {
        if (root== null)
            return 0;
        int leftSubtreeHeight  = height(root.left);
        int rightSubtreeHeight = height(root.right);
        return leftSubtreeHeight > rightSubtreeHeight ? leftSubtreeHeight + 1: rightSubtreeHeight + 1;
    }

    public List<Node> levelOrderTraversal(){
        return null;
    }

    public List<Node> depthOrderTraversal(){
        return null;
    }

    public List<Node<Key,Value>> inOrderTraversal(Node root){
        return null;
    }

    public List<Node> preOrderTraversal(){
        return null;
    }

    public List<Node> postOrderTraversal(){
        return null;
    }
}
