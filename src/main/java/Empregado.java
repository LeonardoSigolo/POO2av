public abstract class Empregado {

    private int codigo;
    private String nome;
    private double salarioBase;

    public Empregado(int codigo, double salarioBase, String nome) {
        this.codigo = codigo;
        this.salarioBase = salarioBase;
        this.nome = nome;
    }

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

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public String toString(){
        return getCodigo() + " " + getNome() + " " + getSalarioBase();
    }

    public abstract double calculoSalario();
}