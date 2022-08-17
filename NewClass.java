
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LAB203_22
 */

public class NewClass {
    public static void main(String[] args){
        double salary;
        Scanner tube = new Scanner(System.in);
        System.out.print("Enter เงิน : ");
        salary = tube.nextDouble();
        if (salary > 50000){
            System.out.println(salary*0.1);
        }
        else if(salary <= 50000) {
            System.out.println(salary*0.05);}
    }
}

