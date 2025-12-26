import java.util.ArrayList;
import java.util.Arrays;
public class ArrayKata{
    public static void main(String[] args){
        int[] myArray = {310,25,29,23,10,14,2,110,300,4,49,2};
       System.out.println(maximumIn(myArray));
       System.out.println(minimumIn(myArray));
       System.out.println(sumOf(myArray));
       System.out.println(sumOfEven(myArray));
       System.out.println(sumOfOdd(myArray));
       System.out.println(noOfOddNumbersIn(myArray));
       System.out.println(noOfEvenNumbersIn(myArray));
       System.out.println(Arrays.toString(maximumAndMinimumOf(myArray)));
       System.out.println(evenNumbersIn(myArray));
       System.out.println(oddNumbersIn(myArray));
       System.out.println(squareNumbersIn(myArray));
    }

    public static int maximumIn(int[] arrayOfIntegers){
        int largest = arrayOfIntegers[0];
        for(int count=0;count<arrayOfIntegers.length; count++){
            if(largest<arrayOfIntegers[count]){
                largest = arrayOfIntegers[count];
                }
            }
        return largest;
    }
    
     public static int minimumIn(int[] arrayOfIntegers){
        int smallest = arrayOfIntegers[0];
        for(int count=0;count<arrayOfIntegers.length; count++){
            if(smallest>arrayOfIntegers[count]){
                smallest = arrayOfIntegers[count];
                }
            }
        return smallest;
    }

    public static int sumOf(int[] arrayOfIntegers){
        int sum = 0;
        for(int count=0;count<arrayOfIntegers.length; count++){
            sum+=arrayOfIntegers[count];
            }
        return sum;
    }

     public static int sumOfEven(int[] arrayOfIntegers){
        int sumOfEvenNumbers=0;
        for(int count=0;count<arrayOfIntegers.length; count++){
            if(arrayOfIntegers[count]%2 == 0){
                sumOfEvenNumbers+=arrayOfIntegers[count];
                }
            }
        return sumOfEvenNumbers;
    }


     public static int sumOfOdd(int[] arrayOfIntegers){
        int sumOfOddNumbers=0;
        for(int count=0;count<arrayOfIntegers.length; count++){
            if(arrayOfIntegers[count]%2 != 0){
                sumOfOddNumbers+=arrayOfIntegers[count];
                }
            }
        return sumOfOddNumbers;
    }
    public static int[] maximumAndMinimumOf(int[] arrayOfIntegers){
        int smallest = arrayOfIntegers[0];
        int largest = arrayOfIntegers[0];
        int[] arrayOfMinAndMax = new int[2];
        for(int count=0;count<arrayOfIntegers.length; count++){
            if(smallest>arrayOfIntegers[count]){
                smallest = arrayOfIntegers[count];
                }
            if(largest<arrayOfIntegers[count]){
                largest = arrayOfIntegers[count];
                }
            }
        arrayOfMinAndMax[0]=smallest;
        arrayOfMinAndMax[1]=largest;
        return arrayOfMinAndMax;
    }

     public static int noOfOddNumbersIn(int[] arrayOfIntegers){
        int countOfOddNumbers=0;
        for(int count=0;count<arrayOfIntegers.length; count++){
            if(arrayOfIntegers[count]%2 != 0){
                countOfOddNumbers++;
                }
            }
        return countOfOddNumbers;
    }


     public static int noOfEvenNumbersIn(int[] arrayOfIntegers){
        int countOfEvenNumbers=0;
        for(int count=0;count<arrayOfIntegers.length; count++){
            if(arrayOfIntegers[count]%2 == 0){
                countOfEvenNumbers++;
                }
            }
        return countOfEvenNumbers;
    }

    public static ArrayList<Integer> evenNumbersIn(int[] arraysOfIntegers){
        ArrayList<Integer> evenNumbers= new ArrayList<>();
        for(int integer : arraysOfIntegers){
            if(integer % 2 == 0){            
           evenNumbers.add(integer);
            }
        }
        return evenNumbers;
    }

   public static ArrayList<Integer> oddNumbersIn(int[] arraysOfIntegers){
        ArrayList<Integer> oddNumbers= new ArrayList<>();
        for(int integer : arraysOfIntegers){
            if(integer % 2 != 0){            
           oddNumbers.add(integer);
            }
        }
        return oddNumbers;
    }

    public static ArrayList<Integer> squareNumbersIn(int[] arrayOfIntegers){
        ArrayList<Integer> squareNumbers= new ArrayList<>();
        for(int integer:arrayOfIntegers){
            double result = Math.sqrt(integer);
            if(result*10%10 == 0){
                squareNumbers.add(integer);
            }
        }
        return squareNumbers;
    }

}
