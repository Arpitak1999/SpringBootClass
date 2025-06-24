package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       int n =21;

       //n divide by 1 and by it self only
       boolean a= false;
       if(n%n==1 && n%1==1){
           System.out.println("n is prime :");
       }else {
           System.out.println("n is prime not ");
       }

    }
}