package com.tutorialspoint;

public class HelloWorld {
   private String message;

   public void setMessage(String message){
      this.message  = message;
   }
//add a useless comment
   public void getMessage(){
      System.out.println("Your Message : " + message);
      System.out.println("something");
      
   }
}