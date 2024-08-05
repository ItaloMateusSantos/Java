import java.util.Scanner;

public class Exercicio3{
    public static void main(String[] args) {
        Scanner teclado  = new Scanner(System.in);

// Tipagem
        double nota01, nota02, nota03, media;
        string resultado;

//Solicitando tados do usuário
        System.out.println("Escreve sua nota01: ");
        nota01 = teclado.nextDouble();

        System.out.println("Escreve sua nota02: ");
        nota02 = teclado.nextDouble();

        System.out.println("Escreve sua nota03: ");
        nota03 = teclado.nextDouble();

// Calculando a média
        media = (nota01 + nota02 + nota03) / 3;

// Estipulando dados 
        if (media > 7 ){
            resultado = "Aprovado";
        }else if(media == 5 || media > 6.9){
                resultado = "Verificação suplementar";
        }else{
              resultado = "Reprovado";   
        }
                
        System.out.println("A sue aprimeira nota foi: " + nota01);
        System.out.println("A sua segunda nota foi: " + nota02);
        System.out.println("A sua terceira nota foi: " + nota03);
        System.out.println("A sua média foi: " + media);
        System.out.println("O seu resultado final foi: " + resultado);
            

        teclado.close();
}
    }