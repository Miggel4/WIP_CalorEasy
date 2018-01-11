package wip.fhdw.caloreasy.activities.Dashboard;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.MenuItem;

import wip.fhdw.caloreasy.R;
import wip.fhdw.caloreasy.activities.Settings.Settings_Init;

/**
 * Created by Simon on 11.01.2018.
 */

public class NavDrawerListener
        implements NavigationView.OnNavigationItemSelectedListener {

    private Dashboard_ApplicationLogic mDashboard_ApplicationLogic;
    //private Dashboard_Init activity;

    public NavDrawerListener(Dashboard_Init dashboard_init, Dashboard_ApplicationLogic applicationLogic){
        activity = dashboard_init;
        mDashboard_ApplicationLogic = applicationLogic;

    }


    private Dashboard_Init activity;

    public NavDrawerListener(Dashboard_Init dashboard_init){
        activity = dashboard_init;
    }



    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_groceries) {
            // Handle the action
        } else if (id == R.id.nav_menus) {

        } else if (id == R.id.nav_diary) {

        } else if (id == R.id.nav_entities) {

        } else if (id == R.id.nav_settings) {
            activity.startActivity(new Intent(activity, Settings_Init.class));
        }

        DrawerLayout drawer = (DrawerLayout) activity.findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}
