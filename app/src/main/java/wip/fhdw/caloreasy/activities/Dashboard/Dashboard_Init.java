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
import wip.fhdw.caloreasy.activities.Menu_Qty_Set.Menu_Qty_Set_Init;
import wip.fhdw.caloreasy.activities.Settings.Settings_Init;
import wip.fhdw.caloreasy.activities.Menu_View.Menu_View_Init;

public class Dashboard_Init extends AppCompatActivity {

    private Dashboard_Gui mGui;
    private Dashboard_ApplicationLogic mApplicationLogic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initGUI();
        initApplicationLogic();
        //initData();

    }

    private void initApplicationLogic () { mApplicationLogic = new Dashboard_ApplicationLogic(mGui,this); }

    private void initGUI () { mGui = new Dashboard_Gui(this); }

    // private void initData () {}

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

        // noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            startActivity(new Intent(this, Settings_Init.class));
            return true;
        } else if(id == R.id.menu_edit){
            startActivity(new Intent(this, Menu_Edit_Init.class));
            return true;
        } else if(id == R.id.action_test2) {
            startActivity(new Intent(this, Menu_Qty_Set_Init.class));
            return true;
        } else if(id == R.id.action_test3) {
            startActivity(new Intent(this, Menu_View_Init.class));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
