package solidprinciples.leastknowledge;

import java.io.IOException;
import java.net.Socket;

//This method call is allowed because Any method can be called on the current object
public final class NetworkConnection {
    public void close() {

        sendShutdownMessage(); // Allowed?
    }

    private void sendShutdownMessage() {

    }

    //This is allowed because a socket is an instance variable of this class
    protected final class NetworkConnection3 {
        private Socket socket;

        public void close() throws IOException {
            socket.close();
        }
    }
}
