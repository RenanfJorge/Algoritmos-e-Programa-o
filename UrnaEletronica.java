//1 = Guilherme Boulos(PSOL) 
//2 = Kim Kataguiri(UB)
//3 = Marco Vinholi(PSDB) X
//4 = Maria Helena(NOVO)
//5 = Ricardo Nunes(MDB)
//6 = Ricardo Salles(PL)
//7 = Tabata Amaral(PSB)










package javaapplication1;

import java.util.Scanner;
public class UrnaEletronica {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
   
    int[] votos = new int[7];
    
    
    System.out.println(" **Urna Eletrônica** ");
    System.out.println(" Segue lista de candidatos \n\n "
            + "1 - Guilherme Boulos(PSOL)\n "
            + "2 - Kim Kataguiri(UB)\n "
            + "3 - Marco Vinholi(PSDB)\n "
            + "4 - Maria Helena(NOVO)\n "
            + "5 - Ricardo Nunes(MDB)\n "
            + "6 - Ricardo Salles(PL)\n "
            + "7 - Tabata Amaral(PSB)\n ");
    
    System.out.println("Em qual irá votar?");
    int coletaVotos = input.nextInt();
    
    //for(int i = 0; i < 7; i++){
        
    
    }    
  
        
    }
}
