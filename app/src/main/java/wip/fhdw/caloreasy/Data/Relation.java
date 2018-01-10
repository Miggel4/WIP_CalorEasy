package wip.fhdw.caloreasy.Data;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Falk on 10.01.2018.
 */

@Entity(primaryKeys = {"grocery", "measurement"}, foreignKeys = {@ForeignKey(entity = Grocery.class,
        parentColumns = "name", childColumns = "grocery"), @ForeignKey(entity = Measurement.class,
        parentColumns = "longform", childColumns = "measurement")})
public class Relation {
    private String grocery;
    private String measurement;
    private int amount;

    public Relation(String grocery, String measurement, int amount) {
        this.grocery = grocery;
        this.measurement = measurement;
        this.amount = amount;
    }

    public String getGrocery() {
        return grocery;
    }

    public void setGrocery(String grocery) {
        this.grocery = grocery;
    }

    public String getMeasurement() {
        return measurement;
    }

    public void setMeasurement(String measurement) {
        this.measurement = measurement;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
