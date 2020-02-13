public class MusicLibraryCleint {
    public static void main(String[] args) {
        MusicLibrary music = new MusicLibrary();
        Album a1 = new Album("10", "j",  10, 10.0);
        Album a2 = new Album("9", "i", 10, 10.1);
        Album a3 = new Album("8","h",1,1);
        Album a4 = new Album("7","g",1,100);
        Album a5 = new Album("6","f",100,.001);
        Album a6 = new Album("5","e",11,111);
        Album a7 = new Album("4","d",1321,1312);
        Album a8 = new Album("3","c",1321,1312);
        Album a9 = new Album("2","b",1321,1312);
        Album a10 = new Album("1","a",1321,1312);


        music.add(a1);
        music.add(a2);
        music.add(a3);
        music.add(a4);
        music.add(a5);
        music.add(a6);
        music.add(a7);
        music.add(a8);
        music.add(a9);
        System.out.println(music.toSting());
       // music.sortByTitle();
        music.doubleSize();
        System.out.println(music.toSting());
        System.out.println(music.binarySearchTitle("3"));
    }
}
