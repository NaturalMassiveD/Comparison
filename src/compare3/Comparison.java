/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compare3;
import java.util.Scanner;
/**
 *
 * @author teel6
 */
public class Comparison extends Compare3{
    public static void main(String args[]) {
        System.out.println("Please enter three strings");
        Scanner sc = new Scanner(System.in);
        String X = sc.nextLine();
        String Y = sc.nextLine();
        String Z = sc.nextLine();
        System.out.println("The max is: " + Comparison.largest(X, Y, Z));
        
        System.out.println("Please enter three numbers");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        System.out.println("The max is: " + Comparison.largest(x, y, z));
  }
}
