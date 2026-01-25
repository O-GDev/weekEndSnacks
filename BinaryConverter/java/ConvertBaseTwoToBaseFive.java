import java.util.Scanner;
public class ConvertBaseTwoToBaseFive{
    public static void main(String[] args){
        System.out.println(convertToBaseFive(10121));
        
    }
          
    public static String convertToBaseFive(int baseTwo){
        int baseTen = convertToBaseTen(baseTwo);
        String binaryValue = "";
        if (baseTen == 0) {
            return "0";
        }

        while(baseTen !=0){
            binaryValue=((baseTen%5 )+"")+binaryValue;
            baseTen/=5;
        }
    return binaryValue;
    }

 public static int convertToBaseTen(int baseTwo){
          if(baseTwo<0){
        baseTwo*=-1;
        }

        String decimalValueInString = baseTwo + "";
        int decimalValue = 0;

        for(int count = 0;count<decimalValueInString.length();count++){ 
            if(baseTwo%10>1){
                System.out.println("Value inputted is not in base two!!!");
                return 0;
            }   
            decimalValue += (baseTwo%10)*Math.pow(2,count);
            baseTwo/=10;
        }
        return decimalValue;
    }
        
    }

   

