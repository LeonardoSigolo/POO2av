package atv2;

public class Principal {
    public static void main(String[] args){
        FuncionarioMensalista fm = new FuncionarioMensalista("Leo", "Sigolo", "123.456.789-01", 2000);
        FuncionarioHorista fh = new FuncionarioHorista("Werner", "Kisiliak", "789.456.123-02", 10, 38);
        FuncionarioComissao fc = new FuncionarioComissao("Victor", "Freitag", "123.456.123-03", 6700, 0.3);

        System.out.println(fm.toString());
        System.out.println(fh.toString());
        System.out.println(fc.toString());

        System.out.println(fm.calculoSalario());
        System.out.println(fh.calculoSalario());
        System.out.println(fc.calculoSalario());
    }
}
