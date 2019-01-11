
/**
 *Zephyr granger
 *Swap Fuction
 *1/10/19
 */
public class Swapfuction
{
    private static int  x = 9;
    private static int  y = 12;
    
    public static  void swap(int a,int b){
        System.out.println("a = " + a + ",  b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a + ",  b = " + b);
    }

    public static void main (){
        int x = 9;
        int y = 12;
        swap(x,y);
         System.out.println("x = " +x + ",  y = " + y);
    }

    }

