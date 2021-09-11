public class SemiPresencial extends Curso{
    private int cargaHorariaPres;
    private int cargaHorariaEad;

    public SemiPresencial () {

    }
    public void exibirSemiPresencial() {
        this.cargaHorariaPres = this.cargaHoraria/2;
        this.cargaHorariaEad = this.cargaHoraria/2;
        System.out.println("Carga Horaria Presencial: " + this.cargaHorariaPres);
        System.out.println("Carga Horaria EaD: " + this.cargaHorariaEad);
    }

    //Gette e Sette
    public int getCargaHorariaPres() {
        return cargaHorariaPres;
    }
    public void setCargaHorariaPres(int cargaHorariaPres) {
        this.cargaHorariaPres = cargaHorariaPres;
    }
    public int getCargaHorariaEad() {
        return cargaHorariaEad;
    }
    public void setCargaHorariaEad(int cargaHorariaEad) {
        this.cargaHorariaEad = cargaHorariaEad;
    }
}
