package TratamentoExcecoesJava;

public class ExceptionPersonalizada_2 {
    public static void main(String[] args) {


        int[] numerador = {4, 5, 8, 10};
        int[] denominador = {2, 4, 0, 2, 8};

        for (int i = 0; i < denominador.length; i++) {
            try {
                int resultado = numerador[i] / denominador[i];
                System.out.println(resultado);
            } catch (ArithmeticException e) {
                System.out.println("Impossível dividir por zero");
            } catch (ArrayIndexOutOfBoundsException a) {
                System.out.println("Arrays de tamanhos diferentes");
            }
        }
        System.out.println("O programa continua...");

    }
}
