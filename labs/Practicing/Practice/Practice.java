
/**
 * Write a description of class Practice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Practice
{
    
    public static int countX(String str){
    
    if(str.length()==0){
            return 0;
        }
        if(str.indexOf('x')==0){
            return 1 +  countX(str.substring(1));
        }
        return countX(str.substring(1));
    }
    
    
    public static void main(){
        
        String str = "xxhixx";
        System.out.println(countX(str));
        

        
    }
}

