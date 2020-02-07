public class MusicLibrary {
    Album[] library = new Album[10];
    Album[] newLibrary = new Album[(library.length - 1) * 2];
    boolean doubleLibrary = false;
    int temp = 0;
    boolean run = true;


    public MusicLibrary() { }

    public void add(Album album) {
        if(!doubleLibrary)
        {
            for(Album i : library)
            {
                if(i == null && run)
                {
                    library[temp] = album;
                    run = false;
                }
                temp++;
            }
            run = true;
            temp = 0;
        }
        if(doubleLibrary)
        {
            for(Album i : newLibrary)
            {
                if(i == null && run)
                {
                    newLibrary[temp] = album;
                    run = false;
                }
                temp++;
            }
            run = true;
            temp = 0;
        }

    }

    public boolean remove(int index)
    {
        if(!doubleLibrary)
        {
            if(library[index] != null)
            {
                library[index] = null;
                return true;
            }

            else
                return false;
        }

        if(doubleLibrary)
        {
            if(newLibrary[index] != null)
            {
                newLibrary[index] = null;
                return true;
            }

            else
                return false;
        }
        return false;
    }

    /*public int location(Album a)
    {
        if(!doubleLibrary)
        {
            for(Album album : library)
            {
                if(album == a)
                {
                    return album.length;
                }
            }
        }

        else {
            for(Album album : newLibrary)
            {
                if(album == a)
                {
                    return album.length;
                }
            }
        }
    }
     */

    public void doubleSize() {
        int length = library.length - 1;
        for (int n = 0; n <= library.length - 1; n++) {
            newLibrary[n] = library[n];
        }
        doubleLibrary = true;
    }

    public String toSting() {
        String result = "";
        if(doubleLibrary)
        {
            for(Album i: newLibrary)
            {
                if(i != null)
                    result+= newLibrary[temp].toString();
                temp++;
            }
            temp = 0;
        }

        else
        {
            for(Album i : library)
            {
                if(i != null)
                    result+= library[temp].toString();
                temp++;
            }
            temp = 0;
        }
        return result;

    }
}