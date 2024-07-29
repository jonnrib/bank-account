package main.java.com.finance;

import java.util.Scanner;

public class AccountTerminal {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter the account number:");
    int accountNumber = scanner.nextInt();
    scanner.nextLine();

    System.out.println("Please enter the agency:");
    String agency = scanner.nextLine();

    System.out.println("Please enter the client name:");
    String clientName = scanner.nextLine();

    System.out.println("Please enter the balance:");
    double balance = scanner.nextDouble();

    System.out.printf(
        "Hello %s, thank you for creating an account at our bank. Your agency is %s, account %d, and your balance %.2f is available for withdrawal.%n",
        clientName, agency, accountNumber, balance);

    scanner.close();
  }
}
