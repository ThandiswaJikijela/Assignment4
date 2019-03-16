package solidprinciples.leastknowledge;

/**
 * This is a violation of the Law of Demeter. The method received the parameter person, so all method calls on this 
 * object are allowed. However, calling any methods (in this case getBytes()) on the object returned by either getName() or getPhoto() is not allowed
 */
public class NetworkConnection2 {

    public void send(Person person) {
        sendBytes(person.getName().getBytes());
        sendBytes(person.getPhoto().getBytes());
    }

    private void sendBytes(byte[] bytes) {
    }

}
