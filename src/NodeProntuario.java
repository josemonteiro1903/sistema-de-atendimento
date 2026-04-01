public class NodeProntuario {

    Prontuario prontuario;  // Armazena o valor do texto do nó
    NodeProntuario next;    // Ponteiro (referência) para o próximo nó na lista
    NodeProntuario prev;    // Ponteiro (referência) para o nó anterior na lista
    Paciente paciente;  // Armazena o paciente

    public NodeProntuario(Prontuario prontuario){
        this.prontuario = prontuario;
        this.next = null;
        this.prev = null;
        this.paciente = null;
    }
}
