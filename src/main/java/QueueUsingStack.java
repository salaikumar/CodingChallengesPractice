import java.util.Stack;

/*
 * Implementation of a Queue using two Stacks
*/
public class QueueUsingStack<T>{
 private Stack<T> s1;
 private Stack<T> s2;
 public QueueUsingStack(){
   s1 = new Stack<T>();
   s2 = new Stack<T>();
 }

 public void enqueue(T obj){
    s2.push(obj);
 }

 public T deque(){
    while(!s2.empty()){
      s1.push(s2.pop());
    }
    return s1.pop();
 }

 public T top(){
   while(!s2.empty()){
     s1.push(s2.pop());
   }
   return s1.peek();
 }

 public int size(){
   return s1.size()+ s2.size();
 }
}
