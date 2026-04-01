public class ListaDuplamenteEncadeada {


    NodeListas head;
    NodeListas tail;

    public ListaDuplamenteEncadeada(){
 
        this.head = null;
        this.tail = null;
    }

    public boolean isNull(){
        return head == null;
    }

    public void insertHead(String data){
        NodeListas newNodeListas = new NodeListas(data);
        if (isNull()) {
            head = newNodeListas;
            tail = newNodeListas;
        }
        else{
            head.prev = newNodeListas;
            newNodeListas.next = head;
            head = newNodeListas;
        }


    }
    public void insertTail(String data){
        NodeListas newNodeListas = new NodeListas(data);
        if (isNull()) {
            head = newNodeListas;
            tail = newNodeListas;
        }
        else{
            tail.next = newNodeListas;
            newNodeListas.prev = newNodeListas;
            tail = newNodeListas;
        }

    }

    public void print(){
        NodeListas temp = head;

        while (temp != null) {
            System.out.println(temp.dataString);
            temp = temp.next;
        }
    }

}
