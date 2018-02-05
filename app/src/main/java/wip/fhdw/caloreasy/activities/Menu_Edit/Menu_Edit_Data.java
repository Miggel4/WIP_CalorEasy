package wip.fhdw.caloreasy.activities.Menu_Edit;

import android.content.Intent;
import android.os.Bundle;
import android.provider.SyncStateContract;
import android.util.Log;

import java.util.Arrays;
import wip.fhdw.caloreasy.datastructures.Constants;

/**
 * Created by Simon on 11.01.2018.
 */

public class Menu_Edit_Data {

    private Menu_Edit_Init mActivity;
    private String mName;


    public Menu_Edit_Data(Bundle savedInstanceState, Menu_Edit_Init init){
        mActivity = init;

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

    public void saveValueInStorage(long value) {
        Log.d("LOGTAG", "saveValueInStorage ...");
        //tbd in database
    }
}
