package wip.fhdw.caloreasy.Data;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Falk on 10.01.2018.
 */

@Entity
public class Menu {
    @PrimaryKey
    private String menuID;
    private String name;

    public String getMenuID() {
        return menuID;
    }

    public void setMenuID(String menuID) {
        this.menuID = menuID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
