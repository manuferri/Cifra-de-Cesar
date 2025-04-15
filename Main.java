import java.util.Scanner;
public class Main {
    public static void main (String [] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o número da opção que deseja:");
        System.out.println("[1] Criptografar");
        System.out.println("[2] Decodificar");

        int resposta = teclado.nextInt();

        teclado.nextLine(); //para limpar o buffer :)

        System.out.println("Digite a mensagem:");
        String mensagem = teclado.nextLine().toUpperCase();

        if(resposta == 1){
            int chave = (int)(Math.random() * 25 + 1);
            System.out.println("Chave: " + chave + " | Mensagem Criptografada: " + CifraDeCesar.criptografar(mensagem, chave));
        } else {
            if (resposta == 2) {
                for(int chave = 1; chave < 26; chave++){
                    String tentativa = CifraDeCesar.decodificar(mensagem, chave);

                    System.out.println("Chave: " + chave + " | Mensagem decodificada: " + tentativa);
                    System.out.println("Digite P (Parar) ou C (Continuar):");
                    String resposta2 = teclado.nextLine().toUpperCase();

                    if(resposta2.equals("P")){
                        System.out.println("Decodificação encerrada!");
                        break;
                    }
                }
            } else {
                System.out.println("Opção inválida");
            }
        }

        teclado.close();
    }
}
