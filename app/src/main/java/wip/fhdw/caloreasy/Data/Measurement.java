package wip.fhdw.caloreasy.Data;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Falk on 10.01.2018.
 */

@Entity
public class Measurement {
    @PrimaryKey
    private String longform;
    private String shortform;

    public String getLongform() {
        return longform;
    }

    public void setLongform(String longform) {
        this.longform = longform;
    }

    public String getShortform() {
        return shortform;
    }

    public void setShortform(String shortform) {
        this.shortform = shortform;
    }
}
