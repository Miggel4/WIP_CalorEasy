package wip.fhdw.caloreasy.data;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.database.Cursor;

/**
 * Created by Falk on 10.01.2018.
 */
@Dao
public interface GroceryDAO {
    @Query("SELECT * FROM Grocery")
    Cursor getAll();

    @Query("SELECT * FROM Grocery WHERE name=:name")
    Grocery findByName(String name);

    @Insert
    void addItem(Grocery grocery);

    @Delete
    void deleteItem(Grocery grocery);
}
