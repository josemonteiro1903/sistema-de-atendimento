import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Paciente paciente = new Paciente(1, "Jorge", 34, 011, "Baixa", "Tosse", "Em andamento");
        Prontuario prontuario = new Prontuario(1, paciente);
        prontuario.registrarDiagnostico(scanner);
        prontuario.adicionarSintoma(scanner);
        prontuario.adicionarMedicamento(scanner);
        
        prontuario.exibirProntuario();
    }
}
