package wip.fhdw.caloreasy.activities.Dashboard;

import android.support.v7.app.ActionBarDrawerToggle;

import wip.fhdw.caloreasy.R;

/**
 * Created by Simon on 11.01.2018.
 */

public class Dashboard_ApplicationLogic {

    private Dashboard_Gui mGui;
    private Dashboard_Init mActivity;

    public Dashboard_ApplicationLogic(Dashboard_Init dashboard_Init, Dashboard_Gui gui){
        mGui = gui;
        mActivity = dashboard_Init;
        init_NavDrawerListener();
    }

    private void init_NavDrawerListener(){
        Dashboard_NavDrawerListener navDrawerListener = new Dashboard_NavDrawerListener(mActivity,this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                mActivity, mGui.getmDrawer(), mGui.getmToolbar(), R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        mGui.getmDrawer().addDrawerListener(toggle);
        toggle.syncState();

        mGui.getmNavigationView().setNavigationItemSelectedListener(navDrawerListener);
    }

}
