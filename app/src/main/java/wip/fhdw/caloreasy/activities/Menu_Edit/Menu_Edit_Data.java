package wip.fhdw.caloreasy.activities.Menu_Edit;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

import wip.fhdw.caloreasy.datastructures.Constants;

/**
 * Created by Simon on 11.01.2018.
 */

public class Menu_Edit_Data {

    private Menu_Edit_Init mActivity;
    private String mName;
    private ArrayList<Ingredient> mIngredients;

    public Menu_Edit_Data(Bundle savedInstanceState, Menu_Edit_Init init){
        mActivity = init;
        mIngredients = new ArrayList<Ingredient>();

        if ( savedInstanceState == null ) {
            readIntentParametersOrSetDefaultValues(mActivity.getIntent());
        }
        else { // restore last state
            restoreDataFromBundle(savedInstanceState);
        }

    }


    public void readIntentParametersOrSetDefaultValues(Intent intent) {
        Bundle b = intent.getBundleExtra(Constants.KEYMENUEDITNAME);
        if(b==null){
            setDefaultValues();
        }
        else{
            restoreDataFromBundle(b);
        }
    }

    private void setDefaultValues() {
        // needed? (case: create menu)
    }

    public void saveDataInBundle(Bundle b) {
        b.putString(Constants.KEYMENUEDITNAME, mName);
    }

    public void restoreDataFromBundle(Bundle b) {
        mName = b.getString(Constants.KEYMENUEDITNAME);
    }

    public void addValueToList(Ingredient ingredient) {
        Log.d("LOGTAG", "addValueToList ...");
        mIngredients.add(ingredient);
    }

    public ArrayList<Ingredient> getmIngredients(){
        return this.mIngredients;
    }

    public void addValueToList(String grocery, String unit, int quantity) {
        Log.d("LOGTAG", "addValueToList ...");

        Ingredient ingredient = new Ingredient(grocery,unit,quantity);
        mIngredients.add(ingredient);
    }
}
