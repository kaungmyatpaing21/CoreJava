package LinkedLists;

import java.util.ArrayList;
import java.util.LinkedList;

public class album {
    private String name;
    private String artist;
    private ArrayList<Song> album;

    public album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.album = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration){
        if(findSong(title) == null){
            this.album.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    public Song findSong(String title){
        for(Song checkSong : album){
            if(checkSong.getName().equals(title)){
                return checkSong;
            }
        }
        return null;
    }

    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playlist){
        int index = trackNumber - 1;
        if(index >= 0 && index <= this.album.size()){
            playlist.add(this.album.get(index));
            return true;
        }
        return false;
    }

    public boolean addToPlaylist(String title, LinkedList<Song> playlist){
        Song checkedSong = findSong(title);
        if(checkedSong != null){
            playlist.add(checkedSong);
            return true;
        }
        return false;
    }
}
