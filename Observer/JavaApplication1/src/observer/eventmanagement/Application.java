/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer.eventmanagement;

/**
 *
 * @author FA20-BSE-039
 */
public class Application {
    public static void main(String[] args) {
        Application app = new Application();
        app.config();
    }

    private void config() {
        Editor editor = new Editor();

        LoggingListener logger = new LoggingListener("/path/to/log.txt", "Someone has opened the file: %s");
        EmailAlertsListener emailAlerts = new EmailAlertsListener("admin@example.com", "Someone has changed the file: %s");

        // Subscribe listeners to specific event types
        editor.getEventManager().subscribe("open", logger);
        editor.getEventManager().subscribe("save", emailAlerts);

        // Simulate actions in the editor
        editor.openFile("example.txt");
        editor.saveFile();
    }
}
