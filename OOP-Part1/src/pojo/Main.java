package pojo;

public class Main {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            UPAStudent s = new UPAStudent("S93200" + i ,
                    switch (i){
                        case 1 -> "Marry";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Anoymous";
                    },
                    "05/11/1985",
                    "Java MasterClass");
            System.out.println(s);
        }
    }
}
