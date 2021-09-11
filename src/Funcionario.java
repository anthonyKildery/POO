public class Funcionario {
    protected int matricula;
    protected String nome;
    protected String cargo;
    protected double salario;
    public static int qtdFuncionario;

    public Funcionario() {
        this.matricula = 01;
        this.nome = "Valter";
        this.cargo = "Professor";
        this.salario = 9999;
        this.matricula = 33012019;

        Funcionario.qtdFuncionario =  Funcionario.qtdFuncionario + 1;
    }
    public void menuFuncionario() {
        System.out.println(">>>>Funcionario<<<<");
        System.out.println("1 - Exibir");
        System.out.println("2 - Cadastrar: ");
        System.out.println("3 - Alterar Dados");
        System.out.println("4 - Sair");
        System.out.println("Digite a opcao: ");
    }
    public void cadastrar(int _matricula, String _nome, String _cargo, double _salario) {
        this.matricula = _matricula;
        this.nome = _nome;
        this.cargo = _cargo;
        this.salario = _salario;
    }
    public void exibirDados() {
        System.out.println(">>>>Dados do Funcionario<<<<");
        System.out.println("Matricula: " +this.matricula);
        System.out.println("Nome: " +this.nome);
        System.out.println("Cargo: " +this.cargo);
        System.out.println("Salario: " +this.salario);
        System.out.println("");
    }
    public void menuAlterar() {
        System.out.println(">>>>Menu Alterar Funcionario<<<<");
        System.out.println("1 - Matricula");
        System.out.println("2 - Nome Funcionario");
        System.out.println("3 - Cargo");
        System.out.println("4 - Salario");
        System.out.println("Digite a opcao: ");
    }
    public void alterarMatricula(int _matricula) {
        this.matricula = _matricula;
    }
    public void alterarNome(String _nome) {
        this.nome = _nome;
    }
    public void alterarCargo(String _cargo) {
        this.cargo = _cargo;
    }
    public void alterarSalario(double _salario) {
        this.salario = _salario;
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
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public static int getQtdFuncionario() {
        return qtdFuncionario;
    }
    public static void setQtdFuncionario(int qtdFuncionario) {
        Funcionario.qtdFuncionario = qtdFuncionario;
    }
}
