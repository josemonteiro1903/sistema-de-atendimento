public class Pilha {

    NodeAtendimento head;
    int count;

    public Pilha(){
        this.head = null;
        this.count = 0;
    }

    public void Push(Atendimento data){
        NodeAtendimento newNode = new NodeAtendimento(data);

            newNode.next = head;
            head = newNode;
            count++;
    }

    public void pop(){
        if (head == null) {
            System.out.println("Pilha vazia");
            return;
        }
        if (count == 1) {
            head = null;
            count--;
            return;
        }

        head = head.next;
        count--;

    }

    public void peek(){
        if(head == null){
            System.out.println("Pilha vazia");
            return;
        }
        else{
            System.out.println(head.data);
        }
    }

    public void print(){
        NodeAtendimento temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}
