package wip.fhdw.caloreasy.activities.Menu_Qty_Set;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import wip.fhdw.caloreasy.activities.Dashboard.Dashboard_Init;

/**
 * Created by Mesquita on 12.01.2018.
 */

public class Menu_Qty_Set_ApplicationLogic {
    Menu_Qty_Set_Gui mGui;
    AppCompatActivity mActivity;

    public Menu_Qty_Set_ApplicationLogic(Menu_Qty_Set_Gui gui, AppCompatActivity activity) {
        mGui = gui;
        mActivity = activity;
        initClickListener();
    }

    private void initClickListener() {
        Menu_Qty_Set_ClickListener cl;
        cl = new Menu_Qty_Set_ClickListener(this);

        mGui.getmDoneActionView().setOnClickListener(cl);
        mGui.getmCancelActionView().setOnClickListener(cl);
    }

    public void onViewActionCancelClicked() {
        //tbd
        mActivity.startActivity(new Intent(mActivity, Dashboard_Init.class));
    }

    public void onViewActionDoneClicked() {
        //tbd
        mActivity.startActivity(new Intent(mActivity, Dashboard_Init.class));
    }
}
