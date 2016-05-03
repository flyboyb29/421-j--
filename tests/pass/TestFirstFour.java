package pass;

import java.io.IOException;

public class TestFirstFour {
       
    public static void main(String[] args) {
   
        double d = 1e1; 
        d = 4.;
        d = .5;
        d = 4e-6d; 
        d = 4e-8D;
        d = 2e97;
        d = 10.14433345;
  
        float f = 1e1f;
        f = 3F;
        f = 4.1344f; 
        f = 4.03337e+1f;
        f = 5.F;
        f = .6f;
      ;
        

        long l = 643297L;
        l = 89784l;
        

        int one = 123;
        int two = 321;
        
        int i = 348;

        i = one + two;
        
        i--;
        --i;
        
        boolean b = (one==two);
        b = one > two; 
        i++;
        ++i;       
        boolean booleanOne = false;
        boolean booleanTwo = b && booleanOne;
        i = b ? (i + one) : (i + two);
        i = b ? (i + one) : (i + two);
               
        i *= one;
        i = one % two;
        i %= one;
        i = one ^ two;
        b = one <= two;
        i >>= 2;
        i = one | two;
        i |= one;
        b = booleanOne || booleanTwo;
        i += one;
        i = one * two;
        i = ~one;
        i <<= 2;
        i /= one;
        i -= one;
        i = one & two;
        i &= one;
        b = one != two;
        i = one / two;
        i = one >>> 2;
        i >>>= 2;
        b = one >= two;
        i = one << 2;
        b = one < two;
        b = !booleanOne;
        i = one - two;
        i ^= one; 
 
    }
}