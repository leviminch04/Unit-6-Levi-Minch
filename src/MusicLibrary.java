public class MusicLibrary {
    Album[] library = new Album[10];
    int place = 0;
    public MusicLibrary() {}

    public void add(Album album)
    {
        library[place] = album;
        place++;
    }

    public void doubleSize()
    {
        int length = library.length - 1;
        Album[] tempLibrary = new Album[length * 2];
        for(Album i : library)
        {
        }
    }


}
