import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Alarm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH.mm.ss");
        LocalTime alarmTime=null;
        String filePath="mixkit-casino-jackpot-alarm-and-coins-1991.wav";
        while(alarmTime==null){
            try {
                System.out.print("Enter an Alarm Time (HH.MM.SS): ");
                String inputTime = scanner.nextLine();
                alarmTime = LocalTime.parse(inputTime, formatter);
                System.out.println("Alarm set for-> " + alarmTime);
            }
            catch(DateTimeParseException e) {
                System.out.println("Invalid time Format! Please use HH.MM.SS");

            }
        }
        AlarmClock alarmclock=new AlarmClock(alarmTime,filePath);
        Thread alarmThread= new Thread(alarmclock);
        alarmThread.start();
        scanner.close();
    }
}
