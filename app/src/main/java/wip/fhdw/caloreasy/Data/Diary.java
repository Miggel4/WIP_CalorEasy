package wip.fhdw.caloreasy.Data;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import java.sql.Time;
import java.util.Date;

/**
 * Created by Falk on 10.01.2018.
 */
@Entity
public class Diary {
    @PrimaryKey
    private int index;
    private String date;
    private String time;
    private String name;
    private int amount;
    private int calories;
    private String measurement;

    public Diary(int index, String date, String time, String name, int amount, int calories, String measurement) {
        this.index = index;
        this.date = date;
        this.time = time;
        this.name = name;
        this.amount = amount;
        this.calories = calories;
        this.measurement = measurement;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public String getMeasurement() {
        return measurement;
    }

    public void setMeasurement(String measurement) {
        this.measurement = measurement;
    }
}
