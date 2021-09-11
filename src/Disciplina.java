public class Disciplina {
    private int codigo;
    private String nome;
    private double cargahoraria;
    private double qtdAulaTeorica;
    private double qtdAulaPratica;
    private Curso curso;
    private static int qtdDisciplina;
    private Professor professor;

    public Disciplina() {
        this.codigo = 02;
        this.nome = "POO";
        this.cargahoraria = 200;
        this.qtdAulaTeorica = 0;
        this.qtdAulaPratica = 0;

        Disciplina.qtdDisciplina = Disciplina.qtdDisciplina + 1;
    }
    public void cadastrar(int _codigo, String _nome, double _cargahoraria) {
        this.codigo = _codigo;
        this.nome = _nome;
        this.cargahoraria = _cargahoraria;
    }
    public void exibirDados() {
        System.out.println(">>>>Dados da Disciplina<<<<");
        System.out.println("Codigo: " +this.codigo);
        System.out.println("Disciplina: " +this.nome);
        System.out.println("Carga Horaria: " +this.cargahoraria+ " hrs");
        System.out.println("Quantidade de Aula Teorica: " +this.qtdAulaTeorica+ " hrs");
        System.out.println("Quantidade de Aula Pratica: " +this.qtdAulaPratica+ " hrs");
        System.out.println("Curso: " +this.curso.getNome());
        System.out.println("Professor: " +this.professor.getNome());
        System.out.println("");
    }
    public void menuAlterar() {
        System.out.println(">>>>Menu Alterar Disciplina<<<<");
        System.out.println("1 - Codigo");
        System.out.println("2 - Disciplina");
        System.out.println("3 - Carga Horaria:");
        System.out.println("Digite a opção: ");
    }
    public void alterarCodigo(int _codigo) {
        this.codigo = _codigo;
    }
    public void alterarDisciplina(String _nome) {
        this.nome = _nome;
    }
    public void alterarCargaHoraria(double _cargahoraria) {
        this.cargahoraria = _cargahoraria;
    }
    public void caucularQtdAula (Double _cargahoraria) {
        _cargahoraria = this.cargahoraria;
        this.qtdAulaTeorica = _cargahoraria * 0.7;
        this.qtdAulaPratica = _cargahoraria * 0.3;
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
    public double getCargahoraria() {
        return cargahoraria;
    }
    public void setCargahoraria(double cargahoraria) {
        this.cargahoraria = cargahoraria;
    }
    public double getQtdAulaTeorica() {
        return qtdAulaTeorica;
    }
    public void setQtdAulaTeorica(double qtdAulaTeorica) {
        this.qtdAulaTeorica = qtdAulaTeorica;
    }
    public double getQtdAulaPratica() {
        return qtdAulaPratica;
    }
    public void setQtdAulaPratica(double qtdAulaPratica) {
        this.qtdAulaPratica = qtdAulaPratica;
    }
    public Curso getCurso() {
        return curso;
    }
    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    public static int getQtdDisciplina() {
        return qtdDisciplina;
    }
    public static void setQtdDisciplina(int qtdDisciplina) {
        Disciplina.qtdDisciplina = qtdDisciplina;
    }
    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
