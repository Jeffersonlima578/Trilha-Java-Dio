


//Description
//In this challenge, the goal is to develop a solution for an online payment system that demonstrates the integration of messaging and event-driven architecture concepts. This system allows users to make payments, either by credit card or by boleto (Brazilian payment method), and processes these payments according to the chosen type. The integration of messaging and event-driven architecture occurs through the communication of payment events via messages in a queue.

//How the System Works:

//The user initiates the payment process by entering the payment amount in Brazilian Reais and the payment type (credit_card or boleto) through data input.

//Payment information is stored in a message queue. This message queue represents the communication channel between different parts of the system, integrating the messaging concept.

//If the chosen payment type is 'credit_card,' the user must provide additional information such as the card number, expiration date, security code, and cardholder's name. These details are also added to the message queue.

//The processPayment function is responsible for extracting relevant information from the message queue, identifying the payment type, and then processing the payment according to the chosen type.

//Integration with event-driven architecture occurs when the processPayment function identifies the payment type. Depending on the payment type (credit card or boleto), the function executes the appropriate logic to process the payment.

//After processing the payment, the function returns a status message indicating whether the payment was successful or if there was a failure. This message is displayed to the user.

//Input
//As input, you will first be asked for the payment amount in Brazilian Reais and then the payment type ('boleto' or 'credit_card'). If the chosen payment type is 'boleto,' only the appropriate output for the event will be returned. If the payment type is 'credit_card,' the user should provide:

//card_number: Representing the credit card number.
//expiration_date: Representing the expiration date (MM/YY).
//security_code: Representing the security code.
//cardholder_name: Representing the cardholder's name.
//Saída
//The expected output is a message indicating the result of the payment processing:

//1. If the boleto payment is successful, the message should indicate: "The payment with boleto was processed successfully."
//2. If the credit card payment is successful, the message should indicate: "The payment with credit card was processed successfully."
//3. If the payment type is different from 'boleto' or 'credit_card,' the message should indicate: "Unrecognized payment type."
 

//Examples
//The table below provides examples with some input data and their respective expected outputs. Be sure to test your program with these examples and with other possible cases.

//Input	Output
//2000
//boleto	
//The payment with boleto was processed successfully.
//10000
//credit_card
//222.222.222.222
//03/29
//010
//Lori Stackhouse	
//The payment with credit card was processed successfully.
//3000
//debit	
//Unrecognized payment type.













import java.util.Scanner;

public class PaymentSystem {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double paymentAmount = scanner.nextDouble();
        scanner.nextLine(); // Consume the pending newline

        String paymentType = scanner.nextLine();

        if (paymentType.equals("boleto")) {
            processBoletoPayment();
        } else if (paymentType.equals("credit_card")) {
            processCreditCardPayment(scanner);
        } else {
            System.out.println("Unrecognized payment type.");
        }
    }

    private static void processBoletoPayment() {
        System.out.println("The payment with boleto was processed successfully.");
    }

    private static void processCreditCardPayment(Scanner scanner) {
        String cardNumber = scanner.nextLine();
        String expirationDate = scanner.nextLine();
        String securityCode = scanner.nextLine();
        String cardholderName = scanner.nextLine();

        // Here, you can add the credit card payment processing logic
        // If needed, you can validate the card details and perform the actual payment

        System.out.println("The payment with credit card was processed successfully.");
    }
}


