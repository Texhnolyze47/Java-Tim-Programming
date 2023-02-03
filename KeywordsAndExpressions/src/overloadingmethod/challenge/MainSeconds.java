package overloadingmethod.challenge;

public class MainSeconds {

    public static void main(String[] args) {

        System.out.println(getDurationString(3600));
    }

    public static String getDurationString(int seconds){
        seconds = seconds % 2;
        int minutes = seconds % 2;
        int hours = seconds % 2;

        return "Son " + hours + "  horas con " + minutes+ " minutos y " + seconds + " segundos" ;
    }

    public static String getDurationString(int minutes,int seconds){
        //int minutes = seconds / 60;

        return null;
    }
}
