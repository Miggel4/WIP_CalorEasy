package wip.fhdw.caloreasy.activities.Menu_Edit;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import wip.fhdw.caloreasy.R;

/**
 * Created by Simon on 11.01.2018.
 */

public class Menu_Edit_Gui {

    private View mCancelActionView;
    private View mDoneActionView;
    private ListView mListView;

    public Menu_Edit_Gui(Menu_Edit_Init activity) {
        activity.setContentView(R.layout.activity_menu_edit);

        mListView = (ListView) activity.findViewById(R.id.menu_edit_list_ingredients);

        setCustomActionBar(activity);
        setListViewFooter(activity);
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


    // setup "add" footer in listview
    public void setListViewFooter(AppCompatActivity activity) {
        TextView footer = (TextView) activity.findViewById(R.id.add_custom_listfooter_plus);
        if ( footer != null ) {
            mListView.addFooterView(footer);
        }
    }


    public ListView getmListView() {
        return mListView;
    }

    public View getmCancelActionView() {
        return mCancelActionView;
    }

    public View getmDoneActionView() {
        return mDoneActionView;
    }


}
