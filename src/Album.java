public class Album {
    String name;
    String band;
    int length;
    double time;

    public Album(String name, String band, int length, double time)
    {
        this.name = name;
        this.band = band;
        this.length =length;
        this.time = time;
    }

    public String toString()
    {
        String result = this.name + "/n";
        result += band + "/n";
        result += length + "/n";
        result += time + "/n";
        return result;
    }
}
