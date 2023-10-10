

//Description
//Imagine that we are building an innovative traffic monitoring system that uses the principles of event-driven architecture and messaging to enhance the driver's experience. In this system, traffic events such as congestion, accidents, and normal traffic are processed in real-time to provide valuable information to drivers.

//Your task in this challenge is to create a program that simulates part of this system's behavior. The program will receive traffic events, which can be 'Congestion,' 'Accident,' or 'Normal Traffic,' and it should use messaging and event-driven concepts to suggest alternative routes to drivers based on the received event.

//Input
//The program will receive one of the three types of traffic events as input, which are:

//Congestion: indicating the occurrence of congestion on the main route.

//Accident: indicating that an accident has occurred on the main route.

//Normal Traffic: indicating that traffic on the main route is flowing normally.

//Output
//The program's output is a message suggesting an alternative route based on the received traffic event.

//For the 'Accident' event, the return should be: Main road blocked. Use the secondary route.

//For the 'Congestion' event, the return should be: Avoid the main highway; use the secondary road.

//For the 'Normal Traffic' event, the return should be: Normal traffic on the main route. Continue on it.

//For inputs different from the expected patterns, 'Accident,' 'Congestion,' and 'Normal Traffic,' the return should be: Invalid traffic event.

//Examples
//A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

//Input	Output
//Accident	Main road blocked. Use the secondary route.
//Congestion	Avoid the main highway; use the secondary road.
//Normal Traffic	Normal traffic on the main route. Continue on it.
//Exit	Invalid traffic event.




import java.util.Scanner;

public class TrafficMonitoringSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String trafficEvent = scanner.nextLine();

        String alternativeRoute = suggestAlternativeRoute(trafficEvent);

        System.out.println(alternativeRoute);
    }

    private static String suggestAlternativeRoute(String trafficEvent) {
        switch (trafficEvent) {
            case "Accident":
                return "Main road blocked. Use the secondary route.";
            case "Congestion":
                return "Avoid the main highway; use the secondary road.";
            case "Normal Traffic":
                return "Normal traffic on the main route. Continue on it.";
            default:
                return "Invalid traffic event.";
        }
    }
}