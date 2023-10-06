package desafio.selecionandoCandidatos;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

        System.out.println("-- Resultado do processo seletivo --");
        System.out.println("-------------------------------------------");

        selecionandoCandidato();



    }


    public static void selecionandoCandidato() {
        String[] candidatos = {"FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA", "DANIELA", "JORGE"};

        int totalCandidatosSelecionados = 0;
        int proximoCandidato = 0;
        double salarioBase = 2000.0;

        while (totalCandidatosSelecionados < 3 && proximoCandidato < candidatos.length) {

            double valorPretendido = valorPretendido();

            System.out.println("O candidato " + candidatos[proximoCandidato] + " solicitou R$"+ valorPretendido+ " salário");

            if (valorPretendido > salarioBase) {
                String candidato = candidatos[proximoCandidato];
                System.out.println("QUE PENA!! O candidato " + candidato + " NÃO foi selecionado ");
                proximoCandidato++;

            } else if (valorPretendido <= salarioBase) {
                System.out.println("PARABÉNS!! O candidato " + candidatos[proximoCandidato] + " FOI SELECIONADO!!");
                totalCandidatosSelecionados++;
                proximoCandidato++;
            }
        }


        System.out.println("-------------------------------------------");


        System.out.println("O número total de candidatos selecionados foi de: " + totalCandidatosSelecionados);
        System.out.println("Total de canditatos consultados foi de:  " + proximoCandidato);


    }




    public static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);



    }
}
