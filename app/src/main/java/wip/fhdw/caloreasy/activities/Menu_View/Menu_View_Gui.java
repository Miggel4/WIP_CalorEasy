package wip.fhdw.caloreasy.activities.Menu_View;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import wip.fhdw.caloreasy.R;
import wip.fhdw.caloreasy.activities.Menu_Edit.Menu_Edit_Init;

/**
 * Created by Mesquita on 12.01.2018.
 */

public class Menu_View_Gui {

    public Menu_View_Gui(Menu_View_Init activity) {
        activity.setContentView(R.layout.activity_menu_view);

        setMenuViewActionbar(activity);
    }

    //setup menu view action bar
    private void setMenuViewActionbar(AppCompatActivity activity) {
        // Inflate the custom view and add click handlers for the buttons
        LayoutInflater inflater = LayoutInflater.from(activity);
        View actionBarButtons = inflater.inflate(R.layout.menu_view_actionbar,
                new ConstraintLayout(activity), false);

        // Retrieve an instance of the Activity's ActionBar
        ActionBar actionBar = activity.getSupportActionBar();

        // Hide the icon, title and home/up button
        assert actionBar != null;
        actionBar.setDisplayShowHomeEnabled(false);
        actionBar.setDisplayHomeAsUpEnabled(false);
        actionBar.setDisplayShowTitleEnabled(false);

        // Set the custom view and allow the bar to show it
        actionBar.setCustomView(actionBarButtons);
        actionBar.setDisplayShowCustomEnabled(true);
    }
}
