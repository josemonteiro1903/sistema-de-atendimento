public class UnidadeAtendimento {

    private Fila filaEspera;

    private Pilha atendimentoFinalizados;

    private ListaEncadeadaSimples pacientesCadastrados;
    private ListaDuplamenteEncadeada prontuariosAcessados;

    private int count;

    public UnidadeAtendimento() {
        this.filaEspera = new Fila();
        this.atendimentoFinalizados = new Pilha();
        this.pacientesCadastrados = new ListaEncadeadaSimples();
        this.prontuariosAcessados = new ListaDuplamenteEncadeada();
        this.count = 0;
    }

    public Fila getFilaEspera() {
        return filaEspera;
    }
    public void setFilaEspera(Fila filaEspera) {
        this.filaEspera = filaEspera;
    }

    public Pilha getAtendimentoFinalizados() {
        return atendimentoFinalizados;
    }
    public void setAtendimentoFinalizados(Pilha atendimentoFinalizados) {
        this.atendimentoFinalizados = atendimentoFinalizados;
    }

    public ListaEncadeadaSimples getPacientesCadastrados() {
        return pacientesCadastrados;
    }
    public void setPacientesCadastrados(ListaEncadeadaSimples pacientesCadastrados) {
        this.pacientesCadastrados = pacientesCadastrados;
    }

    public ListaDuplamenteEncadeada getProntuariosAcessados() {
        return prontuariosAcessados;
    }
    public void setProntuariosAcessados(ListaDuplamenteEncadeada prontuariosAcessados) {
        this.prontuariosAcessados = prontuariosAcessados;
    }

    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }

    // Ainda falta fazer os metodos da unidade
    public void registrarChegadaPaciente(Atendimento paciente) {
        filaEspera.add(paciente);
    }

    public void chamarProximoPaciente() {

    }

    public void finalizarAtendimento(Atendimento atendimento) {
        atendimentoFinalizados.Push(atendimento);
        filaEspera.remove();
    }

    public void exibirFila() {
        filaEspera.print();
    }

    public void exibirHistorico() {
        atendimentoFinalizados.print();
    }

    public void navegarProntuarios() {
        prontuariosAcessados.print();
    }

}