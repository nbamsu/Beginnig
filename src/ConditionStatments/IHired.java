package ConditionStatments;

import java.util.Scanner;

public class IHired {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Do you know Java? ");
        String java=input.next();

      if(java.equalsIgnoreCase("yes")) {
          System.out.println("do you know selenium?");
          String selenium = input.next();
          if (selenium.equalsIgnoreCase("yes")) {
              System.out.println("do you know Api Testing?");
              String api = input.next();
              if (api.equalsIgnoreCase("yes")) {
                  System.out.println("You hired!");
              } else {
                  System.out.println("You need to lean Api testing");
              }
          } else {
              System.out.println("You need to learn the selenium");
          }
      }else{
          System.out.println("We need a person who know java");
          }
      }


    }

