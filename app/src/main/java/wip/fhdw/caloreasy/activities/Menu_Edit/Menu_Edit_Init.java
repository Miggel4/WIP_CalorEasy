package wip.fhdw.caloreasy.activities.Menu_Edit;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import wip.fhdw.caloreasy.R;

public class Menu_Edit_Init extends AppCompatActivity {

    private Menu_Edit_Gui mGui;
    private Menu_Edit_ApplicationLogic  mApplicationLogic;
    private Menu_Edit_Data mData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initGUI();
        initApplicationLogic();
        initData();

    }

    private void initGUI () {mGui = new Menu_Edit_Gui(this);}

    private void initApplicationLogic () {mApplicationLogic = new Menu_Edit_ApplicationLogic(mGui,this);}

    private void initData () {}

    private void initClickListener () {}


}
