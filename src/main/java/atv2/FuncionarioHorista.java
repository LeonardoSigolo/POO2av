package atv2;

public class FuncionarioHorista extends Funcionario{
    private double salarioHora;
    private double horasTrabalhadas;

    public FuncionarioHorista(String nome, String sobrenome, String cpf, double salarioHora, double horasTrabalhadas) {
        super(nome, sobrenome, cpf);
        this.salarioHora = salarioHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora > 0 ? salarioHora : 0;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas > 0 && horasTrabalhadas <= 168 ? horasTrabalhadas : 0;
    }

    @Override
    public double calculoSalario() {
        return getHorasTrabalhadas() <= 40 ? getSalarioHora() * getHorasTrabalhadas() : 40 * getSalarioHora() + (getHorasTrabalhadas() - 40) *getSalarioHora() * 1.5;
    }

    @Override
    public String toString() {
        return super.toString() + " " + getSalarioHora() + " " + getHorasTrabalhadas();
    }
}
