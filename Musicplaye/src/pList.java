
public class pList {
    Node head,tail;
    private String route;
    public pList(){
        this.head=tail=null;
    }
    public  boolean isEmpty(){
        this.head=null;
        return true;
    }
    public String topEl(){
        return this.head.route;
    }
    public void addpList(String route){
        Node node=new Node(route);
        
        if(!isEmpty()){
            this.tail.next=node;
            node.prev=this.tail;
            this.tail=node;
        }
        else{
            this.head=this.tail=node;
        }
        
       
            
        }
    }
    
   
            
        
        
    



    
    
       
