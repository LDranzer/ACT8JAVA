/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act8;
import static java.lang.Math.random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.lang.Throwable;
/**
 *
 * @author LDranzer
 */
public class Deck {
    Card palo = new Card();
    
    public void shuffle(){
        for(int i=0;i<=52;i++){
       List<String> strList = Arrays.asList(palo.Color);
       Collections.shuffle(strList);
       palo.Color = strList.toArray(new String[strList.size()]);
       
       List<String> strList2 = Arrays.asList(palo.Palo);
       Collections.shuffle(strList2);
       palo.Palo = strList2.toArray(new String[strList2.size()]);
       
       List<String> strList3 = Arrays.asList(palo.Valor);
       Collections.shuffle(strList3);
       palo.Valor = strList3.toArray(new String[strList3.size()]);
       
        System.out.println("Se mezcló el Deck");
        }
    }
    
    public void pick() throws Exception{
        Random rand = new Random();
            int i = rand.nextInt();
            int o = rand.nextInt();
            int u = rand.nextInt();
        String sa = palo.Color[i];
        String se = palo.Palo[o];
        String si = palo.Valor[u];
        
        System.out.println(sa+" "+se+" "+si+" ");
        System.out.println("Quedan");
        
    }
    
    public void hand() throws Exception{
        
        Random rand = null;
            int i = rand.nextInt();
        String sa = palo.Color[i];
        String se = palo.Palo[i];
        String si = palo.Valor[i];
        
        System.out.println(sa+" "+se+" "+si+" ");
    }
    
        public void head() throws Exception{
        String sa = palo.Color[0];
        String se = palo.Palo[0];
        String si = palo.Valor[0];
        
        System.out.println(sa+" "+se+" "+si+" ");
        System.out.println("Quedan");

    }
    
}
