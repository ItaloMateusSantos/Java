import java.util.Scanner;

public class Exercício2{
    public static void main(String[] args) {
        Scanner teclado  = new Scanner(System.in);

// Tipagem
        Double nota01, nota02, nota03, media, resultado;
        string nome; 

//Solicitando tados do usuário
        System.out.println("Escreve sua nota01: ");
        nota01 = scanner.nextDouble();

        System.out.println("Escreve sua nota02: ");
        nota02 = scanner.nextDouble();

        System.out.println("Escreve sua nota03: ");
        nota03 = scanner.nextDouble();

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