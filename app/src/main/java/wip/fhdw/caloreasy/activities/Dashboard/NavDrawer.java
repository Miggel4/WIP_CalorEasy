package wip.fhdw.caloreasy.activities.Dashboard;

import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;

import wip.fhdw.caloreasy.R;

/**
 * Created by Simon on 11.01.2018.
 */

public class NavDrawer {

    private Toolbar mToolbar;
    private DrawerLayout mDrawer;
    private NavigationView mNavigationView;

    private Dashboard_Init mActivity;


    public NavDrawer(Dashboard_Init activity){
        mActivity = activity;
        init_Gui();
        init_NavDrawerListener();
    }

    private void init_Gui(){
        mActivity.setContentView(R.layout.activity_dashboard);

        mToolbar = (Toolbar) mActivity.findViewById(R.id.toolbar);
        mActivity.setSupportActionBar(mToolbar);

        mDrawer = (DrawerLayout) mActivity.findViewById(R.id.drawer_layout);

        mNavigationView = (NavigationView) mActivity.findViewById(R.id.nav_view);
    }


    private void init_NavDrawerListener(){
        NavDrawerListener navDrawerListener = new NavDrawerListener(mActivity);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                mActivity, mDrawer, mToolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
       mDrawer.addDrawerListener(toggle);
        toggle.syncState();

        mNavigationView.setNavigationItemSelectedListener(navDrawerListener);
    }


}
