// 1- Pacote
package intro;

// 2- Referências às Bibliotecas

import java.security.PublicKey;
import java.util.Scanner;

// 3- Classe (Nome de alguma coisa, nomde algo ou alguém, substantivo.)
public class Medidas {
     // 3.1- Atributos - Caracteristicas (adjetivos, caracterisitcas daquela coisa, daquele sujeito)

    // 3.2- Métodos e Funções ( o que a coisa sabe fazer, os verbos)
    public static void main(String[] args) {
        // Condicional = Verificar uma condição - Fazer uma pergunta para uma pessoa , um hardware, software.

        // Utilizar a classe scanner do Java para ler a escolha do usuário no console.
        Scanner scanner =  new Scanner(System.in);
        System.out.println("M E N U   D E   O P Ç Õ E S: ");
        System.out.println("C - Calcular área modo curto: ");
        System.out.println("D - Calcular área modo contarAteDez: ");
        System.out.println("E - Calcular área modo extenso ");
        System.out.println("I - If Simples ");
        System.out.println("R - Contagem regressiva de 10 a 0 ");
        System.out.println("Digite a opção desejada: ");
        String opcao = scanner.next();

        //  switch = selecionar o comprotamento do programa conforme a escolha da pessoa ou do software.

    //String opcao = "curto";

    switch (opcao){
        case "C":
        case "c":
            System.out.println("Você escolheu executar o método curto");
            calcularAreaModoCurto();
            break;
        case "D":
        case "d":
            System.out.println("Você escolheu executar o método contarAteDez");
            contarAteDez();
            break;
        case "E":
        case "e":
            System.out.println("Você escolheu executar o método extenso");
            calcularAreaModoExtenso();
            break;
        case "I":
        case "i":
            System.out.println("Você escolheu executar o método ifSimples");
            ifSimples();
            break;
        case "R":
        case "r":
            System.out.println("Você escolheu executar o método contagemRegressiva ");
            contagemRegressiva();
            break;
        default:
            System.out.println("Você escolheu qualquer outro valor!");
            break;
        }

    }

    public static void ifSimples(){
        // if = Se
        // else = Senão

        String modo = "curto";
        if (modo == "curto"){
            calcularAreaModoCurto();
        }
        else{
            calcularAreaModoExtenso();
        }
    }

    public static void calcularAreaModoExtenso(){
        System.out.println("Cálculo de áreas, modo extenso.");

        // Cálculo de área - Exemplo: o tamanho do tapete ou do piso
        int largura;
        int comprimento;
        int resultado;
        largura = 4; //largura recebe 4
        comprimento = 3;
        resultado = largura * comprimento;
        System.out.println(" Para a largura de " + largura + "m e o comprimento de "
                + comprimento + "m a área é de: " + resultado + " m2");
    }
    public static void calcularAreaModoCurto(){
        System.out.println("Cálculo de áreas, modo curto.");


        // calculo de área reduzido
        int largura = 10;
        int comprimento = 3;

        System.out.println(" Para a largura de " + largura + "m e o comprimento de "
                + comprimento + "m a área é de: " + largura * comprimento + " m2");
    }
    public static void contarAteDez(){
        //Loops ou Repetição
        // for = repetição incondicional
        System.out.println("Contagem crescente");

        for (int numero = 1; numero <= 10; numero++){
            System.out.println(numero);
        }
    }
    public static void contagemRegressiva() {
        System.out.println("Contagem Regressiva");

        for (int numero = 10; numero > -1; numero--){
            System.out.println(numero);
        }
    }

}


