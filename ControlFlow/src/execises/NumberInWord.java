package src.execises;

public class NumberInWord {

    public static void main(String[] args) {
        printNumberInWord(5);
    }
    public static void printNumberInWord(int number){
        String numberWord = "";

        switch (number){
            case 0 -> numberWord = "ZERO";
            case 1 -> numberWord = "ONE";
            case 2 -> numberWord =  "TWO";
            case 3 -> numberWord =  "THREE";
            case 4 -> numberWord = "FOURTH";
            case 5 -> numberWord = "FIVE";
            case 6 -> numberWord =  "SIX";
            case 7 -> numberWord =  "SEVEN";
            case 8 -> numberWord = "EIGHT";
            case 9 -> numberWord = "NINE";
            default -> numberWord =  "OTHER";
        }

        System.out.println(numberWord);
    }
}
