import java.util.EnumSet;
public class Bender {
   public static void main(String[] args) {


       // Creating variables

       int var_int; // 4 bytes = 32 bits = 2^32 =~ 4 000 000 000; -2 000 000 000 < var2 < +2 000 000 000

       long var_long = 45; // 4 or 8 bytes; 64 bits = 2^64

       double var_double = 8.5; // 8 bytes
       float var_float = 9.7f; // 4 bytes

       char var_char = 'y'; // 1 byte; ascii table

       String var_string = "hello world";

        // if else
       int var = 10;
       int var2 = 8;


        /*
        if(var < var2) {
            System.out.println("out 1");
        }
        else {
            System.out.println("out 2");
        }

        */

        /*
        if(var == var2 || var < var2){
            System.out.println("out 1");
        }else {
            System.out.println("out 2");
        }
        */




        /*
       if(var == var2 && var < var2){
           System.out.println("out 1");
       }else {
           System.out.println("out 2");
       }
       */

       if(var == var2){
           if(var < var2){
               System.out.println("out 1");
           }else{
               System.out.println("out 2");
           }
       }else{
           System.out.println("out 2");
       }





   }

}






