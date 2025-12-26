import java.util.Scanner;
public class TwelveDaysOfChristmas{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of day: ");
        int numberOfDay = input.nextInt();
        String day = "first";
        switch (numberOfDay){
            case 1->
                day ="first";
            case 2->
                day="second";
            case 3->
                day="third";
            case 4->
                day="fourth";
            case 5->
                day="fifth";
            case 6->
                day="sixth";
            case 7->
                day="seventh";
            case 8->
                day="eighth";
            case 9->
                day="nineth";
            case 10->
                day="tenth";
            case 11->
                day="eleventh";
            case 12->
                day="twelveth";
        }
        String verse = "";
        int verseNumber = 1;
        System.out.println("On the " + day + " day of christmas my true lord said to me: " );
        for(int count = numberOfDay; count>=1;count--){
          switch (count){
                case 1->
                    verse = "A Partridge in a Pear Tree";
                case 2->
                    verse = "Two Turtle Doves";
                case 3->
                    verse = "Three French Hens";
                case 4->
                    verse = "Four Calling Birds";
                case 5->
                    verse = "Five Golden Rings";
                case 6->
                    verse = "Six Geese a-Laying";
                case 7->
                    verse = "Seven Swans a-Swimming";
                case 8->
                    verse = "Eight Maids a-Milking";
                case 9->
                    verse = "Nine Ladies Dancing";
                case 10->
                    verse = "Ten Lords a-Leaping";
                case 11->
                    verse = "Eleven Pipers Piping";
                case 12->
                    verse = "Twelve Drummers Drumming ";
                default->
                    System.out.println("Enter a valid day from 1 - 12");
            }
            System.out.printf("%s %n",verse);
        }
//         System.out.println("");
    }
}
