package wip.fhdw.caloreasy.data;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by Falk on 10.01.2018.
 */
@Dao
public interface MenuDAO {
    @Query("SELECT * FROM Menu")
    List<Menu> getAll();

    @Query("SELECT * FROM Menu WHERE menuID=:menuID")
    Menu getByID(int menuID);

    @Insert
    void addMenu(Menu menu);

    @Delete
    void deleteMenu(Menu menu);
}
