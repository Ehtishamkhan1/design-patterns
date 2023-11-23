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
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("ogg", "my song.ogg");
        audioPlayer.play("flac", "high_quality.flac");

        // Demonstrate using additional formats directly
        AdvancedMediaPlayer wavPlayer = new AdvancedMediaPlayer() {
            @Override
            public void play(String fileName) {
                System.out.println("Playing wav file. Name: " + fileName);
            }
        };
        wavPlayer.play("audio_file.wav");
    }
}
