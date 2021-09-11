public class Turma {
    private int codigo;
    private String nome;
    private String turno;
    private Curso curso;
    private static int qtdTurma;

    public Turma() {
        this.codigo = 01;
        this.nome = "1-ano";
        this.turno = "Vespertino";

        Turma.qtdTurma = Turma.qtdTurma + 1;
    }
    public void cadastrar(int _codigo, String _nome, String _turno) {
        this.codigo = _codigo;
        this.nome = _nome;
        this.turno = _turno;
    }
    public void exibirDados() {
        System.out.println(">>>>Dados das Turma<<<<");
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Turma: " + this.nome);
        System.out.println("Turno: " + this.turno);
        System.out.println("Curso: " +this.curso.getNome());
        System.out.println("");
    }
    public void menuAlterar() {
        System.out.println(">>>>Menu Alterar da Turma<<<<");
        System.out.println("1 - Codigo");
        System.out.println("2 - Nome da Turma");
        System.out.println("3 - Turno");
        System.out.println("Digite a opcao: ");
    }
    public void alterarCodigo(int _codigo) {
        this.codigo = _codigo;
    }
    public void alterarNome(String _nome) {
        this.nome = _nome;
    }
    public void alterarTurno(String _turno) {
        this.turno = _turno;
    }

    //Gette e Sette
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }
    public Curso getCurso() {
        return curso;
    }
    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    public static int getQtdTurma() {
        return qtdTurma;
    }
    public static void setQtdTurma(int qtdTurma) {
        Turma.qtdTurma = qtdTurma;
    }
}
