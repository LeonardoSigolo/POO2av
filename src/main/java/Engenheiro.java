public class Engenheiro extends Empregado{
    private String departamento;
    private String CREA;

    public Engenheiro(int codigo, double salarioBase, String nome, String departamento, String CREA) {
        super(codigo, salarioBase, nome);
        this.departamento = departamento;
        this.CREA = CREA;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCREA() {
        return CREA;
    }

    public void setCREA(String CREA) {
        this.CREA = CREA;
    }

    public void calculoSalario(){
        this.setSalarioBase(getSalarioBase() * 1.5);
    }

    @Override
    public String toString(){
        return getCodigo() + " " + getNome() + " " + getSalarioBase() + " " + getCREA() + " " + getDepartamento();
    }
}
