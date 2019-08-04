
package condicoes;


public class Condicoes {

    
    public static void main(String[] args) {
       /* média maior ou igual a 7
aprovado

média entre 4 e 6
exame

abaixo de 4 reprovado*/

 int nota1 = 5;
        int nota2 = 5;
        int media = (nota1 + nota2) /2;
        
                
        if (media >= 7) {
            System.out.println ("Aprovado");
        } else if (media >= 4 & media <= 6){
            System.out.println("Exame");
        } else {
        System.out.println("Reprovado");
        }
    }
    
}
