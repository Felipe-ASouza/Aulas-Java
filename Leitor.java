package leitor;

import java.util.*;
public class Leitor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o primeiro numero: ");

        int n1 = sc.nextInt();

        if(n1 >0 ) {
            System.out.println("O numero informado e positivo");

        }
        if(n1 <0) {
            System.out.println("O numero informado e negativo");
        }
        else if (n1==0){
            System.out.println("O numero informado e 0");
        }

    }
}