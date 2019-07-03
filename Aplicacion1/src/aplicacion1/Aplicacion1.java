/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion1;

/**
 *
 * @author Sandra
 */
public class Aplicacion1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char a = 'p';
        short b = 21;
        byte by = 2;
        int f = 34;
        long lo = 123456789012L;
        float fl = 2.4f;
        double d = 113.66;
        boolean n = false;

        short suma = (short) (f + by);

//        System.out.println("La suma es:" + suma);
//
//        if (f > 0) {
//            System.out.println("Es mayor que cero");
//            if (b == 21) {
//                System.out.println("b es igual a 21");
//            }
//        } else if (f == 1) {
//            System.out.println("Es igual que uno");
//        } else {
//            System.out.println("Es mayor que cero");
//        }
//        n = (b == 21) ? true : false;
//
//        switch (a) {
//            case 'a':
//            case 'e':
//            case 'i':
//            case 'o':
//            case 'u':
//                System.out.println("Es una vocal");
//                break;
//            default:
//                System.out.println("NO es una vocal");
//        }
            
//            for( int i=10;i>0; i--){
//                System.out.println(i);
//            }
//            while(f > 0){
//                System.out.println(f);
//                f = f-1;
//                
//            }
//                do{
//                    if(f == 10){
//                        f =  f-1;
//                        continue;
//                    }else
//                        System.out.println(f);
//                    
//                    f = f-1;
//                    
//                }while(f>0);

                    // operadores logicos
                    // y (&&), o (||) no (!)
                    if(f >0 && f<=35){
                        System.out.println("de 1 a 35");
                    }
                    if( f< 0 || f<=35){
                        System.out.println("o logico");
                    }
                    if( !(f<0)){
                        System.out.println("Negado");
                    }
    }

}
