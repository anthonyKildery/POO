public class Curso {
    protected int codigo;
    protected String nome;
    protected int cargaHoraria;
    public static int qtdCursos;

    public Curso() {
        this.codigo = 03;
        this.nome = "Informatica";
        this.cargaHoraria = 100;

        Curso.qtdCursos = Curso.qtdCursos + 1;
    }
    public void cadastrar(int _codigo, String _nome, int _cargaHoraria) {
        this.codigo = _codigo;
        this.nome = _nome;
        this.cargaHoraria = _cargaHoraria;
    }
    public void exibirDados() {
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Curso: " + this.nome);
        System.out.println("Carga Horaria: " + this.cargaHoraria);
    }
    public void menuAlterar() {
        System.out.println(">>>>Menu Alterar Curso<<<<");
        System.out.println("1 - Codigo");
        System.out.println("2 - Curso");
        System.out.println("3 - Carga Horaria");
        System.out.println("Digite a opçao: ");
    }
    public void alterarCodigo(int _codigo) {
        this.codigo = _codigo;
    }
    public void alterarNome(String _nome) {
        this.nome = _nome;
    }
    public void alterarCargaHoraria(int _cargaHoraria) {
        this.cargaHoraria = _cargaHoraria;
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
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    public static int getQtdCursos() {
        return qtdCursos;
    }
    public static void setQtdCursos(int qtdCursos) {
        Curso.qtdCursos = qtdCursos;
    }
}
