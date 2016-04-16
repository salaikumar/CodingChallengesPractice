/*
*  Given a number, sum the digits to recursively so that the total sum becomes a single number
*/

public class SumDigits{

  public int sumDigits(int number){
    int sum = 0;
    int givenNumber = number;
    while(sum > 10  || givenNumber > 10){
      sum += givenNumber % 10;
      givenNumber = givenNumber / 10;
      if (givenNumber < 10) {
          sum += givenNumber;
          givenNumber = sum;
          sum = 0;
      }
    }
    return sum + givenNumber;
  }
}
