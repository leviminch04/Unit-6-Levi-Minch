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

    public String getName() {
        return name;
    }

    public String getBand() {
        return band;
    }

    public int getLength() {
        return length;
    }

    public double getTime() {
        return time;
    }

    public String toString()
    {
        String result = "name: " + this.name + ", band: " + band + ", length: " + length + ", time: " + time + "\n";
        return result;
    }
}
