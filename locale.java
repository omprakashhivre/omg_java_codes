import javax.print.DocFlavor.STRING;

//import jdk.vm.ci.meta.Local;

import java.lang.String;
import java.util.*;
import java.text.*;

public class locale {
    public static void main(String[] args) {
        int counta = 0 ;

    /*   Locale l1 = Locale.getDefault();
       p("default country :"+l1.getDisplayCountry()+"--- default language :"+l1.getDisplayLanguage());
       Locale l2 = new Locale("hi","UK");
    //    Locale.setDefault(l2);
       p("default country :"+l2.getDisplayCountry()+"--- default language :"+l2.getDisplayLanguage());
       Locale[] langs=Locale.getAvailableLocales();
      // Locale[] count=Locale.getISOCountries();
       int countlang = 0,countcntr =0;
    //    for(Locale s : langs){
    //        p(countlang++ +") "+s.getDisplayCountry()+" -- "+s.getDisplayLanguage());
    //     }
        // for(String s1 : count){
        //     p(countcntr++ +") "+s1);
        //  }
*/
           double d = 123456789.1025;
           Locale[] langs= (Locale.getAvailableLocales());
           //NumberFormat nf = NumberFormat.getInstance(Locale.getDefault());
           //p("itely form is : "+nf.format(d));
           for(Locale l : langs){
               NumberFormat nn = NumberFormat.getCurrencyInstance(l);
               System.out.println(counta++ +")"+ l.getCountry()+" form is "+nn.format(d));

           }



        
    }
    public static void p(String str){
        System.out.println(str);
    }
    
}
