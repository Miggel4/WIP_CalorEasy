package wip.fhdw.caloreasy.activities.Menu_View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import wip.fhdw.caloreasy.R;

public class Menu_View_Init extends AppCompatActivity {

    private Menu_View_Gui mGui;
    private Menu_View_ApplicationLogic mApplicationLogic;
    private Menu_View_Data mData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initGUI();
        initApplicationLogic();
        initData();
    }

    private void initGUI () {mGui = new Menu_View_Gui(this);}

    private void initApplicationLogic () {mApplicationLogic = new Menu_View_ApplicationLogic(mGui, this);}

    private void initData () {}

    private void initClickListener () {}
}
