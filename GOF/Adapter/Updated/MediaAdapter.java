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
public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType) {

        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMusicPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMusicPlayer = new Mp4Player();
        } else if (audioType.equalsIgnoreCase("ogg")) {
            advancedMusicPlayer = new OggPlayer();
        } else if (audioType.equalsIgnoreCase("flac")) {
            advancedMusicPlayer = new FlacPlayer();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        advancedMusicPlayer.play(fileName);
    }
}

