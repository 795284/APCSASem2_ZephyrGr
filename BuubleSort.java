
/**
 * Zephyr Granger
 */
public class BuubleSort
{
    public static void main(String[] args){
        int myArray[]= new int[20];
        //int myArray[] ={10,34,2,56,7,67,88,42,8,9,34,27,4,45,67};
        int numSwaps =0;

        for(int i = 0; i <myArray.length;i++){
            myArray[i]=(int)(Math.random()*20);
        }

        for(int d =0; d<myArray.length;d++){
            System.out.print(myArray[d]+" ");   
        }
        System.out.println();
        for(int j=0;j<myArray.length-1;j++){
            // long start = System.currentTimeMillis(); 
            for(int i=0;i<myArray.length-j-1;i++){

                if(myArray[i]>myArray[i+1]){
                    int temp= myArray[i];
                    myArray[i] = myArray[i+1];
                    myArray[i+1] = temp;
                    numSwaps++;

                }
            }
            //long end = System.currentTimeMillis();     
            //System.out.println("Buble swap takes " + (end - start) + "ms");
            //}
            System.out.println("Number of swaps =" +numSwaps);
            for(int x=0;x<myArray.length;x++){
                System.out.print(myArray[x]+" ");

            }
            System.out.println();

        }
        /*public static void count_function(long x) 
        { 
        System.out.println("Loop starts"); 
        for (long i = 0; i < x; i++) 
        ; 
        System.out.println("Loop ends"); 
        }
         */
    }}

