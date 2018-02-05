package wip.fhdw.caloreasy.activities.Menu_Qty_Set;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import wip.fhdw.caloreasy.R;
import wip.fhdw.caloreasy.activities.Menu_Edit.Menu_Edit_ApplicationLogic;
import wip.fhdw.caloreasy.activities.Menu_Edit.Menu_Edit_Gui;

public class Menu_Qty_Set_Init extends AppCompatActivity {

    private Menu_Qty_Set_Gui mGui;
    private Menu_Qty_Set_ApplicationLogic  mApplicationLogic;
    private Menu_Qty_Set_Data mData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initGUI();
        initApplicationLogic();
        initData();
    }

    private void initGUI () {mGui = new Menu_Qty_Set_Gui(this);}

    private void initApplicationLogic () {mApplicationLogic = new Menu_Qty_Set_ApplicationLogic(mGui, this);}

    private void initData () {}

    private void initClickListener () {}
}
