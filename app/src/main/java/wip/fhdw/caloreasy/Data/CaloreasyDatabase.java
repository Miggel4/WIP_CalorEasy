package wip.fhdw.caloreasy.Data;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by Falk on 10.01.2018.
 */
@Database(entities = {Measurement.class,Menu.class, Diary.class, Grocery.class, Relation.class, Ingredient.class}, version = 1)
public abstract class CaloreasyDatabase extends RoomDatabase{
}
