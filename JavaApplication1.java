
package javaapplication1;
import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        
        int [][] numero = new int [3][3];
         
    Scanner input = new Scanner(System.in);
    System.out.println(" Soma das matrizes "); 
    
    
    for(int i = 0; i < 3; i++){
        for(int j = 0; j<3; j++){
            System.out.printf("Coloque os nomeros da matriz [%d][%d] aqui: ",  i, j);
            numero[i][j] =  input.nextInt();
       }   
    
    }
    
    System.out.println("Resultado é:  ");
     for(int i = 0; i < 3; i++){
         for(int j = 0; j < 3; j++){
         System.out.printf("\t%d", numero[i][j]);
         
         }
         
         System.out.println("");
     }   
    
    int soma = 0;
    for(int i = 0; i < numero.length; i++){
        soma += numero[i][i];
                
    }System.out.println("");
    
    System.out.println(" A soma é " + soma);
    
    }
    
}
