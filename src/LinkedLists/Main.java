package LinkedLists;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    private static ArrayList<album> albums = new ArrayList<album>();
    private static LinkedList<Song> playlist = new LinkedList<Song>();

    public static void main(String[] args) {
        album album = new album("Shinning Star", "Iron Cross");
        album.addSong("Shinning Star", 3.4);
        album.addSong("fallen angel", 3.8);
        album.addSong("hym for the weekend", 2.95);
        album.addSong("do you love me?", 3.4);
        album.addSong("masterpiece", 3.4);
        albums.add(album);

        album = new album("Brand New World", "Super One");
        album.addSong("Brand New World", 4.1);
        album.addSong("brilliant heart", 4.1);
        album.addSong("Now you see me?", 4.1);
        album.addSong("we are", 4.1);
        album.addSong("I am the best", 4.1);
        albums.add(album);

        albums.get(0).addToPlaylist("Shinning Star", playlist);
        albums.get(0).addToPlaylist("fallen angel", playlist);
        albums.get(0).addToPlaylist(3, playlist);
        albums.get(0).addToPlaylist("Share The World", playlist); //do not exist

        albums.get(1).addToPlaylist("Brand New World", playlist);
        albums.get(1).addToPlaylist("brillant heart", playlist);
        albums.get(1).addToPlaylist(3, playlist);
        albums.get(1).addToPlaylist("ultimate magic", playlist); //do not exist

        play(playlist);


    }

    private static void play(LinkedList<Song> playlist){
        //code here
    }
}
