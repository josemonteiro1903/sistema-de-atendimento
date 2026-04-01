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
            System.out.println("Nome: "+temp.data.getPaciente().getNome()+" | ID: "+temp.data.getPaciente().getIdPaciente());
            System.out.println("Status: "+temp.data.getStatus());
            temp = temp.next;
        }

    }
    public Atendimento remove(){
        if (head == null) {
            System.out.println("Fila vazia");
            return null;
        }

        Atendimento retorno = null;

        if (head == tail) {
            retorno = head.data;
            head = null;
            tail = null;
            count--;
            return retorno;
        }

        retorno = head.data;

        head = head.next;
        head.prev = null;
        count--;
        return retorno;
    }

    public void isEmpty(){
        if (head == null) {
            System.out.println("A fila está vazia");
        }else{
            System.out.println("A fila NÃO está vazia");
        }
    }
    
}
