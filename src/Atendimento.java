import java.util.Scanner;

public class Atendimento {

    private Paciente paciente;
    private int idAtendimento;
    private double horarioEntrada;
    private double horarioAtendimento;
    private String status;
    private String medico;
    public Atendimento(Paciente paciente, int idAtendimento, double horarioEntrada, String medico) {
        this.paciente = paciente;
        this.idAtendimento = idAtendimento;
        this.horarioEntrada = horarioEntrada;
        this.status = "No aguardo";
        this.medico = medico;
    }

    public void iniciarAtendimento(Scanner scanner){
        System.out.println("Insira o horário do atendimento");
        double horario = scanner.nextDouble();

        if (horario>horarioEntrada) {
            System.out.println("Horario inválido");
            return;
        }
        else{
            setHorarioAtendimento(horario);
            setStatus("Em andamento");
        }
    }

    public void finalizarAtendimento(){
        setStatus("Finalizado");
    }

    public void cancelarAtendimento(){
        setStatus("Cancelado");
    }


    public void setHorarioAtendimento(double horarioAtendimento) {
        this.horarioAtendimento = horarioAtendimento;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    
    
}
