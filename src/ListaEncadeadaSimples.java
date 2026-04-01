public class ListaEncadeadaSimples {

    int count;
    NodeListas head;

    public ListaEncadeadaSimples(){
        this.count = 0;
        this.head = null;
    }

    public boolean isNull(){
         return head == null;
    }

    public void add(String data, Paciente paciente){
        NodeListas nodeListas = new NodeListas(data);

        if (paciente != null) {
            nodeListas.paciente = paciente;
        }

        if (isNull()) {
            head = nodeListas;
            count++;
        }
        else{
            nodeListas.next = head;
            head = nodeListas;
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
        NodeListas temp = head;

        while (temp != null) {
            if (temp.paciente != null) {
                System.out.println("Nome: "+temp.paciente.getNome()+" | ID: "+temp.paciente.getIdPaciente());
            }else{
                System.out.println(temp.dataString);
            }
            temp = temp.next;

        }
    }
}
