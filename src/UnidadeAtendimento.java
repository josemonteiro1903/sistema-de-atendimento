public class UnidadeAtendimento {

    private Fila filaEspera;
    
    private Pilha atendimentoFinalizados;
    
    private ListaEncadeadaSimples pacientesCadastrados;
    private ListaDuplamenteEncadeada prontuariosAcessados;
    
    private int count;
    
    public UnidadeAtendimento(Fila filaEspera, Pilha atendimentoFinalizados, ListaEncadeadaSimples pacientesCadastrados,
            ListaDuplamenteEncadeada prontuariosAcessados, int count) {
        this.filaEspera = new Fila();
        this.atendimentoFinalizados = new Pilha();
        this.pacientesCadastrados = new ListaEncadeadaSimples();
        this.prontuariosAcessados = new ListaDuplamenteEncadeada();
        this.count = 0;
    }


    //Ainda falta fazer os metodos da unidade
public void registrarChegadaPaciente(Atendimento paciente){
filaEspera.add(paciente);
}

public void chamarProximoPaciente(){

}


public void finalizarAtendimento(Atendimento atendimento){
atendimentoFinalizados.Push(atendimento);
filaEspera.remove();
}


public void  exibirFila(){
filaEspera.print();
}


public void exibirHistorico(){
atendimentoFinalizados.print();
}


public void navegarProntuarios(){
prontuariosAcessados.print();
}


}
