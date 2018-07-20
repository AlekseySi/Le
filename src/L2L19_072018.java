public class L2L19_072018 {
    public static void main(String[] args) {
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

        if (var == var2) {
            if (var < var2) {
                System.out.println("out 1");
            } else {
                System.out.println("out 2");
            }
        } else {
            System.out.println("out 2");
        }


    }
}