import java.util.Scanner
public class LogisticsService{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int collectionRate = input.nextInt();
    logisticsService(collectionRate);
    }


    public static int logisticsService(int collectionRate){
    int basepay=5000;
    int ridersWage;
    int amountPerPercel;
    
    if(collectionRate<50){
            amountPerPercel = 160;
        }
    if(collectionRate>=50 && collectionRate<60){
            amountPerPercel = 200;
        }
    if(collectionRate>=60 && collectionRate<70){
            amountPerPercel = 250;
        }
    if(collectionRate>=70){
            amountPerPercel = 500;
        }

    ridersWage = collectionRate * ammountPerPercel + basepay;

    return ridersWage;
    }

//section 2

    public static int largestElement(int[] numbers){
        largestNumber=numbers[0];
        for(int index=0;index<=numbers.lenght-1;index++){
        if(largestNumber<numbers[index]){
            largestNumber=number[index];        
        }
        }
        return largestNumber
    }

    public static Static elementOccurs(int number){
        int numbers
    }
}
