package ConditionStatments;

import java.util.Scanner;

public class IfStatment {
    public static void main(String[] args) {
        int apples = 15;
        int banana = 21;
        //true// if banana less then apples code will not run, it wont be show up!
        if (banana > apples) {
            System.out.println("We have more bananas then apples");
        } else {
            System.out.println("we have more apples then bananas");

        }
        Scanner input = new Scanner(System.in);     // Alt+Enter it will let the Scanner work.
        System.out.println("Please enter number of students: ");
        int numberOfStudents = input.nextInt();
        System.out.println("Please enter the capacity of class ");

        int capacityOfClass = input.nextInt();
        if (numberOfStudents < capacityOfClass) {

                System.out.println("You are welcome to class");
            } else if (numberOfStudents == capacityOfClass) {
                System.out.println("Our class is full nnow");
            } else {
                System.out.println("We cannot accept " + numberOfStudents + " as we have less capacity in class");
            }


        }
    }
