import java.util.Scanner;

public class Meteorology {
    public static void main(String[] args) {

        // Create 2 collator objects for temperature, pressure, humidity
        Collator temperature = new Collator("temperature");
        Collator pressure = new Collator("pressure");
        Collator humidity = new Collator("humidity");

        // perform selection by taking input from keyboard
        System.out.println("Meteorology Program");
        Scanner keyboard = new Scanner(System.in);
        int option;
        do {
            System.out.println("Make selection process and press return");
            System.out.println("1. Record temperature reading");
            System.out.println("2. Record pressure reading");
            System.out.println("3. Record humidity reading");
            System.out.println("4. Print maximum values");
            System.out.println("5. Print minimum values");
            System.out.println("6. Print average values");
            System.out.println("7. Quit");
            option = keyboard.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter value:");
                    temperature.recordReading(keyboard.nextInt());
                    break;
                case 2:
                    System.out.println("Enter value:");
                    pressure.recordReading(keyboard.nextInt());
                    break;
                case 3:
                    System.out.println("Enter value:");
                    humidity.recordReading(keyboard.nextInt());
                    break;
                case 4:
                    System.out.println("Maximum temperature: " + (temperature.numberOfReadings() == 0 ? "-" : temperature.maximum()));
                    System.out.println("Maximum pressure: " + (pressure.numberOfReadings() == 0 ? "-" : pressure.maximum()));
                    System.out.println("Maximum humidity: " + (humidity.numberOfReadings() == 0 ? "-" : humidity.maximum()));
                    break;
                case 5:
                    System.out.println("Minimum temperature: " + (temperature.numberOfReadings() == 0 ? "-" : temperature.minimum()));
                    System.out.println("Minimum pressure: " + (pressure.numberOfReadings() == 0 ? "-" : pressure.minimum()));
                    System.out.println("Minimum humidity: " + (humidity.numberOfReadings() == 0 ? "-" : humidity.minimum()));
                    break;
                case 6:
                    if (temperature.numberOfReadings() == 0)
                        System.out.println("Average temperature: -");
                    else
                        System.out.printf("Average temperature: %.2f\n", temperature.average());

                    if (pressure.numberOfReadings() == 0)
                        System.out.println("Average temperature: -");
                    else
                        System.out.printf("Average temperature: %.2f\n", pressure.average());

                    if (humidity.numberOfReadings() == 0)
                        System.out.println("Average temperature: -");
                    else
                        System.out.printf("Average temperature: %.2f\n", humidity.average());
                    break;
            }
        } while (option != 7);
        keyboard.close();
    }
}