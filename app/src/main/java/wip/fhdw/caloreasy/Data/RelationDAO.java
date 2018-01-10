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
public interface RelationDAO {
    @Query("SELECT * FROM Relation")
    List<Relation> getAll();

    @Query("SELECT * FROM Relation WHERE grocery=:grocery AND measurement=:measurement")
    Relation getByKeys(String grocery, Measurement measurement);

    @Insert
    void addRelation(Relation relation);

    @Delete
    void deleteRelation(Relation relation);
}
