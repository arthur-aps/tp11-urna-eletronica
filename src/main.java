import java.util.Scanner;

public class Main {
    private void MostrarResultadosVotacao(int[] votos, String[] candidatos) {
        totalVotos = 0;

        if (votos == null || candidatos == null || votos.length != candidatos.length + 2) {
            System.out.println("Dados inválidos para exibir resultados.");
            return;
        }
        System.out.println("=== Resultados da votação: ===");
        for (int i = 0; i < votos.length - 2; i++) {
            System.out.println(candidatos[i] + " - " + votos[i] + " votos");
            totalVotos += votos[i];
        }

        System.out.println("Votos em branco: " + votos[votos.length - 2]);
        System.out.println("Votos nulos: " + votos[votos.length - 1]);

        System.out.println("==============================");
        System.out.println();
        System.out.println("Total de votos: " + totalVotos);
        System.out.println("Porcentagens de cada candidato:")

        for (int i = 0; i < votos.length - 2; i++) {
            System.out.println(candidatos[i] + " - " + (votos[i] * 100 / votos.length) + "% dos votos");
        }

        System.out.println("Votos em branco: " + (votos[votos.length - 2] * 100 / votos.length) + "% dos votos");
        System.out.println("Votos nulos: " + (votos[votos.length - 1] * 100 / votos.length) + "% dos votos");

        return
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;

        do {
        exibirCabecalho(); // <== METODO COMPARTILHADO (ponto de conflito)
        exibirMenu();
        opcao = entrada.nextInt();
        switch (opcao) {
            case 1: /* funcionalidade do Desenvolvedor A */ break;
            case 2: MostrarResultadosVotacao(votos, candidatos); break;
            case 0: System.out.println("Encerrando..."); break;
            default: System.out.println("Opcao invalida!");
        }
        } while (opcao != 0);
            entrada.close();
        }
            public static void exibirCabecalho() {
            System.out.println("==========================");
            System.out.println("VOTAÇÃO PARA REPRESENTANTE");
            System.out.println("==========================");
        }
            public static void exibirMenu() {
            System.out.println("1 - Votar");
            System.out.println("2 - Ver Resultados");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
    }
}