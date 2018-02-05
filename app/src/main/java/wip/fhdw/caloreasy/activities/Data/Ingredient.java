package wip.fhdw.caloreasy.activities.Data;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.support.annotation.NonNull;

/**
 * Created by Falk on 10.01.2018.
 */

@Entity(primaryKeys = {"menuID","name"}, foreignKeys = @ForeignKey(entity = Menu.class, parentColumns = "menuID", childColumns = "menuID"))
public class Ingredient {
    @NonNull
    private String menuID;
    @NonNull
    private String name;
    private String measurement;
    private int calories;
    private int amount;

    public Ingredient(String menuID, @NonNull String name, String measurement, int calories, int amount) {
        this.menuID = menuID;
        this.name = name;
        this.measurement = measurement;
        this.calories = calories;
        this.amount = amount;
    }

    public String getMenuID() {
        return menuID;
    }

    public void setMenuID(String menuID) {
        this.menuID = menuID;
    }

    @NonNull
    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }

    public String getMeasurement() {
        return measurement;
    }

    public void setMeasurement(String measurement) {
        this.measurement = measurement;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
