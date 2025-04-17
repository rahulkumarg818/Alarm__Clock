Alarm Clock Program
This is a simple Alarm Clock program written in Java. The program allows you to set an alarm time and plays an audio file when the alarm goes off. It accepts the alarm time in the format **HH.MM.SS** and plays a sound once the specified time is reached.

Features:
- User-friendly input for setting alarm time.
- Validates input time format to ensure correctness.
- Displays real-time countdown until the alarm goes off.
- Plays a custom sound file when the alarm time is reached.

Prerequisites:
- Java 8 or higher is required to run this program.
- The program uses the `javax.sound.sampled` package for playing audio.
- An audio file in `.wav` format is required.

Setup:

1. Clone the Repository:
   - You can clone the repository to your local machine using the following command:
   
   ```bash
   git clone https://github.com/rahulkumarg818/Alarm__Clock.git
   ```

2. Compile the Program**:
   - Navigate to the project directory and compile the Java files using the `javac` command:

   ```bash
   javac Alarm.java AlarmClock.java
   ```

3. Run the Program**:
   - Once the program is compiled, you can run it using the `java` command:

   ```bash
   java Alarm
   ```

4. Set the Alarm:
   - The program will prompt you to enter the alarm time in the format `HH.MM.SS` (e.g., `12.30.00` for 12:30 PM).
   - The alarm will go off when the current time matches the set time.
   - A sound will play for 3 seconds when the alarm time is reached.

Customization:
- Audio File:
  - By default, the program uses the `mixkit-casino-jackpot-alarm-and-coins-1991.wav` audio file. You can replace this file with your own `.wav` file by modifying the file path in the code.
  
  ```java
  String filePath = "path/to/your/audio/file.wav";
  ```

- Time Format:
  - The program expects the time to be entered in the format `HH.MM.SS` (24-hour format).
  
 Troubleshooting:
- If you receive an `UnsupportedAudioFileException`, ensure that the audio file is in a supported `.wav` format.
- If the program doesn't play the sound, make sure that the sound file is accessible and the path is correctly specified.
