package wip.fhdw.caloreasy.activities.Dashboard;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.View;
import android.widget.TextView;

import wip.fhdw.caloreasy.R;

/**
 * Created by Simon on 11.01.2018.
 */

public class Dashboard_ApplicationLogic {

    Dashboard_Init mActivity;
    Dashboard_Gui mGui;

    public Dashboard_ApplicationLogic(Dashboard_Gui gui, Dashboard_Init activity) {

        mActivity = activity;
        mGui = gui;

        init_NavDrawerListener();

    }

    private void init_NavDrawerListener(){

        NavItemSelectedListener navItemSelectedListener = new NavItemSelectedListener(mActivity);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                mActivity, mGui.getmDrawer(), mGui.getmToolbar(), R.string.navigation_drawer_open, R.string.navigation_drawer_close){

            /** Called when a drawer has settled in a completely open state. */
            public void onDrawerStateChanged(int newState) {
                super.onDrawerStateChanged(newState);

                //Update Name in nav header according to shared Preference
                SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(mActivity);
                String prefName = sharedPref.getString("name", "");

                TextView tw = (TextView) mActivity.findViewById(R.id.nav_header_name);
                tw.setText(prefName);
            }

        };

        mGui.getmDrawer().addDrawerListener(toggle);
        toggle.syncState();
        mGui.getmNavigationView().setNavigationItemSelectedListener(navItemSelectedListener);

    }

}