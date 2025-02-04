package main.java.com.semicolon.africa.model;

import java.util.ArrayList;

public class Diaries {
    ArrayList<Diary> diaries = new ArrayList<>();

    public ArrayList<Diary> getDiaries() {
        return diaries;
    }

    public void setDiaries(Diary diary) {
        diaries.add(diary);
    }
    public void findByUserName(String userName) {
        for (Diary diary : diaries) {

        }
    }
    Diary diary1 = new Diary();
}
