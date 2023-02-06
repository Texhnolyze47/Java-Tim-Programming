package src.execises;

public class EvenNumber {

    public static void main(String[] args) {
        int start = 4;
        int end = 20;
        int countEvenNumber = 0;
        int countOddNumber = 0;
        while (start <= end){
            start++;
            if (isEvenNumber(start)){
                System.out.println("Even number " + start);
                countEvenNumber++;
                if (countEvenNumber == 5){
                    System.out.println("5 even numbers are found");
                    break;
                }
            }else {
                countOddNumber++;
            }
        }
        System.out.println("Total of even numbers " + countEvenNumber);
        System.out.println("Total of odd numbers " + countOddNumber);

    }

    public static boolean isEvenNumber(int even){
        if (even % 2 == 0){
            return true;
        }
        return false;
    }

}
