package wip.fhdw.caloreasy.activities.Grocery_View;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;

import android.util.Log;
import android.widget.ListView;
import java.util.ArrayList;

import wip.fhdw.caloreasy.R;
import wip.fhdw.caloreasy.data.CaloreasyDatabase;


/**
 * Created by Falk on 03.02.2018.
 */

public class Grocery_View_ApplicationLogic {

    private Grocery_View_GUI mGUI;
    AppCompatActivity mActivity;
    private ListView lv;
    private ArrayList<String> myGroceries;

    public Grocery_View_ApplicationLogic(Grocery_View_GUI gui, AppCompatActivity activity){
        mGUI = gui;
        mActivity = activity;
        lv = (ListView) activity.findViewById(R.id.groceriesLV);
        Log.d("test:","test.");
        CaloreasyDatabase db = CaloreasyDatabase.getInstance(mActivity);
        Log.d("Datenbank:","Datenbank Instanz erhalten.");
        Cursor cursor = db.groceryDAO().getAll();
        Log.d("Datenbank:","Query ausgeführt.");
        Grocery_View_ListAdapter adapter = new Grocery_View_ListAdapter(activity.getApplicationContext(), cursor);
        Log.d("ListView:","Adapter erzeugt.");
        lv.setAdapter(adapter);
        Log.d("ListView:","Adapter erzeugt");

    }


}
