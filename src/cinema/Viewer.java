package cinema;

public class Viewer {
    private String nickName;

    private int age;

    private int filmsCount;

    public Viewer(String nickName, int age, int filmsCount) {
        this.nickName = nickName;
        this.age = age;
        this.filmsCount = filmsCount;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getFilmsCount() {
        return filmsCount;
    }

    public void setFilmsCount(int filmsCount) {
        this.filmsCount = filmsCount;
    }
}
