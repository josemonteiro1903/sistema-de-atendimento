public class Paciente {

    //atributos solicitados da classe paciente
    private int idPaciente;
    private String nome;
    private int idade;
    private int cpf;
    private String prioridade;
    private String sintomas;
    private String statusAtendimento;

    //construtor da classe paciente
    public Paciente(int idPaciente, String nome, int idade, int cpf, String prioridade, String sintomas,
            String statusAtendimento) {
        this.idPaciente = idPaciente;
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.prioridade = prioridade;
        this.sintomas = sintomas;
        this.statusAtendimento = statusAtendimento;
    }

    //get's e set's da classe paciente
    //Id
    public int getIdPaciente() {
        return idPaciente;
    }
    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }
    //Nome
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    //Idade
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    //Cpf
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    //Prioridade
    public String getPrioridade() {
        return prioridade;
    }
    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }
    //Sintomas
    public String getSintomas() {
        return sintomas;
    }
    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }
    //Status
    public String getStatusAtendimento() {
        return statusAtendimento;
    }
    public void setStatusAtendimento(String statusAtendimento) {
        this.statusAtendimento = statusAtendimento;
    }

    public void cadastrar(ListaEncadeadaSimples pacientesCadastrados){
        pacientesCadastrados.add(nome);
        System.out.println("Paciente "+this.nome+" Cadastrado com sucesso");
    }
    
    public void exibirStatus(){
        System.out.println(toString());
    }
    
    
    public void atualizarStatus(String novosSintomas, String novoStatus){
        this.sintomas = novosSintomas;
        this.statusAtendimento = novoStatus;
        System.out.println("Dados de "+ this.nome+ "atualizados!" );
    }

    @Override
    public String toString() {
        return "Paciente [idPaciente=" + idPaciente + ", nome=" + nome + ", idade=" + idade + ", cpf=" + cpf
                + ", prioridade=" + prioridade + ", sintomas=" + sintomas + ", statusAtendimento=" + statusAtendimento
                + "]";
    }

}