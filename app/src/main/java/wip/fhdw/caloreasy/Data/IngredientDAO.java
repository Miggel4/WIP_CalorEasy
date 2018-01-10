package wip.fhdw.caloreasy.Data;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by Falk on 10.01.2018.
 */
@Dao
public interface IngredientDAO {
    @Query("SELECT * FROM Ingredient")
    List<Ingredient> getAll();

    @Query("SELECT * FROM Ingredient WHERE menuID=:menuID AND name=:name")
    Ingredient getByKeys(int menuID, String name);

    @Insert
    void addIngredient(Ingredient ingredient);

    @Delete
    void deleteIngredient(Ingredient ingredient);
}
