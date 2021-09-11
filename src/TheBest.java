import java.util.Scanner;

public class TheBest {
    public static void main(String[] args) {
        System.out.println(" _____  _              ______             _   \n" +
                "|_   _|| |             | ___ \\           | |  \n" +
                "  | |  | |__    ___    ||_/ /  ___  ___ | |_ \n" +
                "  | |  | '_ \\  / _ \\   | ___ \\ / _ \\/ __|| __|\n" +
                "  | |  | | | ||  __/   ||_/ /|  __/\\__ \\| |_ \n" +
                "  \\_/  |_| |_| \\___    |\\____/  \\___||___/ \\__|\n");

        Scanner ler = new Scanner(System.in);
        int opcao01 , opcao02;

        Professor professor1 = new Professor();

        Aluno aluno1 = new Aluno();                             //Objeto da Class Aluno
        Turma turma1 = new Turma();                             //Objeto da Class Turma

        Curso curso1 = new Curso();                             //Objeto da Class Curso
        Presencial presencial1 = new Presencial();
        SemiPresencial semiPresencial1 = new SemiPresencial();
        EaD ead1 = new EaD();

        Disciplina disciplina1 = new Disciplina();              //Objeto da Class Disciplina

        aluno1.setTurma(turma1);                    //Associado objetos
        turma1.setCurso(curso1);                    //Associado objetos
        disciplina1.setCurso(curso1);               //Associado objetos
        disciplina1.setProfessor(professor1);       //Associado objetos

        int resp01 = 1;
        while (resp01 == 1)
        {
            //Menu Pricipal
            System.out.println("----------------------------------------------------------");
            System.out.println("1 - Funcionario");
            System.out.println("2 - Aluno");
            System.out.println("Digite a opcao: ");
            opcao01 = ler.nextInt();

            //Funcionarios
            if (opcao01 == 1) {
                System.out.println("----------------------------------------------------------");
                System.out.println("Quanidade  de funcionario: " +Funcionario.getQtdFuncionario());
                int resp02 = 1;
                while (resp02 == 1)
                {
                    professor1.menuFuncionario();
                    opcao01 = ler.nextInt();
                    switch (opcao01)
                    {
                        case 1: //Eibir dados
                            if (professor1.getCargo() != null && professor1.getNome() != null) {
                               professor1.exibirDados();
                            }
                            else {
                                System.out.println("\tErro!!\n\tNao foi cadastrado nenhum funcionario\n");
                            }
                            break;
                        case 2: // Cadastra
                            if (professor1.getCargo() == null && professor1.getNome() == null) {
                                System.out.println(">>>>Cadastrar Funcionario<<<<");
                                System.out.println("Matricula: ");
                                int matricula = ler.nextInt();
                                ler.nextLine();
                                System.out.println("Nome do Funcionario: ");
                                String nome = ler.nextLine();
                                System.out.println("Cargo: ");
                                String cargo = ler.nextLine();
                                System.out.println("Salario: ");
                                double salario = ler.nextDouble();
                                professor1.cadastrar(matricula, nome, cargo, salario);
                            }
                            else {
                                System.out.println("\tJa foi cadastrado!!\n\tEscolha a opcao alterar!!");
                            }
                            break;
                        case 3: //Alterar
                            opcao01 = 1;
                            do {

                                if (professor1.getCargo() != null && professor1.getNome() != null) {
                                    professor1.menuAlterar();
                                    opcao01 = ler.nextInt();
                                    switch (opcao01) {
                                        case 1:
                                            System.out.println("\nMudar Numero da Matricula: ");
                                            ler.nextLine();
                                            int matricula = ler.nextInt();
                                            professor1.alterarMatricula(matricula);
                                            break;
                                        case 2:
                                            System.out.println("Mudar Nome do Funcionario: ");
                                            ler.nextLine();
                                            String nome = ler.nextLine();
                                            professor1.alterarNome(nome);
                                            break;
                                        case 3:
                                            System.out.println("Mudar Cargo: ");
                                            ler.nextLine();
                                            String cargo = ler.nextLine();
                                            professor1.alterarCargo(cargo);
                                            break;
                                        case 4:
                                            System.out.println("Mudar Salario: ");
                                            ler.nextLine();
                                            double salario = ler.nextDouble();
                                            professor1.alterarSalario(salario);
                                            break;
                                        default:
                                            System.out.println("\tErro!!\n\tOpcao nao existe!!");
                                    }

                                }
                                else {
                                    System.out.println("\tErro!!\n\tNao foi cadastrado nenhum funcionario\n");
                                }
                                System.out.println("Deseja continuar [1 - Sim] [2 - Nao]: ");
                                opcao01 = ler.nextInt();
                            } while (opcao01 == 1);
                            break;
                        case 4:
                            resp02 = 2;
                            break;
                        default:
                            System.out.println("\tErro!!\n\tEssa opcao nao existe\n");
                            resp02 = 1;
                            break;
                    }
                }
            }

            //Alunos
            else if (opcao01 == 2)
            {
                System.out.println("----------------------------------------------------------");
                System.out.println("Quanidade  de Alunos: " +Aluno.getQtdAlunos());
                System.out.println("Quanidade  de Turmas: " +Turma.getQtdTurma());
                System.out.println("Quanidade  de Disciplina: " +Disciplina.getQtdDisciplina());
                System.out.println("Quanidade  de Curso: " +Curso.getQtdCursos());
                System.out.println("----------------------------------------------------------");
                int resp03 = 1;
                while (resp03 == 1)
                {
                    aluno1.menuAluno();
                    opcao01 = ler.nextInt();
                    switch (opcao01) {
                        case 1: //Exibir Dados
                            if (aluno1.getNome() != null && aluno1.getDataDeNacimento() != null &&
                            curso1.getCodigo() != 0 && curso1.getCargaHoraria() != 0) {
                                aluno1.exibirDados();
                                turma1.exibirDados();
                                disciplina1.caucularQtdAula(null);
                                disciplina1.exibirDados();
                                if (presencial1.getCodigo() != 0) {
                                    System.out.println(">>>>Dados do Curso Presencial<<<<");
                                    presencial1.exibirDados();
                                }
                                else if (semiPresencial1.getCodigo() != 0) {
                                    System.out.println(">>>>Dados do Curso Semipresencial<<<<");
                                    semiPresencial1.exibirDados();
                                    semiPresencial1.exibirSemiPresencial();
                                }
                                else {
                                    System.out.println(">>>>Dados do Curso EaD<<<<");
                                    ead1.exibirDados();
                                }
                            }
                            else {
                                System.out.println("\tErro!!\n\tNao foi cadastrado nenhum aluno\n");
                            }
                            break;
                        case 2: //Cadastrar
                            System.out.println("----------------------------------------------------------");
                            System.out.println("1 - Aluno");
                            System.out.println("2 - Turma");
                            System.out.println("3 - Disciplina");
                            System.out.println("4 - Curso");
                            System.out.println("5 - Sair");
                            System.out.println("Digite a opcao: ");
                            opcao01 = ler.nextInt();
                            System.out.println("----------------------------------------------------------");

                            switch (opcao01) {
                                case 1: //Cadastrar Aluno
                                    if (aluno1.getNome() == null && aluno1.getDataDeNacimento() == null) {
                                        System.out.println(">>>>Cadastrar Aluno<<<<");
                                        System.out.println("Matricula: ");
                                        int matricula = ler.nextInt();
                                        ler.nextLine();
                                        System.out.println("Nome do Aluno: ");
                                        String nome = ler.nextLine();
                                        System.out.println("Data de Nacimento: ");
                                        String dataDeNacimento = ler.nextLine();
                                        System.out.println("CPF: ");
                                        int cpf = ler.nextInt();

                                        aluno1.cadastrar(matricula, nome, dataDeNacimento, cpf);
                                    } else {
                                        System.out.println("\tJá foi cadastrado!!\n\tEscolha a opcao alterar!!");
                                    }
                                    break;

                                case 2: //Cadastrar Turma
                                    if (turma1.getCodigo() == 0 && turma1.getTurno() == null) {
                                        System.out.println(">>>>Cadastrar Turma<<<<");
                                        System.out.println("Codigo: ");
                                        int codigo = ler.nextInt();
                                        ler.nextLine();
                                        System.out.println("Nome da Turma: ");
                                        String nome = ler.nextLine();
                                        System.out.println("Turno: ");
                                        String turno = ler.nextLine();

                                        turma1.cadastrar(codigo, nome, turno);
                                    } else {
                                        System.out.println("\tJá foi cadastrado!!\n\tEscolha a opcao alterar!!");
                                    }
                                    break;

                                case 3: //Cadastrar Disciplina
                                    if (disciplina1.getCodigo() == 0 && disciplina1.getNome() == null) {
                                        System.out.println(">>>>Cadastrar Disciplina<<<<");
                                        System.out.println("Codigo: ");
                                        int codigo = ler.nextInt();
                                        ler.nextLine();
                                        System.out.println("Disciplina: ");
                                        String nome = ler.nextLine();
                                        System.out.println("Carga Horaria: ");
                                        double cargahoraria = ler.nextDouble();
                                        disciplina1.cadastrar(codigo, nome, cargahoraria);
                                    } else {
                                        System.out.println("\tJá foi cadastrado!!\n\tEscolha a opcao alterar!!");
                                    }
                                    break;

                                case 4: //Cadastrar Curso
                                    if (curso1.getCodigo() == 0 && curso1.getNome() == null) {
                                        System.out.println(">>>>Cadastrar Curso<<<<");
                                        System.out.println("1 - Presencial\n2 - Semipresencial\n3 - EaD");
                                        System.out.println("Digite sua opcao: ");
                                        opcao02 = ler.nextInt();

                                        switch (opcao02) {
                                            case 1:
                                                System.out.println("Codigo: ");
                                                int codigo = ler.nextInt();
                                                ler.nextLine();
                                                System.out.println("Curso: ");
                                                String nome = ler.nextLine();
                                                System.out.println("Carga Horaria: ");
                                                int cargaHoraria = ler.nextInt();
                                                presencial1.cadastrar(codigo, nome, cargaHoraria);
                                                break;
                                            case 2:
                                                System.out.println("Codigo: ");
                                                codigo = ler.nextInt();
                                                ler.nextLine();
                                                System.out.println("Curso: ");
                                                nome = ler.nextLine();
                                                System.out.println("Carga Horaria: ");
                                                cargaHoraria = ler.nextInt();
                                                semiPresencial1.cadastrar(codigo, nome, cargaHoraria);
                                                break;
                                            case 3:
                                                System.out.println("Codigo: ");
                                                codigo = ler.nextInt();
                                                ler.nextLine();
                                                System.out.println("Curso: ");
                                                nome = ler.nextLine();
                                                System.out.println("Carga Horaria: ");
                                                cargaHoraria = ler.nextInt();
                                                ead1.cadastrar(codigo, nome, cargaHoraria);
                                                break;
                                        }
                                    } else {
                                        System.out.println("\tJá foi cadastrado!!\n\tEscolha a opcao alterar!!");
                                    }
                                    break;
                            }
                            break;
                        case 3: //Alterar
                            if (aluno1.getNome() != null && aluno1.getDataDeNacimento() != null) {
                                int resp04 = 1;
                                while (resp04 == 1)
                                {
                                    System.out.println("\nEscolha a opcao a qual deseja alterar:");
                                    System.out.println("1 - Aluno");
                                    System.out.println("2 - Turma");
                                    System.out.println("3 - Disciplina");
                                    System.out.println("4 - Curso");
                                    System.out.println("5 - Sair");
                                    System.out.println("Digite a opcao: ");
                                    opcao01 = ler.nextInt();
                                    switch (opcao01) {
                                        case 1: //Alterar os Dados do Aluno
                                            opcao01 = 1;
                                            do {
                                                aluno1.menuAlterar();
                                                opcao01 = ler.nextInt();
                                                switch (opcao01) {
                                                    case 1:
                                                        System.out.println("\nMudar Numero da Matricula: ");
                                                        int matricula = ler.nextInt();
                                                        aluno1.alterarMatricula(matricula);
                                                        break;
                                                    case 2:
                                                        System.out.println("\nMudar Nome do Aluno: ");
                                                        ler.nextLine();
                                                        String nome = ler.nextLine();
                                                        aluno1.alterarNome(nome);
                                                        break;
                                                    case 3:
                                                        System.out.println("\nMudar Data de Nacimento: ");
                                                        ler.nextLine();
                                                        String dataDeNacimento = ler.nextLine();
                                                        aluno1.alterarDataDeNacimento(dataDeNacimento);
                                                        break;
                                                    case 4:
                                                        System.out.println("\nMudar CPF: ");
                                                        int cpf = ler.nextInt();
                                                        aluno1.alterarCpf(cpf);
                                                        break;
                                                    default:
                                                        System.out.println("\tErro!!\n\tOpcao nao existe!!");
                                                }
                                                System.out.println("Deseja continuar [1 - Sim] [2 - Nao]: ");
                                                opcao01 = ler.nextInt();
                                            } while (opcao01 == 1);
                                            break;
                                        case 2: //Opcao Alterar Turma
                                            opcao01 = 1;
                                            do {
                                                turma1.menuAlterar();
                                                opcao01 = ler.nextInt();
                                                switch (opcao01) {
                                                    case 1:
                                                        System.out.println("\nMudar Codigo da Turma: ");
                                                        int codigo = ler.nextInt();
                                                        turma1.alterarCodigo(codigo);
                                                        break;
                                                    case 2:
                                                        System.out.println("\nMudar Nome da Turma: ");
                                                        ler.nextLine();
                                                        String nome = ler.nextLine();
                                                        turma1.alterarNome(nome);
                                                        break;
                                                    case 3:
                                                        System.out.println("\nMudar Turno: ");
                                                        ler.nextLine();
                                                        String turno = ler.nextLine();
                                                        turma1.alterarTurno(turno);
                                                        break;
                                                    default:
                                                        System.out.println("\tErro!!\n\tOpcao nao existe!!");
                                                }
                                                System.out.println("Deseja continuar [1 - Sim] [2 - Nao]: ");
                                                opcao01 = ler.nextInt();
                                            } while (opcao01 == 1);
                                            break;

                                        case 3: //Opcao Alterar Disciplina
                                            opcao01 = 1;
                                            do {
                                                disciplina1.menuAlterar();
                                                opcao01 = ler.nextInt();
                                                switch (opcao01) {
                                                    case 1:
                                                        System.out.println("Mudar Codigo: ");
                                                        int codigo = ler.nextInt();
                                                        disciplina1.alterarCodigo(codigo);
                                                        break;
                                                    case 2:
                                                        System.out.println("Mudar Disciplina: ");
                                                        ler.nextLine();
                                                        String nome = ler.nextLine();
                                                        disciplina1.alterarDisciplina(nome);
                                                        break;
                                                    case 3:
                                                        System.out.println("Mudar Carga Horaria: ");
                                                        double cargahoraria = ler.nextDouble();
                                                        ler.nextLine();
                                                        disciplina1.alterarCargaHoraria(cargahoraria);
                                                        break;
                                                    default:
                                                        System.out.println("\tErro!!\n\tOpcao nao existe!!");
                                                }
                                                System.out.println("Deseja continuar [1 - Sim] [2 - Nao]: ");
                                                opcao01 = ler.nextInt();
                                            } while (opcao01 == 1);
                                            break;

                                        case 4: //Opcao Alterar Curso
                                            opcao01 = 1;
                                            do {
                                                curso1.menuAlterar();
                                                opcao01 = ler.nextInt();
                                                switch (opcao01) {
                                                    case 1:
                                                        System.out.println("Codigo: ");
                                                        int codigo = ler.nextInt();
                                                        curso1.alterarCodigo(codigo);
                                                        break;
                                                    case 2:
                                                        System.out.println("Mudar Curso: ");
                                                        ler.nextLine();
                                                        String nome = ler.nextLine();
                                                        curso1.alterarNome(nome);
                                                        break;
                                                    case 3:
                                                        System.out.println("Carga Horaria: ");
                                                        int cargaHoraria = ler.nextInt();
                                                        curso1.alterarCargaHoraria(cargaHoraria);
                                                        break;
                                                    default:
                                                        System.out.println("\tErro!!\n\tOpcao nao existe!!");
                                                }
                                                System.out.println("Deseja continuar [1 - Sim] [2 - Nao]: ");
                                                opcao01 = ler.nextInt();
                                            } while (opcao01 == 1);
                                            break;
                                        case 5: //Opcao Sair
                                            resp04 = 2;
                                            break;
                                        default:
                                            System.out.println("\tErro!!\n\tOpcao nao existe!!");
                                            resp04 = 1;
                                    }
                                }
                            }
                            else { //caso o usuario nao tenha cadastro ainda
                                System.out.println("\tErro!!\n\tNao foi cadastrado nenhum aluno\n");
                                resp03 = 1;
                            }
                            break;
                        case 4: //opção Sair
                            resp03 = 2;
                            break;
                        default:
                            System.out.println("\tErro!!\n\tEssa opcao nao existe\n");
                            resp03 = 1;
                            break;
                    }
                }
            }
            else {
                System.out.println("\tErro!!\n\tEssa opcao nao existe");
                resp01 = 1;
            }
        }
    }
}
