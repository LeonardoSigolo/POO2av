public class Gerente extends Empregado{
    private double bonus;

    public Gerente(int codigo, double salarioBase, String nome, double bonus) {
        super(codigo, salarioBase, nome);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void calculoSalario(){
        setSalarioBase(getSalarioBase() + getBonus());
    }

    @Override
    public String toString(){
        return super.toString() + " " + getBonus();
    }
}