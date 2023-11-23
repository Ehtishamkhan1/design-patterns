/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Updated;

/**
 *
 * @author FA20-BSE-039
 */
public class OggPlayer implements AdvancedMediaPlayer {
    @Override
    public void play(String fileName) {
        System.out.println("Playing ogg file. Name: " + fileName);
    }
}

