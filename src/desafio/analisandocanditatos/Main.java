package desafio.analisandocanditatos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Processo Seletivo---");

        System.out.println("Digite o salario base: ");
        double salarioBase = sc.nextDouble();
        sc.nextLine();

        System.out.println("Digite o salario pretendido: ");
        double salarioPretendido = sc.nextDouble();

        System.out.println("------------------------------- ");


        analisarCandidato(salarioBase,salarioPretendido);

    }

    public static void analisarCandidato(double salarioBase,double salarioPretendido) {

        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }



}
