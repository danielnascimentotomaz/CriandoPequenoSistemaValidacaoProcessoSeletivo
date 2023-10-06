package desafio.fazendoligacaoparacadacandidato;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        String [] candidatosSelecionados = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};

        listaDeCandidatos(candidatosSelecionados);





    }

    public static boolean atender() {
        return  new Random().nextInt(3) == 1;
    }


    public static void fazendoLigacao(String candidato) {

        int totalTentativas = 0;
        boolean atendeu;
        boolean continuarTentando;

        do {


            atendeu = atender();

            continuarTentando = !atendeu;

            if (continuarTentando) {
                totalTentativas++;
            } else {
                totalTentativas++;
                System.out.println("CONTATO REALIZADO COM SUCESSO");

            }

        } while (totalTentativas < 3 && continuarTentando);

        if(atendeu){
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato +" NA " + totalTentativas + " TENTATIVA");
        }

        else {
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato +", NÚMERO MAXIMO TENTATIVAS " + totalTentativas + " REALIZADA");
        }

        System.out.println("============================================= ");





    }


    public static void listaDeCandidatos(String [] candidato) {

        for (String candidatos : candidato) {
            fazendoLigacao(candidatos);
        }

    }





    }