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
class File {
    private String name;

    File(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public void write() {
        // Implementation to write the file
    }

    void write(String replace) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

