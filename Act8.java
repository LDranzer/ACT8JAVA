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
        
        try{
        showMenu();}
        catch(Exception e){
            System.out.println("Opcion no valida" + e);
            main(args);
        }
        
        System.out.println("Ingresa valor");
        
        int opcion = sc.nextInt();
        
        switch(opcion){
            case 1:
                deck.shuffle();
                break;
            case 2:
                try{
                deck.pick();
                }catch(Exception e){
                    System.out.println("Se han agotado las cartas "+e);
                }
                
                break;
            case 3:
                try{
                deck.head();
                }catch(Exception e){
                    System.out.println("Se han agotado las cartas "+e);
                }
                break;
            case 4:
                try{
                deck.hand();
                }catch(Exception e){
                    System.out.println("Se han agotado las cartas "+e);
                }
                break;
            default:
                System.out.println("Dame un valor de verdad");
                main(args);
                break;
        }
        
             
        
        
    }
    
    public static void showMenu() throws Exception{
        
        System.out.println("Escoge la opción");
        System.out.println("Shuffle");
        System.out.println("Pick");
        System.out.println("Head");
        System.out.println("Shuffle");
        
    }
    
}