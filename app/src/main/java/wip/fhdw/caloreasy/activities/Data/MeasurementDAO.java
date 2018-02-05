package wip.fhdw.caloreasy.activities.Data;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by Falk on 10.01.2018.
 */
@Dao
public interface MeasurementDAO {
    @Query("SELECT * FROM Measurement")
    List<Measurement> getAll();

    @Query("SELECT * FROM Measurement WHERE longform=:longform")
    Measurement findByName(String longform);

    @Insert
    void insertItem(Measurement measurement);

    @Delete
    void deleteItem(Measurement measurement);
}
