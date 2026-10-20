package atv2;

public class FuncionarioComissao extends Funcionario{
    private double vendaBruta;
    private double comissao;

    public FuncionarioComissao(String nome, String sobrenome, String cpf, double vendaBruta, double comissao) {
        super(nome, sobrenome, cpf);
        this.vendaBruta = vendaBruta;
        this.comissao = comissao;
    }

    public double getVendaBruta() {
        return vendaBruta;
    }

    public void setVendaBruta(double vendaBruta) {
        this.vendaBruta = vendaBruta > 0 ? vendaBruta : 0;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao > 0 && comissao < 1 ? comissao : 0;
    }

    @Override
    public double calculoSalario() {
        return getVendaBruta() * (getComissao());
    }

    @Override
    public String toString() {
        return super.toString() + " " + getVendaBruta() + " " + getComissao();
    }
}
