
public class Node {
    String route;
    Node prev,next;
    public Node(Node next,Node prev,String route){
        this.next= next;
        this.prev=prev;
        this.route=route;
    }
    public Node(String route){
        this(null,null,route);
    }
    
    
}
