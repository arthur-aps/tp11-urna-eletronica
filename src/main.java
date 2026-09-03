import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcao;
        int[] votos = new int[6];
        String[] candidatos = new String[4];

        do {
        exibirCabecalho(); // <== METODO COMPARTILHADO (ponto de conflito)
        exibirMenu();

        opcao = entrada.nextInt();
        switch (opcao) {
            case 1:
                votacao(votos, candidatos, entrada);
            break;
            case 2: /* funcionalidade do Desenvolvedor B */ break;
            case 0: System.out.println("Encerrando..."); break;
            default: System.out.println("Opcao invalida!");
        }
        } while (opcao != 0);
            entrada.close();
        }

    public static void exibirCabecalho() {
        System.out.println("==============================");
        System.out.println(" NOME DO SISTEMA ");
        System.out.println("==============================");
    }
        
    public static void exibirMenu() {
        System.out.println("1 - ...");
        System.out.println("0 - Sair");
        System.out.print("Escolha: ");
    }

    public static void votacao(int[] votos, String[] candidatos, Scanner Entrada){
        candidatos[0]= "Luis Vinicius Polvo Da Silva";
        candidatos[1]= "Jairo Messias Bolsanario";
        candidatos[2]= "Renato Santana";
        candidatos[3]= "Adalberto Auto-Peças";
        int numcandidato;

        for(int i = 0; i < candidatos.length; i++) {
            System.out.println("Candidato N" + (i+1) + "°: " + candidatos[i]);
        }
        do{
            System.out.println("Digite o número do candidato para votar:");
            numcandidato = Entrada.nextInt();

            if(numcandidato >= 1 && numcandidato <= 4){
            votos[numcandidato - 1]++;
            System.out.println("Você votou no Candidato " + candidatos[numcandidato - 1]);
            }

            else if(numcandidato == 5){
                votos[4]++;
                System.out.println("Você votou em branco!");
            }

            else if(numcandidato == 6){
                votos[5]++;
                System.out.println("Você votou nulo!");
            }

            else{
                System.out.println("Número Inválido!");
            }
        }while(numcandidato < 1 || numcandidato > 6);
    }
}