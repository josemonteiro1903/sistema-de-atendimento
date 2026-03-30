public class NodeString {

    String dataString; // Armazena o valor do texto do nó
    NodeString next;    // Ponteiro (referência) para o próximo nó na lista
    NodeString prev;    // Ponteiro (referência) para o nó anterior na lista

    public NodeString(String data){
        this.dataString = data;
        this.next = null;
        this.prev = null;
    }
}
