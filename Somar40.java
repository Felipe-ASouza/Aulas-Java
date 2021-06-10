package somadosnumerosMenoresde40;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Valor40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valorFinal = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println(new String(String.format("Informe o %sª valor: ", i).getBytes(StandardCharsets.UTF_8)));
            int valor = sc.nextInt();

            if(valor<40) {

                valorFinal = valor + valorFinal;

            }


        }

        System.out.println(new String(String.format("A soma dos dez números menores de 40 é: %s", valorFinal).getBytes(StandardCharsets.UTF_8)));

    }
}