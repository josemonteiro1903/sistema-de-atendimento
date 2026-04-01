public class Fila {

    int count;
    NodeAtendimento head;
    NodeAtendimento tail;
    public Fila() {
        this.count = 0;
        this.head = null;
        this.tail = null;
    }

    public boolean isNull(){
        return head == null;
    }

        public void add(Atendimento data){
        NodeAtendimento newNode = new NodeAtendimento(data);

        if(isNull()){
            head = newNode;
            tail = newNode;
        }else{
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }    
        count++;
    }

        public void peek(){
        if (head == null) {
            System.out.println("Fila vazia");
            return;
        }
        System.out.println(head.data.getPaciente().getNome());
    }

    public void print(){
        NodeAtendimento temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }
    public void remove(){
        if (head == null) {
            System.out.println("Fila vazia");
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
            count--;
            return;
        }

        head = head.next;
        head.prev = null;
        count--;
    }

    public void isEmpty(){
        if (head == null) {
            System.out.println("A fila está vazia");
        }else{
            System.out.println("A fila NÃO está vazia");
        }
    }
    
}
