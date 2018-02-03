package wip.fhdw.caloreasy.activities.Dashboard;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import wip.fhdw.caloreasy.R;

/**
 * Created by Simon on 11.01.2018.
 */

public class Dashboard_Gui {

    private FragmentPagerAdapter mAdapterViewPager;
    private DrawerLayout mDrawer;
    private NavigationView mNavigationView;
    private Toolbar mToolbar;

    private Dashboard_Init mActivity;

    public Dashboard_Gui(Dashboard_Init activity){

        mActivity = activity;
        mActivity.setContentView(R.layout.activity_dashboard);

        mDrawer = (DrawerLayout) mActivity.findViewById(R.id.drawer_layout);
        mNavigationView = (NavigationView) mActivity.findViewById(R.id.nav_view);

        mToolbar = (Toolbar) mActivity.findViewById(R.id.toolbar);
        mActivity.setSupportActionBar(mToolbar);

        ViewPager vpPager = (ViewPager) mActivity.findViewById(R.id.pager);
        mAdapterViewPager = new MyPagerAdapter(mActivity.getSupportFragmentManager());
        vpPager.setAdapter(mAdapterViewPager);

    }

    public FragmentPagerAdapter getmAdapterViewPager() { return mAdapterViewPager; }

    public DrawerLayout getmDrawer() {
        return mDrawer;
    }

    public NavigationView getmNavigationView() {
        return mNavigationView;
    }

    public Toolbar getmToolbar() {
        return mToolbar;
    }


}
