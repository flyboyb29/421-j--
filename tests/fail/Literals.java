package fail;

public class Literals {

	public static void main(String[] args) {

        double d = 1e1; 
        d = 2.; 
        d = .3; 
        d = 0.0; 
        d = 3.14; 
        d = 1e-9d; 
        d = 1e-9D;
        d = 1e137;
        d = 1239487274.23746;
        

        //long literal
        long i = 12309830l;
        i = 3872987L; 
        
        //float literal
        float f = 1e1f; 
        f = 2.F; 
        f = .3f; 
        f =  0F; 
        f = 3.14f; 
        f = 6.022137e+23f;
        
        

        //binary int
        int k = 0b10101011;
        k = 0B01111011110;
        
        //octal int
        int o = 021453645;
        o = 01737323433;
        
        //hex int
        int h = 0xA454E;
        h = 0XABCDEF0123456789; 

	}

}
