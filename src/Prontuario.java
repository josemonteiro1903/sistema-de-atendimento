import java.util.Scanner;

public class Prontuario {

    //Atributos solicitados da classe prontuario
    private int idProntuario;
    // Associação: cada prontuário pertence a um objeto do tipo Paciente
    private Paciente paciente;

    
    private ListaEncadeadaSimples listaSintomas;
    private ListaEncadeadaSimples listaMedicamentos;
    
    private String diagnostico;
    private String observações;

    public Prontuario(int idProntuario, Paciente paciente) {
        this.idProntuario = idProntuario;
        this.paciente = paciente;
        this.listaSintomas = new ListaEncadeadaSimples();
        this.listaMedicamentos = new ListaEncadeadaSimples();
    }

    

    public int getIdProntuario() {
        return idProntuario;
    }



    public void setIdProntuario(int idProntuario) {
        this.idProntuario = idProntuario;
    }



    public Paciente getPaciente() {
        return paciente;
    }



    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }



    public ListaEncadeadaSimples getListaSintomas() {
        return listaSintomas;
    }



    public void setListaSintomas(ListaEncadeadaSimples listaSintomas) {
        this.listaSintomas = listaSintomas;
    }



    public ListaEncadeadaSimples getListaMedicamentos() {
        return listaMedicamentos;
    }



    public void setListaMedicamentos(ListaEncadeadaSimples listaMedicamentos) {
        this.listaMedicamentos = listaMedicamentos;
    }



    public String getDiagnostico() {
        return diagnostico;
    }



    public String getObservações() {
        return observações;
    }



    public void setObservações(String observações) {
        this.observações = observações;
    }



    public void adicionarMedicamento(Scanner scanner){
        System.out.println("Digite o medicamento que deseja adicionar");
        listaMedicamentos.add(scanner.nextLine(), null);
    }

    public void adicionarSintoma(Scanner scanner){
        System.out.println("Digite o sintoma que deseja adicionar");
        listaSintomas.add(scanner.nextLine(), null);
    }
    
    public void registrarDiagnostico(Scanner scanner){
        System.out.println("Registre o diagnóstico");
        setDiagnostico(scanner.nextLine());
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public void exibirProntuario(){
        System.out.println(toString());
        System.out.println("Lista de medicamentos");
        listaMedicamentos.print();
        System.out.println("Lista de Sintomas");
        listaSintomas.print();
    }

    @Override
    public String toString() {
        return "Prontuario [idProntuario=" + idProntuario + ", paciente=" + paciente + ", diagnostico=" + diagnostico + ", observações=" + observações + "]";
    }
}
