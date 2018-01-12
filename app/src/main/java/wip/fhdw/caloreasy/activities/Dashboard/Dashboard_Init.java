package wip.fhdw.caloreasy.activities.Dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import wip.fhdw.caloreasy.R;
import wip.fhdw.caloreasy.activities.Menu_Edit.Menu_Edit_Init;
import wip.fhdw.caloreasy.activities.Settings.Settings_Init;

public class Dashboard_Init extends AppCompatActivity {

    private Dashboard_Gui mGui;
    private Dashboard_ApplicationLogic mApplicationLogic;
    private NavDrawer mNavDrawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initNavDrawer();

        //initGUI();
        //initApplicationLogic();
        //initData();
    }

    private void initNavDrawer(){mNavDrawer = new NavDrawer(this);}

    //private void initGUI () {}
    //private void initApplicationLogic () {}
    //private void initData () {}

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
        }else if(id == R.id.action_test){
            startActivity(new Intent(this, Menu_Edit_Init.class));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
