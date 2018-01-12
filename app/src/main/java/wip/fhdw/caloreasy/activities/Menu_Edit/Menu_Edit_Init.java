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


/*
        // Inflate the custom view and add click handlers for the buttons
        LayoutInflater inflater = LayoutInflater.from(this);
        View actionBarButtons = inflater.inflate(R.layout.edit_custom_actionbar,
                new LinearLayout(this), false);

        View cancelActionView = actionBarButtons.findViewById(R.id.action_cancel);
        //cancelActionView.setOnClickListener(mActionBarListener);

        View doneActionView = actionBarButtons.findViewById(R.id.action_done);
        //doneActionView.setOnClickListener(mActionBarListener);

        // Retrieve an instance of the Activity's ActionBar
        ActionBar actionBar = this.getSupportActionBar();

        // Hide the icon, title and home/up button
        actionBar.setDisplayShowHomeEnabled(false);
        actionBar.setDisplayHomeAsUpEnabled(false);
        actionBar.setDisplayShowTitleEnabled(false);

        // Set the custom view and allow the bar to show it
        actionBar.setCustomView(actionBarButtons);
        actionBar.setDisplayShowCustomEnabled(true);
*/
    }

    private void initGUI () {mGui = new Menu_Edit_Gui(this);}

    private void initApplicationLogic () {mApplicationLogic = new Menu_Edit_ApplicationLogic(mGui,this);}

    private void initData () {}

    private void initClickListener () {}


}
