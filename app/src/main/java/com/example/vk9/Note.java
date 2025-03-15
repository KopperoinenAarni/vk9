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
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH) + 1;
        int year = calendar.get(Calendar.YEAR);
        String minuteStr = minute < 10 ? "0" + minute : String.valueOf(minute);
        this.timeAndDate = hour + ":" + minuteStr + " " + day + "." + month + "." + year;
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
