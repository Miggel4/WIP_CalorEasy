package wip.fhdw.caloreasy.activities.Settings;

import android.content.SharedPreferences;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.util.Log;

import wip.fhdw.caloreasy.R;

/**
 * Created by Simon on 05.01.2018.
 */

public class PreferenceChangeListener implements SharedPreferences.OnSharedPreferenceChangeListener {

    private PreferenceActivity mPrefActivity;

    public PreferenceChangeListener(PreferenceActivity prefActivity){
        mPrefActivity = prefActivity;
    }

    @Override
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {

        if ( key.equals("name")) {
            Log.v("PreferenceChange", "**** KEY name modified ****");

            //for API10 findPreference(key) can only be executed non static
            Preference connectionPref = mPrefActivity.findPreference(key);

            // Set summary to be the user-description for the selected value
            connectionPref.setSummary(sharedPreferences.getString(key, ""));
            // Update String Resource for e.g. nav drawer header
            //R.string.nav_header_name;

        }else if(key.equals("calories_picker")){
            Log.v("PreferenceChange", "**** KEY calories_picker modified ****");

            //for API10 findPreference(key) can only be executed non static
            Preference connectionPref = mPrefActivity.findPreference(key);

            // Set summary to be the user-description for the selected value
            connectionPref.setSummary("" + sharedPreferences.getInt(key, 0));
        }
    }

}
