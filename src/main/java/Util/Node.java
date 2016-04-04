package Util;

public class Node<Key,Value>{

    public Node<Key, Value> left;
    public Node<Key, Value> right;

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
