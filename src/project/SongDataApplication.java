package project;

import java.util.ArrayList;
import helpers.InputReader;
import project.SongDataList;

/**
 * Our public class that takes us through the processes of the entire code
 */
public class SongDataApplication {

    public ArrayList<SongDataList> songs;

    public SongDataApplication()
    {
        songs = new ArrayList<>();
        addSomeSongs();
        doMainMenu();
    }

    public static void main(String[] args)
    {
        new SongDataApplication();
    }

    /**
     * addSomeSongs() -> adds 10 preset songs to the library to start with
     */
    public void addSomeSongs()
    {
        SongDataList song = new SongDataList("Riot", "Hollywood Undead", 60691727);
        songs.add(song);

        song = new SongDataList("Ain't No Rest for the Wicked", "Cage The Elephant", 519950858);
        songs.add(song);

        song = new SongDataList("You're Gonna Go Far, Kid", "The Offspring", 655020847);
        songs.add(song);

        song = new SongDataList("Don't You Dare (Make Me Fall In Love With You)", "Kaden MacKay", 1807397);
        songs.add(song);

        song = new SongDataList("Kill the Director", "The Wombats", 86837876);
        songs.add(song);

        song = new SongDataList("Wolf In Sheep's Clothing (feat. William Beckett)", "Set It Off", 190568741);
        songs.add(song);

        song = new SongDataList("Partners in Crime (feat. Ash Costello)", "Set It Off", 100636913);
        songs.add(song);

        song = new SongDataList("Why Do I (with Hatsune Miku)", "Set It Off", 2109529);
        songs.add(song);

        song = new SongDataList("Barbie & Ken", "Scene Queen, Set It Off", 3321763);
        songs.add(song);

        song = new SongDataList("I'll Sleep When I'm Dead", "Set It Off", 56823875);
        songs.add(song);
    }

    /**
     * doMainMenu() -> displays main menu using displayMenu() and asks for user input
     * uses switch cases to choose which method is used
     * "wantToQuit" becomes true when 4 is submitted, code stops
     */
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
                case 3: printSongs();break;
                /***case 4: findSongs();***/
                case 5: wantToQuit = true; break;
            }
        }
    }

    /**
     * displayMenu() -> Displays a menu in which the user chooses what option they would like to go to
     * Chooses the method based on the input, but this is just the printing for the menu
     */
    private void displayMenu()
    {
        System.out.println("\n 1. Add a song to the library");
        System.out.println(" 2. Delete a song from the library");
        System.out.println(" 3. Print all songs in the library");
        System.out.println(" 4. Print all songs over x streams in the library");
        System.out.println(" 5. Quit\n");
    }

    /**
     * addSong() -> asks user input for:
     * 1. Song title (String title)
     * 2. Artist name (String artist)
     * 3. Spotify stream amount (int streams)
     */
    private void addSong()
    {
        System.out.println(" \nAdding a Song\n");
        String title = InputReader.getString("Please enter the song title >");
        String artist = InputReader.getString("Please enter the artist name >");
        int streams = InputReader.getInt("Please enter the amount of Spotify streams > ");

        SongDataList song = new SongDataList(title, artist, streams);
        songs.add(song);
        System.out.println("Returning to main menu...");
        doMainMenu();
    }

    /**
     * deleteSong() -> intended for deleting a song from the library
     * 1. Prints the list of songs in the library
     * 2. Asks the user for the number on that list they would like to delete
     * 3. Finds that song in the library
     * 4. Deletes the song from the array
     */
    private void deleteSong()
    {
        System.out.println(" /nDeleting a Song from the Library/n");
        int count = 0;

        for(SongDataList song : songs)
        {
            count++;
            System.out.print("Song " + count + ": ");
            song.print();
        }
        int selectedSong = InputReader.getInt("Please enter the number of the song you would like to delete > ");
        int deletingSong = selectedSong - 1;
        songs.remove(deletingSong);
        System.out.println("You have successfully removed that song from the library.");
        count = 0;

        for(SongDataList song : songs)
        {
            count++;
            System.out.print("Song " + count + ": ");
            song.print();
        }
    }

    /**
     * printSongs() -> prints a list of songs in the library
     * Gives the number in the list that the song is, so selecting a song is easy for deleteSong()
     */
    private void printSongs()
    {
        System.out.println(" Printing All Songs");
        int count = 0;

        for(SongDataList song : songs)
        {
            count++;
            System.out.print("Song " + count + ": ");
            song.print();
        }

        System.out.println("Returning to main menu...");
        doMainMenu();
    }

   /*** private void findSongs()
    {
        System.out.println(" \nPrinting Songs above X Streams\n");
        int requiredStreams = InputReader.getInt("Enter the required amount of streams to ");
        int count = 0;

        for(SongDataList song : songs)
        {
            int streams = songs.indexOf(song.streams);
            if (requiredStreams < streams)
            {
                count++;
                System.out.print("Song " + count + ": ");
                song.print();
            }
        }

        System.out.println("Returning to main menu...");
        doMainMenu();
    } ***/
}