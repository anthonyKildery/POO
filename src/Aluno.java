public class Aluno {
    private int matricula;
    private String nome;
    private String dataDeNacimento;
    private int cpf;
    private Turma turma;
    private static int qtdAlunos;

    public Aluno() {
        this.nome = "Anthony";
        this.dataDeNacimento = "13/10/2002";
        this.cpf = 134545901;
        this.matricula = 20193301;

        Aluno.qtdAlunos = Aluno.qtdAlunos + 1;
    }

    public void menuAluno() {
        System.out.println("");
        System.out.println(">>>>Aluno<<<<");
        System.out.println("1 - Exibir");
        System.out.println("2 - Cadastrar: ");
        System.out.println("3 - Alterar Dados");
        System.out.println("4 - Sair");
        System.out.println("Digite a opcao: ");
    }
    public void cadastrar(int _matricula, String _nome, String _dataDeNacimento, int _cpf) {
        this.matricula = _matricula;
        this.nome = _nome;
        this.dataDeNacimento = _dataDeNacimento;
        this.cpf = _cpf;
    }
    public void exibirDados() {
        System.out.println("----------------------------------------------------------");
        System.out.println(">>>>Dados do Aluno " +this.nome+ "<<<<");
        System.out.println("Matricula: " +this.matricula);
        System.out.println("Data de nacimento: " +this.dataDeNacimento);
        System.out.println("CPF: " +this.cpf);
        System.out.println("Turma: " +this.turma.getNome());
        System.out.println("");
    }
    public void menuAlterar() {
        System.out.println(">>>>Menu Alterar Aluno<<<<");
        System.out.println("1 - Matricula");
        System.out.println("2 - Nome Aluno");
        System.out.println("3 - Data de nacimento");
        System.out.println("4 - CPF");
        System.out.println("Digite a opcao: ");
    }
    public void alterarMatricula(int _matricula) {
        this.matricula = _matricula;
    }
    public void alterarNome(String _nome) {
        this.nome = _nome;
    }
    public void alterarDataDeNacimento(String _dataDeNacimento) {
        this.dataDeNacimento = _dataDeNacimento;
    }
    public void alterarCpf(int _cpf) {
        this.cpf = _cpf;
    }

    //Gette e Sette
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDataDeNacimento() {
        return dataDeNacimento;
    }
    public void setDataDeNacimento(String dataDeNacimento) {
        this.dataDeNacimento = dataDeNacimento;
    }
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public Turma getTurma() {
        return turma;
    }
    public void setTurma(Turma turma) {
        this.turma = turma;
    }
    public static int getQtdAlunos() {
        return qtdAlunos;
    }
    public static void setQtdAlunos(int qtdAlunos) {
        Aluno.qtdAlunos = qtdAlunos;
    }
}
