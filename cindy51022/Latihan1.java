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
public class Latihan1 {
    public static void main( String[] args ){ 
 
 BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) ); 
 String name = ""; 
 String alamat = ""; 
 String jurusan = ""; 
 
 try{ 
 System.out.print("Nama :"); 
 name = dataIn.readLine(); 
 System.out.print("Alamat :"); 
 alamat = dataIn.readLine(); 
 System.out.print("Jurusan :"); 
 jurusan = dataIn.readLine(); 
 }catch( IOException e ){ 
 System.out.println("Error!"); 
 } 
 System.out.println("Hello " + name + "di" + " " + alamat + " " + "Selamat Datang di" + " " +jurusan + "!"); 
 } 
} 
    

