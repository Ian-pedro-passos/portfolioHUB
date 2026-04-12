 if (altura == 0) break;

            if (altura > maior) maior = altura;
            if (altura < menor) menor = altura;

            System.out.print("Digite o gênero (m/f): ");
            genero = sc.next();

            if (genero.equalsIgnoreCase("m")) homens++;
            else if (genero.equalsIgnoreCase("f")) mulheres++;
        }

        System.out.println("\nRESULTADOS:");
        System.out.println("Maior altura: " + maior);
        System.out.println("Menor altura: " + menor);
        System.out.println("Homens: " + homens);
        System.out.println("Mulheres: " + mulheres);

        sc.close();
    }
}
