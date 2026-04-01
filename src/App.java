public class App {
    public static void main(String[] args) throws Exception {

        int menu = -1;

        //-----------------------------
        //Adicionei uma Classe que usa o scanner por ela mesma,
        //porque quando usamos scanner.nextInt(), se a gente não
        //usar scanner.nextLine() logo depois, o código detecta
        //o enter no próximo scanner e quebra tudo.
        Selecoes scanner = new Selecoes();
        //Ainda vai ser chamado scanner, e as funções continuam as mesmas
        //com se fosse o antigo scanner.
        //------------------------------

        UnidadeAtendimento unidadeAtendimento = new UnidadeAtendimento();

        /*Paciente paciente = new Paciente(1, "Jorge", 34, 011, "Baixa", "Tosse", "Em andamento");
        Prontuario prontuario = new Prontuario(1, paciente);
        prontuario.registrarDiagnostico(scanner);
        prontuario.adicionarSintoma(scanner);
        prontuario.adicionarMedicamento(scanner);
        
        prontuario.exibirProntuario();*/

        //Menu inicio

        while (menu != 0) {
            System.out.println("==================Menu==================");
            System.out.println("0 - Sair");
            System.out.println("1 - cadastrar paciente");
            System.out.println("2 - listar pacientes");
            System.out.println("3 - registrar chegada");
            System.out.println("4 - exibir fila de espera");
            System.out.println("5 - chamar próximo paciente");
            System.out.println("6 - finalizar atendimento");
            System.out.println("7 - exibir histórico de atendimentos");
            System.out.println("8 - navegar entre prontuários");
            System.out.println("========================================");

            menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    int id = unidadeAtendimento.getPacientesCadastrados().count + 1;

                    System.out.println("Digite o nome do paciente: ");
                    String nome = scanner.nextLine();

                    System.out.println("Digite a idade do paciente: ");
                    int idade = scanner.nextInt();

                    System.out.println("Digite o cpf do paciente: ");
                    int cpf = scanner.nextInt();

                    System.out.println("Digite a prioridade do paciente: ");
                    String prioridade = scanner.nextLine();

                    System.out.println("Digite os sintomas do paciente: ");
                    String sintomas = scanner.nextLine();

                    Paciente newPaciente = new Paciente(id, nome, idade, cpf, prioridade, sintomas, "Não atendido");
                    newPaciente.cadastrar(unidadeAtendimento.getPacientesCadastrados());
                    scanner.apertarParaContinuar();
                    break;

                case 2:
                    break;
                case 3:

                    break;

                case 4:
                    break;
                case 5:

                    break;

                case 6:
                    break;
                case 7:

                    break;

                case 8:
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;
            }
        }

    }
}
