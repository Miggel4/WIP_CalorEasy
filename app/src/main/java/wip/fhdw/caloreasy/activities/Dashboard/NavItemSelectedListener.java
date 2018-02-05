package wip.fhdw.caloreasy.activities.Dashboard;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.MenuItem;
import android.view.View;

import wip.fhdw.caloreasy.R;
import wip.fhdw.caloreasy.activities.Grocery_View.Grocery_View_Init;
import wip.fhdw.caloreasy.activities.Settings.Settings_Init;

/**
 * Created by Simon on 11.01.2018.
 */

public class NavItemSelectedListener implements NavigationView.OnNavigationItemSelectedListener {

    private Dashboard_Init activity;

    public NavItemSelectedListener(Dashboard_Init dashboard_init){
        activity = dashboard_init;
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_dashboard) {
            activity.startActivity(new Intent(activity, Dashboard_Init.class));
        } else if (id == R.id.nav_groceries) {
            activity.startActivity(new Intent(activity, Grocery_View_Init.class));
        } else if (id == R.id.nav_menus) {
            // Handle the action
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
