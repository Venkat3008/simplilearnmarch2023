package mypackage;

public class Typecasting_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("EXPLICIT TYPE CASTING (higher byte value to lower)");
        
        long x=1000;
        
//        int n=x; (Error)
        
        int n=(int)x;
        System.out.println("Value of n: "+n);
        
        double d=35.56;
        
        byte b=(byte)d;
        System.out.println("Value of b: "+b);
        
//        float f=3.14; (Error)
        
        float f=3.14f;
        System.out.println("Value of f: "+f);
        
        int i=66; 
//        (int value should be 65 and above to be converted into as char)
//        (not necessary---there are more that 65000 symbols in UNICODE)
        
        char a=(char)i;
        System.out.println("Value of a: "+a);
	}

}
