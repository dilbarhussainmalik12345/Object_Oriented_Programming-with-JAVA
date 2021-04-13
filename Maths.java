/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maths;

/**
 *
 * @author muzam
 */
public class Maths {

    /**
     * @param args the command line arguments
     */
    
    
    public int sum(int a, int b){
    
        return a+b;
    }
    public double sum(double a, double b){
    
        return a + b; 
    }
    public int sum(int a , int b, int c){
    
        return a+b+c;
    
    }
    public static void main(String[] args) {
        // TODO code application logic here
    
    Maths math = new Maths();
    
    int sum_of_two = math.sum(5,6);
        System.out.println("Sum of Two is :"+ sum_of_two);
    int sum_of_three = math.sum(5, 5,5);
    
        System.out.println("Sum of Three is :"+ sum_of_three);
    double double_sum = math.sum(2.0, 1);
        System.out.println("Double Sum is : "+double_sum);
    
    
    }
    
}
