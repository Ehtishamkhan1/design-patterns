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
class LoggingListener implements EventListener {
    private File log;
    private String message;

    LoggingListener(String logFilename, String message) {
        this.log = new File(logFilename);
        this.message = message;
    }

    @Override
    public void update(String filename) {
        log.write(message.replace("%s", filename));
    }
}
