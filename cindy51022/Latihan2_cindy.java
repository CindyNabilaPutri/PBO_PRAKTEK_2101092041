/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cindy51022;

/**
 *
 * @author LENOVO
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Latihan2_cindy {
    public static void main( String[] args ){ 
   BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) ); 
 int angka1 = 0; 
 int angka2 = 0; 
 int jumlah = 0; 
 try{ 
 System.out.print("Angka 1 :"); 
 angka1 = Integer.parseInt(dataIn.readLine()); 
 System.out.print("Angka 2 :"); 
 angka2 = Integer.parseInt(dataIn.readLine());  
 
 }catch( IOException e ){ 
 System.out.println("Error!"); 
 } 
    jumlah = angka1 + angka2;
        System.out.println("Jumlah : "+jumlah);
 }  
}
