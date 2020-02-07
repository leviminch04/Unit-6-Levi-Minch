public class MusicLibraryCleint {
    public static void main(String[] args) {
        MusicLibrary music = new MusicLibrary();
        Album dad = new Album("dad", "dad",  10, 10.0);
        Album bigBoi = new Album("bigBoi", "bigBoi", 10, 10.1);
        music.add(dad);
        music.doubleSize();
        music.add(bigBoi);
        System.out.println(music.toSting());
        System.out.println(music.remove(0));
        System.out.println(music.toSting());
        System.out.println(music.remove(0));
    }
}
