package wip.fhdw.caloreasy.activities.Dashboard;


import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;

import wip.fhdw.caloreasy.R;

/**
 * Created by Simon on 11.01.2018.
 */

public class Dashboard_Gui {

    private Toolbar mToolbar;
    private DrawerLayout mDrawer;
    private NavigationView mNavigationView;


    public Dashboard_Gui(Dashboard_Init activity){

        activity.setContentView(R.layout.activity_dashboard);

        mToolbar = (Toolbar) activity.findViewById(R.id.toolbar);
        activity.setSupportActionBar(mToolbar);

        mDrawer = (DrawerLayout) activity.findViewById(R.id.drawer_layout);

        mNavigationView = (NavigationView) activity.findViewById(R.id.nav_view);

    }

    public Toolbar getmToolbar() {
        return mToolbar;
    }

    public DrawerLayout getmDrawer() {
        return mDrawer;
    }

    public NavigationView getmNavigationView() {
        return mNavigationView;
    }


}
