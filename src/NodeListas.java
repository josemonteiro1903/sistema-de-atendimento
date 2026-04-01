public class NodeListas {

    String dataString;  // Armazena o valor do texto do nó
    NodeListas next;    // Ponteiro (referência) para o próximo nó na lista
    NodeListas prev;    // Ponteiro (referência) para o nó anterior na lista
    Paciente paciente;  // Armazena o paciente

    public NodeListas(String data){
        this.dataString = data;
        this.next = null;
        this.prev = null;
        this.paciente = null;
    }
}
