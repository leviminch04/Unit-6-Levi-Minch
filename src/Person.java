public class Person {
    private int myAge = 0;
    private String myName = "";
    public Person(int myAge, String myName)
    {
        this.myAge = myAge;
        this.myName = myName;
    }

    public int getMyAge() {
        return myAge;
    }

    public String getMyName() {
        return myName;
    }
}
