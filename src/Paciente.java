public class Paciente {

    private int idPaciente;
    private String nome;
    private int idade;
    private int cpf;
    private String prioridade;
    private String sintomas;
    private String statusAtendimento;

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

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getStatusAtendimento() {
        return statusAtendimento;
    }

    public void setStatusAtendimento(String statusAtendimento) {
        this.statusAtendimento = statusAtendimento;
    }

    
}
