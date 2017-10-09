
package boletin2_7;

import java.util.Scanner;
public class Boletin2_7 {

    
    public static void main(String[] args) {
        
        double f,c,k;
        Scanner sc=new Scanner (System.in);
        System.out.println("Introduzca grados celsius");
        c=sc.nextFloat();
        f=c*1.8+32;
        k=c+273.15;
        System.out.println("Celsius = "+c);
        System.out.println("Fahrenheit = "+f);
        System.out.println("Kelvin = "+k);
        
        
    }
    
}
