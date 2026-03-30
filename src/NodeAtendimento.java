public class NodeAtendimento {

    Atendimento data;
    NodeAtendimento next;
    NodeAtendimento prev;

    public NodeAtendimento(Atendimento data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
