import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double altura;
        double maior = 0;
        double menor = Double.MAX_VALUE;
        int homens = 0;
        int mulheres = 0;
        int totalPessoas = 0; // 👈 NOVO CONTADOR
        String genero;

        while (true) {
            System.out.print("Digite a altura (0 para sair): ");
            altura = sc.nextDouble();

            if (altura == 0) break;

            if (altura > maior) maior = altura;
            if (altura < menor) menor = altura;

            System.out.print("Digite o gênero (m/f): ");
            genero = sc.next();

            if (genero.equalsIgnoreCase("m")) {
                homens++;
            } else if (genero.equalsIgnoreCase("f")) {
                mulheres++;
            }

            totalPessoas++; // 👈 CONTA CADA PESSOA
        }

        System.out.println("\nRESULTADOS:");
        System.out.println("Total de pessoas: " + totalPessoas); // 👈 NOVO
        System.out.println("Maior altura: " + maior);
        System.out.println("Menor altura: " + menor);
        System.out.println("Homens: " + homens);
        System.out.println("Mulheres: " + mulheres);

        sc.close();
    }
}
