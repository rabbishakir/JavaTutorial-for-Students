package TaskSong;

import java.util.ArrayList;

public class SongDelayClass {
    private String song = "All the bridges that you burn-Come back one day to haunt you-One day you'll find you're walking lonely-Baby I never meant to hurt you-Sometimes the best intentions-Still don't make things right-But all my ghosts they find me";
    private String[] splittedSong = song.split("-");
    private ArrayList<String> songLines = new ArrayList<String>();
    public void playSong(){

        for(int i=0; i<splittedSong.length; i++){
            String[] songLetters = splittedSong[i].split(" ");
            for(String letters:songLetters){
                System.out.print (letters + " ");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(" ");
        }
        // System.out.println(songLines);
    }


}
