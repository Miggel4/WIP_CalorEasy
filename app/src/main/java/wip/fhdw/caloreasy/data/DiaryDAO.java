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
public interface DiaryDAO {
    @Query("SELECT * FROM Diary")
    List<Diary> getAll();

    @Query("SELECT * FROM Diary WHERE date BETWEEN :minDate AND :maxDate")
    List<Diary> getByTimespan(String minDate, String maxDate);

    @Insert
    void addDiaryEntry(Diary diary);

    @Delete
    void deleteDiaryEntry(Diary diary);
}
