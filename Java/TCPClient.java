import java.io.*;

public class TCPClient {
    public static void main(String... args) throws IOException {
        String host = args[0];
        int port = Integer.valueOf(args[1]);
        String toSend = "";
        for (int i = 2; i < args.length; i++) {
            toSend += args[i];
            if (i+1 < args.length)
                toSend += " ";
        }
        System.out.println("Connecting to " + host + " on " + port + " sending " + toSend);

        // Now it's up to you to connect and send and all that
    }
}
