public class MusicLibraryCleint {
    public static void main(String[] args) {
        MusicLibrary music = new MusicLibrary();
        Album a1 = new Album("a1", "a1",  10, 10.0);
        Album a2 = new Album("a2", "a2", 10, 10.1);
        music.add(a1);
        music.doubleSize();
        music.add(a2);
        System.out.println(music.toSting());
        System.out.println(music.findTitle("a2"));
    }
}
