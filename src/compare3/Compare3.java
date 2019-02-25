/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compare3;

/**
 *
 * @author teel6
 */
public class Compare3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public static <T extends Comparable<T>> T largest(T x, T y, T z) {
    T max = x;

    if (y.compareTo(max) > 0)
      max = y;

    if (z.compareTo(max) > 0)
      max = z;

    return max;
  }
}
