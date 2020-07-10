/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sete;

import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class Sete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner (System.in);
       
        int num;
        
        System.out.println("Digite um número: ");
        num = ler.nextInt();

        if(num >=0){
            num = num*2;
        }    
        else{
        num = num*3;
        }
        
        System.out.println("Resultado: "+num);
    }
    
}
