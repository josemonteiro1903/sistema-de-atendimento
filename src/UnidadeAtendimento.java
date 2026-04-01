public class UnidadeAtendimento {

    private Fila filaEspera;
    private Pilha atendimentoFinalizados;
    private ListaEncadeadaSimples pacientesCadastrados;
    private ListaDuplamenteEncadeada prontuariosAcessados;
    private int count;
    private Atendimento atendimentoAtual;

    public UnidadeAtendimento() {
        this.filaEspera = new Fila();
        this.atendimentoFinalizados = new Pilha();
        this.pacientesCadastrados = new ListaEncadeadaSimples();
        this.prontuariosAcessados = new ListaDuplamenteEncadeada();
        this.count = 0;
        this.atendimentoAtual = null;
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
        System.out.println("Paciente "+paciente.getPaciente().getNome()+" registrado na fila de espera");
    }

    public void chamarProximoPaciente() {
        if(filaEspera.isNull()){
            System.out.println("Não há pacientes na fila de espera");
            return;
        }
        System.out.print("Próximo paciente: ");
        filaEspera.peek();
        atendimentoAtual = filaEspera.remove();
    }

    public void finalizarAtendimento(String diagnostico, ListaEncadeadaSimples medicamento, ListaEncadeadaSimples sintoma, String observacao) {
        if(atendimentoAtual == null){
            System.out.println("Sem atendimentos ocorrendo");
            return;
        }
        atendimentoFinalizados.Push(atendimentoAtual);

        Prontuario newProntuario = new Prontuario(atendimentoAtual.getIdAtendimento(), atendimentoAtual.getPaciente());
        newProntuario.setDiagnostico(diagnostico);
        newProntuario.setListaMedicamentos(medicamento);
        newProntuario.setListaSintomas(sintoma);
        newProntuario.setObservações(observacao);
        prontuariosAcessados.insertTail(newProntuario);

        atendimentoAtual.getPaciente().setStatusAtendimento("Atendido");
        atendimentoAtual.setStatus("Atendido");
        atendimentoAtual = null;
        System.out.println("Atendimento finalizado.");
    }

    public void exibirFila() {
        filaEspera.print();
    }

    public void exibirHistorico() {
        atendimentoFinalizados.print();
    }

    public void navegarProntuarios() {
        Selecoes scanner = new Selecoes();
        NodeProntuario atual = prontuariosAcessados.head;

        if (atual == null) {
            System.out.println("Não há prontuários");
            return;
        }

        int opcao = -1;

        while(opcao != 0){
            System.out.println("=====================");
            System.out.println("Prontuário de "+atual.prontuario.getPaciente().getNome());
            atual.prontuario.exibirProntuario();
            System.out.println("0 - Sair\n1 - Anterior\n2 - Próximo");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    if(atual != prontuariosAcessados.head){
                        atual = atual.prev;
                    }
                    break;
                
                case 2:
                    if(atual != prontuariosAcessados.tail){
                        atual = atual.next;
                    }
                    break;

                case 0:
                    break;
            
                default:
                    System.out.println("Opção não reconhecida!");
                    scanner.apertarParaContinuar();
                    break;
            }
        }
    }

    public Paciente acharPaciente(int escolha){
        NodeListas temp = pacientesCadastrados.head;
        while (temp != null) {
            if (temp.paciente.getIdPaciente() == escolha) {
                return temp.paciente;
            }
            temp = temp.next;
        }
        return null;
    }

}
