
package javaapplication1;

import java.util.Scanner;
public class NewClass {
    
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    int [][] numero = new int[3][4];
    
    System.out.printf("Digite numeros nessa matriz [3][4] \n");
    
    for(int i = 0; i < 3; i++){
        for(int j = 0; j < 4; j++){
            System.out.printf("Insira o numero aqui [%d][%d]", i, j);
            numero[i][j] = input.nextInt();
            
        }
    }
    
    } 
}
