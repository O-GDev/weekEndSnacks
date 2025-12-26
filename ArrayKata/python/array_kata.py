import math
myArray=[310,25,29,23,10,14,2,110,300,4,49,2]


def maximumIn(arrayOfIntegers):
    largest=arrayOfIntegers[0]
    for count in range(0,len(arrayOfIntegers)):
        if largest<arrayOfIntegers[count]:
            largest=arrayOfIntegers[count]
    return largest


def minimumIn(arrayOfIntegers):
    smallest=arrayOfIntegers[0]
    for count in range(0,len(arrayOfIntegers)):
        if smallest>arrayOfIntegers[count]:
            smallest=arrayOfIntegers[count]
    return smallest

def sumOf(arrayOfIntegers):
    sum_total=0
    for count in range(0,len(arrayOfIntegers)):
        sum_total+=arrayOfIntegers[count]
    return sum_total
    

def sumOfEven(arrayOfIntegers):
    sumOfEvenNumbers=0
    for count in range(0,len(arrayOfIntegers)):
        if arrayOfIntegers[count]%2==0:
            sumOfEvenNumbers+=arrayOfIntegers[count]
    return sumOfEvenNumbers



def sumOfOdd(arrayOfIntegers):
    sumOfOddNumbers=0
    for count in range(0,len(arrayOfIntegers)):
        if arrayOfIntegers[count]%2!=0:
            sumOfOddNumbers+=arrayOfIntegers[count]
    return sumOfOddNumbers

def maximumAndMinimumOf(arrayOfIntegers):
    smallest=arrayOfIntegers[0]
    largest=arrayOfIntegers[0]
    arrayOfMinAndMax=[]
    for count in range(0,len(arrayOfIntegers)):
        if smallest>arrayOfIntegers[count]:
            smallest=arrayOfIntegers[count]
        
        if largest<arrayOfIntegers[count]:
            largest=arrayOfIntegers[count]
    arrayOfMinAndMax.append(smallest)
    arrayOfMinAndMax.append(largest)
    return arrayOfMinAndMax
    

def noOfOddNumbersIn(arrayOfIntegers):
    countOfOddNumbers=0
    for count in range(0,len(arrayOfIntegers)):
        if arrayOfIntegers[count]%2!=0:
            countOfOddNumbers+=1
    return countOfOddNumbers

def noOfEvenNumbersIn(arrayOfIntegers):
    countOfEvenNumbers=0
    for count in range(0,len(arrayOfIntegers)):
        if arrayOfIntegers[count]%2==0:
            countOfEvenNumbers+=1
    return countOfEvenNumbers
    

def evenNumbersIn(arrayOfIntegers):
    evenNumbers=[]
    for integer in arrayOfIntegers:
        if integer%2==0:
            evenNumbers.append(integer)
    return evenNumbers
    

def oddNumbersIn(arrayOfIntegers):
    oddNumbers=[]
    for integer in arrayOfIntegers:
        if integer%2!=0:
            oddNumbers.append(integer)
    return oddNumbers
    

def squareNumbersIn(arrayOfIntegers):
    squareNumbers=[]
    for integer in arrayOfIntegers:
        result=math.sqrt(integer)
        if(result*10%10==0):
            squareNumbers.append(integer)
    return squareNumbers
    

print(maximumIn(myArray))
print(minimumIn(myArray))
print(sumOf(myArray))
print(sumOfEven(myArray))
print(sumOfOdd(myArray))
print(noOfOddNumbersIn(myArray))
print(noOfEvenNumbersIn(myArray))
print(maximumAndMinimumOf(myArray))
print(evenNumbersIn(myArray))
print(oddNumbersIn(myArray))
print(squareNumbersIn(myArray))


