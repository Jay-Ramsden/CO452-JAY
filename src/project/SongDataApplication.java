package project;

import SongDataList;
import java.util.ArrayList;
import helpers.InputReader;

public class SongDataApplication {

    private ArrayList<Song> songs;

    public MusicApp()
    {
        songs = new ArrayList<Song>();
        addSomeSongs();
        doMainMenu();
    }

    private void addSomeSongs()
    {
        Song song = new Song("Beautiful", "Anne-Marie", 863015);
        songs.add(song);

        song = new Song("Bad Habits", "Ed Sheeran", 127191452);
        songs.add(song);

        song = new Song("Halo", "Beyonce", 991888598);
        songs.add(song);
    }

    private void doMainMenu()
    {
        boolean wantToQuit = false;

        while(!wantToQuit)
        {
            displayMenu();
            int choice = InputReader.getInt("Please enter your choice > ");

            switch(choice)
            {
                case 1: addSong();break;
                case 2: deleteSong();break;
                case 3: printSongs();
                case 4: wantToQuit = true; break;
            }
        }
    }

    private void displayMenu()
    {
        System.out.println("\n 1. Add Student");
        System.out.println(" 2. Delete Student");
        System.out.println(" 3. Print All Students");
        System.out.println(" 4. Quit\n");

    }

    /**
     * This method will ask the user for the
     * title of the song, the artist name
     * and how many times it has been streamed
     */
    private void addSong()
    {
        System.out.println(" \nAdding a Song\n");
        String title = InputReader.getString("Please enter the song title >");
        String name = InputReader.getString("Please enter the artist name  >");
        int count = InputReader.getInt("Please enter the play count > ");

        Song song = new Song(title, name, count);
        songs.add(song);
    }

    private void deleteSong()
    {

    }

    private Student findSong()
    {
        return null;
    }

    private void printSongs()
    {
        System.out.println("\nPrinting All Songs\n");
        int count = 0;

        for(Song song : songs)
        {
            count++;
            System.out.print("Song " + count + ": ");
            song.print();
        }

        System.out.println();
    }
}
