package wip.fhdw.caloreasy.activities.Data;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Index;
import android.support.annotation.NonNull;

/**
 * Created by Falk on 10.01.2018.
 */

/****/

@Entity(primaryKeys = {"grocery", "measurement"}, foreignKeys = {@ForeignKey(entity = Grocery.class,
        parentColumns = "name", childColumns = "grocery"), @ForeignKey(entity = Measurement.class,
        parentColumns = "longform", childColumns = "measurement")}
        , indices=@Index(value={"measurement"}))
public class Relation {
    @NonNull
    private String grocery;
    @NonNull
    private String measurement;
    private int amount;

    public Relation(@NonNull String grocery, @NonNull String measurement, int amount) {
        this.grocery = grocery;
        this.measurement = measurement;
        this.amount = amount;
    }

    @NonNull
    public String getGrocery() {
        return grocery;
    }

    public void setGrocery(@NonNull String grocery) {
        this.grocery = grocery;
    }

    @NonNull
    public String getMeasurement() {
        return measurement;
    }

    public void setMeasurement(@NonNull String measurement) {
        this.measurement = measurement;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
