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

        Paciente teste1 = new Paciente(1, "Jorge", 34, 011, "Baixa", "Tosse", "Em andamento");
        Paciente teste2 = new Paciente(2, "ABC", 34, 011, "Baixa", "Tosse", "Em andamento");
        teste1.cadastrar(unidadeAtendimento.getPacientesCadastrados());
        teste2.cadastrar(unidadeAtendimento.getPacientesCadastrados());

        /*
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
                    int opcao = -1;
                    while(opcao != 0){
                        System.out.println("========================================");
                        unidadeAtendimento.getPacientesCadastrados().print();
                        System.out.println("0 - Sair\n1 - Escolher Paciente");
                        opcao = scanner.nextInt();
                        if (opcao == 1) {
                            System.out.println("Escolha o nome do paciente que quer procurar");
                            String escolha = scanner.nextLine();
                            Paciente pacienteEscolhido = unidadeAtendimento.acharPaciente(escolha);
                            if (pacienteEscolhido == null) {
                                System.out.println("Paciente não encontrado.");
                                scanner.apertarParaContinuar();
                            }else{
                                pacienteEscolhido.exibirStatus();
                                scanner.apertarParaContinuar();
                            }
                        }else if(opcao != 0){
                            System.out.println("Opção não reconhecida!");
                            scanner.apertarParaContinuar();
                        }
                    }
                    break;
                case 3:
                    System.out.println("Qual paciente chegou na fila?");
                    unidadeAtendimento.getPacientesCadastrados().print();
                    String escolha = scanner.nextLine();
                    Paciente pacienteEscolhido = unidadeAtendimento.acharPaciente(escolha);
                    if (pacienteEscolhido == null) {
                        System.out.println("Paciente não encontrado.");
                        scanner.apertarParaContinuar();
                    }else{
                        System.out.println("Escreva o horário de entrada");
                        double horario = scanner.nextDouble();
                        System.out.println("Escreva o médico que acompanhará o paciente");
                        String medico = scanner.nextLine();
                        Atendimento newAtendimento = new Atendimento(pacienteEscolhido, pacienteEscolhido.getIdPaciente(), horario, medico);
                        unidadeAtendimento.registrarChegadaPaciente(newAtendimento);
                        System.out.println("Paciente registrado na fila!");
                        scanner.apertarParaContinuar();
                    }
                    break;

                case 4:
                    Fila fila = unidadeAtendimento.getFilaEspera();
                    NodeAtendimento temp = fila.head;
                    int posicao = 1;
                    while(temp != null){
                        System.out.println("Paciente "+posicao+": "+temp.data.getPaciente().getNome());
                        temp = temp.next;
                    }
                    scanner.apertarParaContinuar();
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
