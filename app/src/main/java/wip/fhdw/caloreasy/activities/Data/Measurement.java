package wip.fhdw.caloreasy.activities.Data;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

/**
 * Created by Falk on 10.01.2018.
 */

@Entity
public class Measurement {
    @PrimaryKey @NonNull
    private String longform;
    private String shortform;

    public Measurement(@NonNull String longform, String shortform) {
        this.longform = longform;
        this.shortform = shortform;
    }

    @NonNull
    public String getLongform() {
        return longform;
    }

    public void setLongform(@NonNull String longform) {
        this.longform = longform;
    }

    public String getShortform() {
        return shortform;
    }

    public void setShortform(String shortform) {
        this.shortform = shortform;
    }
}
