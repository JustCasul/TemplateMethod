package network_example.network;

/**
 * Base class of social network_example.network.
 */
public abstract class Network {
   String userName;
   String password;

   Network() {}

   abstract boolean logIn(String userName, String password);
   abstract boolean sendData(byte[] data);
   abstract void logOut();
   abstract void printLogo();
   /**
    * Publish the data to whatever network_example.network.
    */
   public boolean post(String message) {
      // Authenticate before posting. Every network_example.network uses a different
      // authentication method.
      if (logIn(this.userName, this.password)) {
         // Send the post data.
         boolean result =  sendData(message.getBytes());
         logOut();
         return result;
      }
      return false;
   }
}
