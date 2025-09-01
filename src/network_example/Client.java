package network_example;

import network_example.network.Network;
import network_example.network.Twitter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Demo class. Everything comes together here.
 */
public class Client{
   public static void main(String[] args) throws IOException {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      Network network = null;
      System.out.print("Input user name: ");
      String userName = reader.readLine();
      System.out.print("Input password: ");
      String password = reader.readLine();

      // Enter the message.
      System.out.print("Input message: ");
      String message = reader.readLine();

      System.out.println("\nChoose social network_example.network for posting message.\n" +
                         "1 - network_example.network.Facebook\n" +
                         "2 - network_example.network.Twitter");
      int choice = Integer.parseInt(reader.readLine());

      // Create proper network_example.network object and send the message.
      if (choice == 1) {
         network = new network_example.network.Facebook(userName, password);
      } else if (choice == 2) {
         network = new Twitter(userName, password);
      }
      network.post(message);
   }
}
