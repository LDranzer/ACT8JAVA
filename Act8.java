/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act8;
import java.util.*;  
/**
 *
 * @author LDranzer
 */
public class Act8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Deck deck = new Deck();
        
        Scanner sc = new Scanner(System.in);
        
        showMenu();
        
        System.out.println("Ingresa valor");
        
        int opcion = sc.nextInt();
        
        switch(opcion){
            case 1:
                deck.shuffle();
                break;
            case 2:
                deck.pick();
                break;
            case 3:
                deck.head();
                break;
            case 4:
                deck.hand();
                break;
            default:
                System.out.println("Dame un valor de verdad");
                break;
        }
        
             
        
        
    }
    
    public static void showMenu(){
        
        System.out.println("Escoge la opción");
        System.out.println("Shuffle");
        System.out.println("Pick");
        System.out.println("Head");
        System.out.println("Shuffle");
        
    }
    
}