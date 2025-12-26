import java.util.Scanner;
import java.util.Arrays;
public class LogisticsService{
    public static void main(String[] args){
//    Scanner input = new Scanner(System.in);
//    System.out.print("Enter total number of deliveries: ");
//    int collectionRate = input.nextInt();
    int[] arrayName={2,3,5,2,8,9,6}; 
    int[] secondArray = {34,78,90,12,20,81,30,78,90,12,20,81,30,78,90,12,20,81,30};
    int[] firstArray = {75,27,7};
//    System.out.println(logisticsService(collectionRate));
//        System.out.println(Arrays.toString(reverseArray(arrayName)));
//        System.out.println(Arrays.toString(elementAtOdd()));
//        System.out.println(Arrays.toString(elementAtEven()));
//        System.out.println(Arrays.toString(elementOccurs()));
        System.out.println(Arrays.toString(combineArray(secondArray,arrayName)));
    }


    public static int logisticsService(int collectionRate){
    int basepay=5000;
    int ridersWage=0;
    int amountPerPercel=0;
    
    if(collectionRate<50){
            amountPerPercel += 160;
        }
    if(collectionRate>=50 && collectionRate<60){
            amountPerPercel += 200;
        }
    if(collectionRate>=60 && collectionRate<70){
            amountPerPercel += 250;
        }
    if(collectionRate>=70){
            amountPerPercel += 500;
        }

    ridersWage = collectionRate * amountPerPercel + basepay;

    return ridersWage;
    }

//section 2

    public static int largestElement(int[] numbers){
        int largestNumber=numbers[0];
        for(int index=0;index<=numbers.length-1;index++){
        if(largestNumber<numbers[index]){
            largestNumber=numbers[index];        
        }
        }
        return largestNumber;
    }

    public static boolean elementOccurs(int number){
        int[] numbers = {8,3,4,9,0,2,4,2,2};
//        int count = 0;
        for(int count = 0; count<numbers.length; count++){
               if(numbers[count]==number){
                return true;
                }    
        }
        return false;
    }

    public static int[] reverseArray(int[] array){
        int[] newArray = new int[array.length];
        int newIndex = 0;
        for(int count=array.length-1;count>=0;count--){
            newArray[newIndex] = array[count];
            newIndex+=1;
        }
        return newArray;
    }
//
     public static int[] elementAtOdd(){
        int[] numbers = {8,3,4,9,0,2,4,2,2};
        int[] newNumbers = new int[numbers.length/2];
        if (numbers.length % 2 !=0){
        int length = (numbers.length/2)-(1/2);
        newNumbers = new int[length];        
        }
        int counter=0;
        for(int count = 0; count<numbers.length; count++){
               if(count%2 !=0){
                newNumbers[counter] = numbers[count];
                counter++;
                }    
        }
        return newNumbers;
    } 

     public static int[] elementAtEven(){
        int[] numbers = {8,3,4,9,0,2,4,2,4};
        int[] newNumbers = new int[numbers.length/2];
//        if (numbers.length % 2 !=0){
//        int[] newNumbers = new int[numbers.length/2]+0.5;        
//        }
        int counter=0;
        for(int count = 0; count<numbers.length-1; count++){
               if(count%2 == 0){
                newNumbers[counter] = numbers[count];
                counter++;
                }    
        }
        return newNumbers;
    } 

    public static int sumOfArray(){
        int[] numbers = {8,3,4,9,0,2,4,2,2};
        int sum=0;
        for(int count = 0; count<numbers.length-1; count++){
               sum+=numbers[count];  
        }
        return sum;
    } 

    public static int[] combineArray(int[] firstArray,int[] secondArray){
        int[] newArray = new int [firstArray.length + secondArray.length];

        int arrayCount=0;
        int firstArrayCount=0;
        int secondArrayCount=0;

        for(int count=0; count<newArray.length;count++){
//         
    

        if(firstArrayCount<firstArray.length && secondArrayCount<secondArray.length){
           if(count%2==0){  
                newArray[arrayCount]=firstArray[firstArrayCount]; 
                firstArrayCount++;        
            }
            else{
                newArray[arrayCount]=secondArray[secondArrayCount];
                secondArrayCount++;
            }
        }
        else if(firstArrayCount<firstArray.length){
                newArray[arrayCount]=firstArray[firstArrayCount];
                firstArrayCount++;
        }
        else if(secondArrayCount<secondArray.length){
                newArray[arrayCount]=secondArray[secondArrayCount];
                secondArrayCount++;
        }
else{
                newArray[arrayCount]=firstArray[firstArrayCount]; 
                firstArrayCount++;
                arrayCount++;
                newArray[arrayCount]=secondArray[secondArrayCount];
                secondArrayCount++;
        }
        
        arrayCount++;
        }
    return newArray;

//        for(int count=0;count<newArray.length;count++){
//            if(firstArrayCount<firstArray.length){
//                newArray[count]=firstArray[firstArray];
//                firstArrayCount++;
//            }
//            if(secondArrayCount < secondArray.length){
//                newArray[++count] = second[secondArrayCount];
//                secondArrayCount++;
//            }
//        }
    }

public static int checkList(int[] arr, int number){
        int index=0;
        for(int count =0; count<arr.length;count++){
            if(arr[count]==number){
            index=count;
            break;
            }
            index=-1;
        }
    return index;
}
//    public static boolean palindrome(String word){
//        char[] newWordArray = word;
//        for(int count = 0; count<numbers.length-1; count++){
//               if(count%2 == 0){
//                newNumbers[counter] = numbers[count];
//                counter++;
//                }    
//        }
//        return newNumbers;
//    } 
    
}
