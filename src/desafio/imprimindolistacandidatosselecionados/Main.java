package desafio.imprimindolistacandidatosselecionados;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        System.out.println("Candidatos selecionados: ");
        imprimirCandidatosSelecionados(selecionandoCandidato());



    }


    public static String[] selecionandoCandidato() {
        String[] candidatos = {"FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA", "DANIELA", "JORGE"};
        String[] canditadosSelecionados = new String[6];

        int totalCandidatosSelecionados = 0;
        int proximoCandidato = 0;
        double salarioBase = 2000.0;

        while (totalCandidatosSelecionados < 6 && proximoCandidato < candidatos.length) {

            if (valorPretendido() <= salarioBase) {
                String candidato = candidatos[proximoCandidato];
                canditadosSelecionados[totalCandidatosSelecionados] = candidato;
                totalCandidatosSelecionados++;
            }
            proximoCandidato++;


        }

        return canditadosSelecionados;
    }

    public static void imprimirCandidatosSelecionados(String[] candidatosSelecionados) {

        for (String candidato : candidatosSelecionados) {
            if(candidato != null){
                System.out.println(candidato);
            }

        }

    }





    public static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }


}
