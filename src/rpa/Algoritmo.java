/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpa;

/**
 *
 * @author Dan
 */
public class Algoritmo {
    public Algoritmo(){
        
    }
      public  String convertirFrac(double num ,int presicion){
        String cad="numero fuera de contexto";
        int con=0;
        if(num<1){
            cad="";
            //El usuario elige la presicion de los numeros
            while(num!=0 && con<presicion){
                num=num+num;
                if(num>=1){
                    cad=cad+"1";
                    num=num-1;
                }else{
                    cad=cad+"0";
                }
                con++;
            }
        }
        return cad;
    }
      public String convertirEntero(int num){
          return Integer.toBinaryString(num);
      }
}
