public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(new Soma());

        System.out.println(calculadora.calcula(1, 2));

        calculadora.setOperacao(new Subtracao());
        System.out.println(calculadora.calcula(1, 2));

    }
}
