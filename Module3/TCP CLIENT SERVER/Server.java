import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(5000);
            System.out.println("Server started. Waiting for client...");

            Socket socket = serverSocket.accept();
            System.out.println("Client connected!");

            BufferedReader input = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );

            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            BufferedReader serverMsg = new BufferedReader(
                    new InputStreamReader(System.in)
            );

            // Thread to read messages from client
            Thread readThread = new Thread(() -> {
                String msg;
                try {
                    while ((msg = input.readLine()) != null) {
                        System.out.println("Client: " + msg);
                    }
                } catch (IOException e) {
                    System.out.println("Connection closed.");
                }
            });

            readThread.start();

            // Main thread sends messages to client
            String msgToClient;
            while ((msgToClient = serverMsg.readLine()) != null) {
                output.println(msgToClient);
            }

            socket.close();
            serverSocket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}