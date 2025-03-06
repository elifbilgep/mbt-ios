import org.graphwalker.java.test.Result;
import org.graphwalker.java.test.TestExecutor;
import org.graphwalker.websocket.WebSocketServer;
import org.junit.Test;
import java.io.IOException;

public class AccountCreationTest {
    private final int webSocketPortNumber = 8887;

    @Test
    public void testAccountCreation() throws IOException {
        TestExecutor executor = new TestExecutor(
                SimplifiedSignupModel.class
        );

        WebSocketServer server = new WebSocketServer(webSocketPortNumber, executor.getMachine());
        server.start();

        System.out.println("WebSocket server started on port: " + webSocketPortNumber);

        Result result = executor.execute(true);

        System.out.println("Test execution completed");
    }
}