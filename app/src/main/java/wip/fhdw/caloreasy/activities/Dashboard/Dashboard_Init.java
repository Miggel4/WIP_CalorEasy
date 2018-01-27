package wip.fhdw.caloreasy.activities.Dashboard;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import wip.fhdw.caloreasy.R;
import wip.fhdw.caloreasy.activities.Menu_Edit.Menu_Edit_Init;
import wip.fhdw.caloreasy.activities.Menu_Qty_Set.Menu_Qty_Set_Init;
import wip.fhdw.caloreasy.activities.Settings.Settings_Init;

public class Dashboard_Init extends AppCompatActivity {

    private Dashboard_Gui mGui;
    private Dashboard_ApplicationLogic mApplicationLogic;
    private NavDrawer mNavDrawer;
    private FragmentPagerAdapter adapterViewPager;
    private Dashboard_ClickListener mClickListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //initNavDrawer();

        initGUI();
        initApplicationLogic();
        //initData();

        ViewPager vpPager = (ViewPager) findViewById(R.id.pager);
        adapterViewPager = new MyPagerAdapter(getSupportFragmentManager());
        vpPager.setAdapter(adapterViewPager);

        // initClickListener(vpPager);
    }

    private void initNavDrawer (){mNavDrawer = new NavDrawer(this);}

    private void initGUI () {mGui = new Dashboard_Gui(this);}

    private void initApplicationLogic () {mApplicationLogic = new Dashboard_ApplicationLogic(mGui,this);}

    //private void initData () {}

    // private void initClickListener (ViewPager vpPager) {mClickListener = new Dashboard_ClickListener(mGui, this, vpPager);}

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.dashboard, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            startActivity(new Intent(this, Settings_Init.class));
            return true;
        }else if(id == R.id.menu_edit){
            startActivity(new Intent(this, Menu_Edit_Init.class));
            return true;
        }else if(id == R.id.action_test2) {
            startActivity(new Intent(this, Menu_Qty_Set_Init.class));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public static class MyPagerAdapter extends FragmentPagerAdapter {
        private static int NUM_ITEMS = 3;

        public MyPagerAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        // Returns total number of pages
        @Override
        public int getCount() {
            return NUM_ITEMS;
        }

        // Returns the fragment to display for that page
        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0: // Fragment # 0 - This will show OverviewFragment
                    return OverviewFragment.newInstance(0, "Overview");
                case 1: // Fragment # 1 - This will show HistoryFragment
                    return HistoryFragment.newInstance(1, "History");
                case 2: // Fragment # 2 - This will show TodayFragment
                    return TodayFragment.newInstance(2, "Today");
                default:
                    return null;
            }
        }

        // Returns the page title for the top indicator
        @Override
        public CharSequence getPageTitle(int position) {
            return "Page " + position;
        }

    }

}
