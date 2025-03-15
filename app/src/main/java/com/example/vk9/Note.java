package com.example.vk9;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Note {

    private static int idCounter = 0;
    private int Id;
    private String title;
    private String content;
    private String timeAndDate;

    public Note(String title, String content) {
        this.Id = ++idCounter;
        this.title = title;
        this.content = content;
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm dd.MM.yyyy");
        this.timeAndDate = sdf.format(Calendar.getInstance().getTime());
    }

    public int getId() {
        return Id;
    }
    public String getTitle() {
        return title;
    }
    public String getContent() {
        return content;
    }
    public String getTimeAndDate() {
        return timeAndDate;
    }
}
