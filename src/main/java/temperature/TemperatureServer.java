package temperature;

import com.newrelic.api.agent.NewRelic;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class TemperatureServer {
    public static final int PORT = 5000;

    ServerSocket server;


    public TemperatureServer() throws IOException {
        server = new ServerSocket(PORT);
    }

    public static void main(String[] args) throws IOException {
        TemperatureServer server = new TemperatureServer();

        while (true) {
           server.start();
        }
    }

    public void start() throws IOException {
        Socket socket = server.accept();
        InputStream inputStream = socket.getInputStream();
        byte[] temperatureBuffer = new byte[11];
        int read = inputStream.read(temperatureBuffer, 0, 11);
        long time = System.currentTimeMillis();

        Map<String, Object>  customEvent = new HashMap<String, Object>();

        while (read == 11) {
            TemperatureOuterClass.Temperature temperature = TemperatureOuterClass.Temperature.parseFrom(temperatureBuffer);
            System.out.printf("%f, %d\n",temperature.getTemperature(), time);
            customEvent.put("celsius", temperature.getTemperature());
            NewRelic.getAgent().getInsights().recordCustomEvent("temperature", customEvent);
            read = inputStream.read(temperatureBuffer, 0, 11);
            time = System.currentTimeMillis();
        }
    }
}
