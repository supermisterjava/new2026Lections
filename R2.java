package revyu;

public class R2 {
    public static void main(String[] args) {
        int number = 8545;

        int minutes = number / 60;
        int seconds = number % 60;
        int hours = minutes / 60;
        minutes = minutes - hours * 60;
        System.out.println("Minutes" + minutes);
        System.out.println("seconds" + seconds);
        System.out.println("hours" + hours);
    }


}
