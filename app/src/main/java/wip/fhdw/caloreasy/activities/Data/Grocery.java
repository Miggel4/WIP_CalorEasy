package wip.fhdw.caloreasy.activities.Data;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

/**
 * Created by Falk on 10.01.2018.
 */


@Entity (foreignKeys=@ForeignKey(entity=Measurement.class, parentColumns = "longform", childColumns = "baseMeasurement"),
        indices=@Index(value={"baseMeasurement"}))

public class Grocery {
    @PrimaryKey @NonNull
    private String name;
    private String baseMeasurement;
    private int baseAmount;
    private int baseCalories;

    public Grocery(@NonNull String name, String baseMeasurement, int baseAmount, int baseCalories) {
        this.name = name;
        this.baseMeasurement = baseMeasurement;
        this.baseAmount = baseAmount;
        this.baseCalories = baseCalories;
    }

    @NonNull
    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }

    public String getBaseMeasurement() {
        return baseMeasurement;
    }

    public void setBaseMeasurement(String baseMeasurement) {
        this.baseMeasurement = baseMeasurement;
    }

    public int getBaseAmount() {
        return baseAmount;
    }

    public void setBaseAmount(int baseAmount) {
        this.baseAmount = baseAmount;
    }

    public int getBaseCalories() {
        return baseCalories;
    }

    public void setBaseCalories(int baseCalories) {
        this.baseCalories = baseCalories;
    }
}
