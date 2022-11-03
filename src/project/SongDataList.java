package project;

public class SongDataList {
    private int id;

    private String title;

    private String artist;

    private int playCount;

    public Song(String title, String artist, int streams)
    {
        this.title = title;
        this.artist = artist;
        this.playCount = streams;
    }

    public void print()
    {
        System.out.println(title + " by " + artist + " plays: " + playCount);
    }
}
