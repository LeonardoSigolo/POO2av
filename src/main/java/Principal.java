public class Principal {
    public static void main(String[] args) {
        Engenheiro engenheiro = new Engenheiro(1, 2000, "Roger", "Produção", "123");
        Gerente gerente = new Gerente(1, 2000, "Regor", 1500);

        System.out.println(engenheiro.toString());
        System.out.println(gerente.toString());

        System.out.println(engenheiro.calculoSalario());
        System.out.println(gerente.calculoSalario());
    }
}
