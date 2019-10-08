package com.example.javalib;

public class Methods {
    public static void main(String[] args) {

        // Method("imsa", 20,'i');
         //addnums(12,23,10,20,8,4,4,4);
           String("imsha");


    }


    //3. passing a string
         public static void String(String name){

             System.out.println("imsha");

         }
    //2.Method
     public static void addnums(int a,int b,int x,int y,float p,float q,double m,double n) {

     float division=(p/q);
    double multiply=m*n;

     System.out.println("Addition is" + " " + (a+b) + " " + (x*y) + " " + division + " " + multiply); // or else int sum = a+b; ("add is" + sum);
}


     // 1. Method
    public static void Method(String name,int age,char a) { //can add any num of parameters

      //include if condition
        if (age < 25)
            System.out.println("I'm young");
        else {
            System.out.println("Old!");
        }



        System.out.println("Android! " + name + " " + age + " " + a);


    }


    }

