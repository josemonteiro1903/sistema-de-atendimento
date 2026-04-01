public class ListaDuplamenteEncadeada {


    NodeProntuario head;
    NodeProntuario tail;

    public ListaDuplamenteEncadeada(){
 
        this.head = null;
        this.tail = null;
    }

    public boolean isNull(){
        return head == null;
    }

    public void insertHead(Prontuario prontuario){
        NodeProntuario newNodeProntuario = new NodeProntuario(prontuario);
        if (isNull()) {
            head = newNodeProntuario;
            tail = newNodeProntuario;
        }
        else{
            head.prev = newNodeProntuario;
            newNodeProntuario.next = head;
            head = newNodeProntuario;
        }


    }
    public void insertTail(Prontuario prontuario){
        NodeProntuario newNodeProntuario = new NodeProntuario(prontuario);
        if (isNull()) {
            head = newNodeProntuario;
            tail = newNodeProntuario;
        }
        else{
            tail.next = newNodeProntuario;
            newNodeProntuario.prev = newNodeProntuario;
            tail = newNodeProntuario;
        }

    }

    public void print(){
        NodeProntuario temp = head;

        while (temp != null) {
            System.out.println(temp.prontuario);
            temp = temp.next;
        }
    }

}
