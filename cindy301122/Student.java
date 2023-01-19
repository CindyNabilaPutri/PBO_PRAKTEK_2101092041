/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cindy301122;

/**
 *
 * @author LENOVO
 */
public class Student extends Person {
    public Student(){
         super("cindy", "Minas");
         super.name ="Cindy Nabila Putri";;
         super.address = "some assress";
        System.out.println("inside Student:Constructor");
    }
    
     @Override
     public String getName() {
        System.out.println("Student:getName");
        return name;
    }

     public static void main(String[]args){
        Student Anna = new Student();
        System.out.println(Anna.name);
    }
}
