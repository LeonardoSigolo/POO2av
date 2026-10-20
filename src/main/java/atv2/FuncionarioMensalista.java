package atv2;

public class FuncionarioMensalista extends Funcionario{
    private double salarioMensal;

    public FuncionarioMensalista(String nome, String sobrenome, String cpf, double salario) {
        super(nome, sobrenome, cpf);
        this.salarioMensal = salario;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal > 0 ? salarioMensal : 0;
    }


    @Override
    public double calculoSalario() {
        return getSalarioMensal();
    }

    @Override
    public String toString(){
        return super.toString() + " " + getSalarioMensal();
    }
}