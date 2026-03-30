public class ListaEncadeadaSimples {

     int count;
    NodeString head;

    public ListaEncadeadaSimples(){
        this.count = 0;
        this.head = null;
    }

    public boolean isNull(){
         return head == null;
    }

    public void add(String data){
        NodeString nodeString = new NodeString(data);

        if (isNull()) {
            head = nodeString;
            count++;
        }
        else{
            nodeString.next = head;
            head = nodeString;
            count++;
        }
    }

    public void remove(){
        if (isNull()) {
            System.out.println("Lista vazia");
            return;
        }
        else{
            head = head.next;
            count--;
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
