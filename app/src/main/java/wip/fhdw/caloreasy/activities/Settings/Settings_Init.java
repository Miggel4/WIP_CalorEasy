package wip.fhdw.caloreasy.activities.Settings;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.support.v7.app.ActionBar;
import android.preference.PreferenceManager;
import android.view.MenuItem;

import wip.fhdw.caloreasy.R;
import wip.fhdw.caloreasy.activities.Dashboard.Dashboard_Init;

/**
 * A {@link PreferenceActivity} that presents a set of application settings. On
 * handset devices, settings are presented as a single list. On tablets,
 * settings are split by category, with category headers shown to the left of
 * the list of settings.
 * <p>
 * See <a href="http://developer.android.com/design/patterns/settings.html">
 * Android Design: Settings</a> for design guidelines and the <a
 * href="http://developer.android.com/guide/topics/ui/settings.html">Settings
 * API Guide</a> for more information on developing a Settings UI.
 */
public class Settings_Init extends AppCompatPreferenceActivity {

    SharedPreferences.OnSharedPreferenceChangeListener mPreferenceListener;
    SharedPreferences mPrefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.preferences);

        mPrefs = PreferenceManager.getDefaultSharedPreferences(this);
        mPreferenceListener = new PreferenceChangeListener(this);
        mPrefs.registerOnSharedPreferenceChangeListener(mPreferenceListener);

        // Trigger the listener immediately with the preference's
        // current value.
        mPreferenceListener.onSharedPreferenceChanged(PreferenceManager.getDefaultSharedPreferences(this),"name");
        mPreferenceListener.onSharedPreferenceChanged(PreferenceManager.getDefaultSharedPreferences(this),"calories_picker");

        setupActionBar();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mPrefs.unregisterOnSharedPreferenceChangeListener(mPreferenceListener);
    }

    @Override
    protected void onResume() {
        super.onResume();
        getPreferenceScreen().getSharedPreferences()
                .registerOnSharedPreferenceChangeListener(mPreferenceListener);
    }

    @Override
    protected void onPause() {
        super.onPause();
        getPreferenceScreen().getSharedPreferences()
                .unregisterOnSharedPreferenceChangeListener(mPreferenceListener);
    }
    /**
     * Set up the {@link android.app.ActionBar}, if the API is available.
     */
    private void setupActionBar() {
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            // Show the Up button in the action bar.
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public boolean onOptionsItemSelected(final MenuItem item) {

        switch (item.getItemId()) {
            case android.R.id.home:
                //use onBackPressed() OR finish();
                startActivity(new Intent(this, Dashboard_Init.class));
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
