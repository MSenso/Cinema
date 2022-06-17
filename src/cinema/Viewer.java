package cinema;

import java.util.ArrayList;
import java.util.List;

public class Viewer {
    private String nickName;

    private int age;

    private int filmsCount;

    private List<Cinema> viewedFilms;

    public List<Cinema> getViewedFilms() {
        return viewedFilms;
    }

    public void setViewedFilms(List<Cinema> viewedFilms) {
        this.viewedFilms = viewedFilms == null ? new ArrayList<>() : viewedFilms;
        this.filmsCount = viewedFilms.size();
    }

    public Viewer(String nickName, int age, List<Cinema> viewedFilms) {
        this.nickName = nickName;
        this.age = age;
        this.viewedFilms = viewedFilms == null ? new ArrayList<>() : viewedFilms;
        this.filmsCount = viewedFilms.size();
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
}
