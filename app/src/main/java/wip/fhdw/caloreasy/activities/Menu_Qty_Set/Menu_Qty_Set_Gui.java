package wip.fhdw.caloreasy.activities.Menu_Qty_Set;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import wip.fhdw.caloreasy.R;

/**
 * Created by Mesquita on 12.01.2018.
 */

public class Menu_Qty_Set_Gui {

    private View mCancelActionView;
    private View mDoneActionView;

    public Menu_Qty_Set_Gui(Menu_Qty_Set_Init activity) {
        activity.setContentView(R.layout.activity_menu_qty_set);

        setCustomActionBar(activity);
        //setListViewFooter(activity);
    }

    //setup custom app bar "Abbrechen" "Speichern"
    private void setCustomActionBar(AppCompatActivity activity) {
        // Inflate the custom view and add click handlers for the buttons
        LayoutInflater inflater = LayoutInflater.from(activity);
        View actionBarButtons = inflater.inflate(R.layout.edit_custom_actionbar,
                new LinearLayout(activity), false);

        mCancelActionView = actionBarButtons.findViewById(R.id.action_cancel);
        mDoneActionView = actionBarButtons.findViewById(R.id.action_done);

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

    public View getmCancelActionView() {
        return mCancelActionView;
    }

    public View getmDoneActionView() {
        return mDoneActionView;
    }

}
