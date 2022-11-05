package project;

import java.util.ArrayList;
import helpers.InputReader;

public class SongDataApplication {

    private ArrayList<SongDataList> songs;

    public SongDataApplication()
    {
        songs = new ArrayList<>();
        addSomeSongs();
        doMainMenu();
    }

    private void addSomeSongs()
    {
        SongDataList song = new SongDataList("Riot", "Hollywood Undead", 60691727);
        songs.add(song);

        song = new SongDataList("Ain't No Rest for the Wicked", "Cage The Elephant", 519950858);
        songs.add(song);

        song = new SongDataList("You're Gonna Go Far, Kid", "The Offspring", 655020847);
        songs.add(song);

        song = new SongDataList("Don't You Dare (Make Me Fall In Love With You", "Kaden MacKay", 1807397);
        songs.add(song);

        song = new SongDataList("Kill the Director", "The Wombats", 86837876);
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
        System.out.println("\n 1. Add a song to the library");
        System.out.println(" 2. Delete a song from the library");
        System.out.println(" 3. Print all songs in the library");
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
        String artist = InputReader.getString("Please enter the artist artist  >");
        int streams = InputReader.getInt("Please enter the play count > ");

        SongDataList song = new SongDataList(title, artist, streams);
        songs.add(song);
    }

    private void deleteSong()
    {

    }

    private SongDataList findSong()
    {
        return null;
    }

    private void printSongs()
    {
        System.out.println("\nPrinting All Songs\n");
        int count = 0;

        for(SongDataList song : songs)
        {
            count++;
            System.out.print("Song " + count + ": ");
            song.print();
        }

        System.out.println();
    }
}
