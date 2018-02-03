package wip.fhdw.caloreasy.Data;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

/**
 * Created by Falk on 10.01.2018.
 */

@Entity
public class Menu {
    @PrimaryKey @NonNull
    private String menuID;
    private String name;

    public Menu(@NonNull String menuID, String name) {
        this.menuID = menuID;
        this.name = name;
    }

    @NonNull
    public String getMenuID() {
        return menuID;
    }

    public void setMenuID(@NonNull String menuID) {
        this.menuID = menuID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
