
       let myArray = [310,25,29,23,10,14,2,110,300,4,49,2];
       console.log(maximumIn(myArray));
       console.log(minimumIn(myArray));
       console.log(sumOf(myArray));
       console.log(sumOfEven(myArray));
       console.log(sumOfOdd(myArray));
       console.log(noOfOddNumbersIn(myArray));
       console.log(noOfEvenNumbersIn(myArray));
       console.log(maximumAndMinimumOf(myArray));
       console.log(evenNumbersIn(myArray));
       console.log(oddNumbersIn(myArray));
       console.log(squareNumbersIn(myArray));

    function maximumIn(arrayOfIntegers){
        let largest = arrayOfIntegers[0];
        for(let count=0;count<arrayOfIntegers.length; count++){
            if(largest<arrayOfIntegers[count]){
                largest = arrayOfIntegers[count];
                }
            }
        return largest;
    }
    
     function minimumIn(arrayOfIntegers){
        let smallest = arrayOfIntegers[0];
        for(let count=0;count<arrayOfIntegers.length; count++){
            if(smallest>arrayOfIntegers[count]){
                smallest = arrayOfIntegers[count];
                }
            }
        return smallest;
    }

    function sumOf(arrayOfIntegers){
        let sum = 0;
        for(let count=0;count<arrayOfIntegers.length; count++){
            sum+=arrayOfIntegers[count];
            }
        return sum;
    }

     function sumOfEven(arrayOfIntegers){
        let sumOfEvenNumbers=0;
        for(let count=0;count<arrayOfIntegers.length; count++){
            if(arrayOfIntegers[count]%2 == 0){
                sumOfEvenNumbers+=arrayOfIntegers[count];
                }
            }
        return sumOfEvenNumbers;
    }


     function sumOfOdd(arrayOfIntegers){
        let sumOfOddNumbers=0;
        for(let count=0;count<arrayOfIntegers.length; count++){
            if(arrayOfIntegers[count]%2 != 0){
                sumOfOddNumbers+=arrayOfIntegers[count];
                }
            }
        return sumOfOddNumbers;
    }
    function maximumAndMinimumOf(arrayOfIntegers){
        let smallest = arrayOfIntegers[0];
        let largest = arrayOfIntegers[0];
        let arrayOfMinAndMax = [];
        for(let count=0;count<arrayOfIntegers.length; count++){
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

     function noOfOddNumbersIn(arrayOfIntegers){
        let countOfOddNumbers=0;
        for(let count=0;count<arrayOfIntegers.length; count++){
            if(arrayOfIntegers[count]%2 != 0){
                countOfOddNumbers++;
                }
            }
        return countOfOddNumbers;
    }


     function noOfEvenNumbersIn(arrayOfIntegers){
        let countOfEvenNumbers=0;
        for(let count=0;count<arrayOfIntegers.length; count++){
            if(arrayOfIntegers[count]%2 == 0){
                countOfEvenNumbers++;
                }
            }
        return countOfEvenNumbers;
    }

    function evenNumbersIn(arraysOfIntegers){
        let evenNumbers = []
        for(let integer of arraysOfIntegers){
            if(integer % 2 == 0){            
           evenNumbers.push(integer);
            }
        }
        return evenNumbers;
    }

   function oddNumbersIn(arraysOfIntegers){
        let oddNumbers= [];
        for(let integer of arraysOfIntegers){
            if(integer % 2 != 0){            
           oddNumbers.push(integer);
            }
        }
        return oddNumbers;
    }

    function squareNumbersIn(arrayOfIntegers){
        let squareNumbers= []
        for(let integer of arrayOfIntegers){
            let result = Math.sqrt(integer);
            if(result*10%10 == 0){
                squareNumbers.push(integer);
            }
        }
        return squareNumbers;
    }


