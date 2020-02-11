public class MusicLibrary {
    Album[] library = new Album[10];
    Album[] newLibrary = new Album[(library.length - 1) * 2];
    boolean doubleLibrary = false;
    int temp = 0;
    boolean run = true;


    public MusicLibrary() { }

    public void add(Album album)
    {
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

    public void sortByTitle()
    {
        Album temp;
        int min;
        for (int i = 0; i < library.length - 1; i++)
        { min = i;
            for (int scan = i; scan < library.length; scan++)
            {
                if(library[scan] != null && library[i] != null)
                {
                    if(library[scan].getName().compareTo(library[min].getName()) < 0)
                    {
                        min = scan;
                    }
                }
            }

            temp = library[min];
            library[min] = library[i];
            library[i] = temp;
        }
    }

    public void sortByArtist()
    {
        for (int i = 0; i < library.length; i++) {
            Album key = library[i];
            int position = i;

            if(key != null && library[1] != null)
            {
                while(position > 0 && (library[position - 1].getBand().compareTo(key.getBand()) > 0))
                {
                    library[position] = library[position - 1];
                    position--;
                }
                library[position] = key;
            }
        }
    }

    public int binarySearchTitle(String target) {
        sortByTitle();
        if(!doubleLibrary)
        {
            int low = 0, high = library.length-1, middle = (low + high)/2;
            while (!library[middle].getName().equals(target) && (low <= high) && library[middle] != null){
                if (target.compareTo(library[middle].getName()) < 0)
                    high = middle - 1;
                else
                    low = middle + 1;
                middle = (low + high)/2;
            }

            if (library[middle].getName().equals(target))
                return middle;
            else
                return -1;
        }
        else
        {
            int low = 0, high = library.length-1, middle = (low + high)/2;
            while (!library[middle].getName().equals(target) && (low <= high) && library[middle] != null){
                if (target.compareTo(library[middle].getName()) < 0)
                    high = middle - 1;
                else
                    low = middle + 1;
                middle = (low + high)/2;
            }

            if (library[middle].getName().equals(target))
                return middle;
            else
                return -1;
        }

    }


    public Album getAlbum(int index)
    {
        if(!doubleLibrary)
            if(index >= 0 && index < library.length)
                return library[index];
        else
            if(index >= 0 && index < newLibrary.length)
                return newLibrary[index];
        return null;

    }

    public int findTitle(String title)
    {
        if(!doubleLibrary)
        {
            for(int i = 0; i < library.length; i++)
            {
                if (library[i] != null && library[i].getName().equals(title))
                {
                    return i;
                }
            }
        }

        else {
            for(int i = 0; i < newLibrary.length; i++)
            {
                if (newLibrary[i] != null && newLibrary[i].getName().equals(title))
                {
                    return i;
                }
            }
        }
        return -1;
    }

    public int findBand(String band)
    {
        if(!doubleLibrary)
        {
            for(int i = 0; i < library.length; i++)
            {
                if (library[i] != null && library[i].getBand().equals(band))
                {
                    return i;
                }
            }
        }

        else {
            for(int i = 0; i < newLibrary.length; i++)
            {
                if (newLibrary[i] != null && newLibrary[i].getBand().equals(band))
                {
                    return i;
                }
            }
        }
        return -1;
    }


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