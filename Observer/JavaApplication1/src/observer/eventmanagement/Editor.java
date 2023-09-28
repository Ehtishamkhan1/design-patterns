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
class Editor {
    private EventManager events = new EventManager();
    private File file;

    Editor() {
    }

    void openFile(String path) {
        this.file = new File(path);
        events.notify("open", file.getName());
    }

    void saveFile() {
        if (file != null) {
            file.write();
            events.notify("save", file.getName());
        }
    }

    EventManager getEventManager() {
        return events;
    }
}
