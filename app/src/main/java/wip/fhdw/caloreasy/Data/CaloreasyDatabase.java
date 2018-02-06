package wip.fhdw.caloreasy.Data;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

/**
 * Created by Falk on 10.01.2018.
 */
@Database(entities = {Measurement.class,Menu.class, Diary.class, Grocery.class, Relation.class, Ingredient.class}, version = 1)
public abstract class CaloreasyDatabase extends RoomDatabase{
    public static final String DB_Name = "CaloreasyDatabase";
    private static volatile CaloreasyDatabase instance;

    static synchronized CaloreasyDatabase getInstance(Context context) {
        if (instance == null) {
            instance = create(context);
            populateWithTestData(instance);
        }
        return instance;
    }

    private static CaloreasyDatabase create(final Context context) {
        return Room.databaseBuilder(
                context,
                CaloreasyDatabase.class,
                DB_Name).build();
    }

    private static void populateWithTestData(CaloreasyDatabase db){
        Measurement measurement = new Measurement("gramm","g");        
        db.measurementDAO().insertItem(measurement);
        Grocery grocery = new Grocery("Zucker", "gramm",20,100);        
        db.groceryDAO().addItem(grocery);        
        Menu menu = new Menu("1","Pizza");        
        db.menuDAO().addMenu(menu);        
        Diary diary = new Diary(1,"03.02.2018","11:22","Pizza",100, 200, "gramm");
        db.diaryDAO().addDiaryEntry(diary);
        Relation relation = new Relation("Zucker","gramm",100);
        db.relationDAO().addRelation(relation);
    }

    public abstract DiaryDAO diaryDAO();
    public abstract GroceryDAO groceryDAO();
    public abstract IngredientDAO ingredientDAO();
    public abstract MeasurementDAO measurementDAO();
    public abstract MenuDAO menuDAO();
    public abstract RelationDAO relationDAO();
}
