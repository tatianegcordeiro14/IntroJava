// 1- Pacote
package intro;

// 2- Referências às Bibliotecas

// 3- Classe (Nome de alguma coisa, nomde algo ou alguém, substantivo.)
public class Medidas {
     // 3.1- Atributos - Caracteristicas (adjetivos, caracterisitcas daquela coisa, daquele sujeito)

    // 3.2- Métodos e Funções ( o que a coisa sabe fazer, os verbos)
    public static void main(String[] args){
        System.out.println("Cálculo de áreas.");
        System.out.println("Bom dia!");

    }

    public void calcularAreaModoExtenso(){
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
    public void calcularAreaModoCompactado(){
        // calculo de área reduzido
        int largura = 4;
        int comprimento = 3;

        System.out.println(" Para a largura de " + largura + "m e o comprimento de "
                + comprimento + "m a área é de: " + comprimento + " m2");
    }

}
