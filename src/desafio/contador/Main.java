package desafio.contador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int primeiroParametro = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o segundo parâmetro: ");
        int segundoParametro = scanner.nextInt();


        try {
            contar(primeiroParametro, segundoParametro);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
            System.out.println("Tente novamente");
            main(args);
            scanner.close();
            return;


        }



    }


    public static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {
        int total = segundoParametro - primeiroParametro;

        if(segundoParametro < primeiroParametro){
          throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        for(int i = 1; i <= total; i++){
            System.out.println(i);
        }



    }

}
