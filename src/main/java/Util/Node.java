package Util;

/**
 * Created by salaikumar on 3/4/16.
 */
public class Node<Key,Value>{

    Node<Key, Value> left;
    Node<Key, Value> right;

    Key key;
    Value value;

    public Node(Key key,Value value){
        this.key = key ;
        this.value = value;
    }

    public Key key(){
        return key;
    }

    public Value value(){
        return value;
    }

    public void updateValue(Value value){
        this.value = value;
    }
}
