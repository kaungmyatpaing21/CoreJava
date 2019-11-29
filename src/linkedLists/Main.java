package linkedLists;

import java.util.*;

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

    private static void play(LinkedList<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size() == 0) {
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while(!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action) {
                case 0:
                    System.out.println("Playlist complete.");
                    quit = true;
                    break;
                case 1:
                    if(!forward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;

                case 2:
                    if(forward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("We are at the start of the playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if(forward) {
                        if(listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the list");
                        }
                    } else {
                        if(listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We have reached the end of the list");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;

                case 6:
                    if(playList.size() >0) {
                        listIterator.remove();
                        if(listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next());
                        } else if(listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;

            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n" +
                "1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to replay the current song\n" +
                "4 - list songs in the playlist\n" +
                "5 - print available actions.\n" +
                "6 - delete current song from playlist");

    }


    private static void printList(LinkedList<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("================================");
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("================================");
    }
}
