import java.util.Scanner;

public class Application{
    public static void main(String[] args){
        TimerService timerService = new TimerService();
        Scanner sc = new Scanner(System.in);
        System.out.println("what number would you like to start with?");
        String startInput = sc.nextLine();
        int start = Integer.parseInt(startInput);
        System.out.println("what number would you like to count up?");
        String countInput = sc.nextLine();
        int count = Integer.parseInt(countInput);
        //String output = timerService.count(start, count);
        String output = timerService.countEvenNumber(start, count);
        System.out.println(output);
    }
}