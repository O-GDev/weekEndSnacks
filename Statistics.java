import java.util.Arrays;
public class Statistics{
    public static void main(String[] args){
        int[] numbers ={2,5,3,8,7,-3};
//        int[] numbers = {48,36,10,19,12,17};
     System.out.println(additionOfNumbers(numbers));
     System.out.println(lengthOfArray(numbers));
     System.out.println(standardDeviation(numbers));
     System.out.println(Arrays.toString(oddAndEven(numbers)));
     System.out.println(Arrays.toString(largestAndSmallestElementIndex(numbers)));
     System.out.println(differenceLargestAndSmallestElementIndex(numbers));
     System.out.println(Arrays.toString(checkTheAdditionMethod(numbers, 29)));
    }

    public static int additionOfNumbers(int[] numbers){
        int total=0;
        for(int count=0;count<=numbers.length-1;count++){
            total+=numbers[count];
        }
        return total;
    }

    public static int lengthOfArray(int[] numbers){
        int counter=0;
        for(int count=0;count<=numbers.length-1;count++){
            counter++;    
        }
        return counter;
    }

    public static double meanOfanArray(int[] numbers){
        int sum = additionOfNumbers(numbers);
        double mean = sum/lengthOfArray(numbers);
        return mean;
    }

    public static double deviation(int[] numbers){
        int sum=0;
        double mean = meanOfanArray(numbers);
        int lenght=lengthOfArray(numbers);
        double deviance = 0;
//        int newNumbers= new int[lenght];
        for(int count=0;count<lenght;count++){
         deviance = numbers-mean;
        }
        return deviance;
    }

    public static double variance(int[] numbers){
        double mean = meanOfanArray(numbers);
        int lenght=lengthOfArray(numbers);
        double sum=0;
//        int[] numberArray = deviation(numbers);
        for(int count=0;count<lenght;count++){
            sum+=deviation(numbers[count]) * deviation(numbers[count]);
        }
        int variance = sum/lenght;
        return variance;
    }
    

    public static double standardDeviation(int[] numbers){
        int variance = variance(numbers);
        int standardDeviation = Math.sqrt(variance);
        return stardardDeviation;
    }

    public static int[] oddAndEven(int[] numbers){
        

        for(int count =0;count<numbers.length;count++){
            if(numbers[count]%2==0){
                numbers[count]*=numbers[count];            
            }else{
                numbers[count]+=1;
            }
        }
        return numbers;
    }
public static int[] largestAndSmallestElementIndex(int[] numbers){
            int[] index = new int[2];
            int largestNumber = numbers[0];
            int smallestNumber = numbers[0];
        for(int count=0;count<numbers.length; count++){
            if(numbers[count]>largestNumber){
                largestNumber = numbers[count];
                index[0]=count;
            }
            if(numbers[count]<smallestNumber){
                smallestNumber = numbers[count];
                index[1] =count;
            }
        }
        return index;
    } 


public static int differenceLargestAndSmallestElementIndex(int[] numbers){
            int[] index = new int[2];
            int largestNumber = numbers[0];
            int smallestNumber = numbers[0];
        for(int count=0;count<numbers.length; count++){
            if(numbers[count]>largestNumber){
                largestNumber = numbers[count];
                index[0]=count;
            }
            if(numbers[count]<smallestNumber){
                smallestNumber = numbers[count];
                index[1] =count;
            }
        }
        int difference = numbers[index[0]] - numbers[index[1]];
        return difference;
    } 

public static int[] checkTheAdditionMethod(int[] numbers,int secondNumber){
    int[] output = new int[2];
    for(int index=0;index<numbers.length; index++){
        for(int count=0;count<numbers.length;count++){
            int newNumber = numbers[index]+numbers[count];
            if(secondNumber== newNumber){
                output[0]=index;
                output[1]=count;
            }
        }
    }
    return output;
}
}

   
//SOLID
