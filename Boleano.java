package boleano;

import java.util.Scanner;

public class VerdadeiroFalse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        int n2 = sc.nextInt();

        if(n1>0 && n2>0){
            System.out.println("Verdadeiro");

        }
        else{
            System.out.println("Falso");
        }
    }
}
