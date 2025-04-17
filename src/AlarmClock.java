import javax.sound.sampled.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;

import static java.awt.Toolkit.*;

public class AlarmClock implements Runnable {
    private final LocalTime alarmTime;
    private final String filePath;
    AlarmClock(LocalTime alarmTime,String filePath){
    this.alarmTime=alarmTime;
    this.filePath=filePath;
}
@Override
public void run() {
    while(LocalTime.now().isBefore(alarmTime)){
            try {
                Thread.sleep(1000);
                int hours=LocalTime.now().getHour();
                int minutes=LocalTime.now().getMinute();
                int seconds=LocalTime.now().getSecond();
                System.out.printf("\r%02d:%02d:%02d",hours,minutes,seconds);
            } catch (InterruptedException e) {
                System.out.println("Thread was Interrupted");
            }
        }
    System.out.println("\nAlarm Noises");
    playSound(filePath);
    }
    private void playSound( String filePath){
        File audioFile =new File(filePath);
        try(AudioInputStream audioStream= AudioSystem.getAudioInputStream(audioFile)){
                Clip clip=AudioSystem.getClip();

            clip.open(audioStream);
            clip.start();
            Thread.sleep(3000);
        }
        catch(UnsupportedAudioFileException e){
            System.out.println("Audio file not supported");
        } catch (LineUnavailableException e) {
            System.out.println("Audio Unavailable");
        } catch (IOException e) {
            System.out.println("Error reading audio file");
        }catch(RuntimeException | InterruptedException e){}
    }
}
