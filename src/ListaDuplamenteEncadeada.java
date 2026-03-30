public class ListaDuplamenteEncadeada {


    NodeString head;
    NodeString tail;

    public ListaDuplamenteEncadeada(){
 
        this.head = null;
        this.tail = null;
    }

    public boolean isNull(){
        return head == null;
    }

    public void insertHead(String data){
        NodeString NewNodeString = new NodeString(data);
        if (isNull()) {
            head = NewNodeString;
            tail = NewNodeString;
        }
        else{
            head.prev = NewNodeString;
            NewNodeString.next = head;
            head = NewNodeString;
        }


    }
    public void insertTail(String data){
        NodeString NewNodeString = new NodeString(data);
        if (isNull()) {
            head = NewNodeString;
            tail = NewNodeString;
        }
        else{
            tail.next = NewNodeString;
            NewNodeString.prev = NewNodeString;
            tail = NewNodeString;
        }

    }

    public void print(){
        NodeString temp = head;

        while (temp != null) {
            System.out.println(temp.dataString);
            temp = temp.next;
        }
    }

}
