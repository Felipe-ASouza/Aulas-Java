package calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha a operacao desejada:\n" +
                "1: Soma\n" +
                "2: Subtração\n" +
                "3: Multiplicacao\n" +
                "4: Divisao");
        int escolha = sc.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Informe o primeiro valor: ");
                int n1 = sc.nextInt();
                System.out.println("Informe o segundo valor:" );
                int n2 = sc.nextInt();
                System.out.println("Resultado da soma: "+(n1+n2));
                break;
            case 2:
                System.out.println("Informe o primeiro valor: ");
                int s1 = sc.nextInt();
                System.out.println("Informe o segundo valor: ");
                int s2 = sc.nextInt();
                System.out.println("O resultado da subtração e " +(s1-s2));
                break;
            case 3:
                System.out.println("Informe o primeiro valor:");
                int m1 = sc.nextInt();
                System.out.println("Informe o segundo valor:");
                int m2 = sc.nextInt();
                System.out.println("O resultado da multiplicação e :"+(m1*m2));
                break;
            case 4:
                System.out.println("Informe o primeiro valor: ");
                int d1 = sc.nextInt();
                System.out.println("Informe o segundo valor: ");
                int d2 = sc.nextInt();
                System.out.println("O resultado da divisao e :"+(d1/d2));


        }

    }
}