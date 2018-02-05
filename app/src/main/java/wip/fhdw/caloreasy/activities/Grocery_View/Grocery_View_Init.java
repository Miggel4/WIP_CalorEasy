package wip.fhdw.caloreasy.activities.Grocery_View;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import wip.fhdw.caloreasy.R;

public class Grocery_View_Init extends AppCompatActivity {

    private Grocery_View_GUI mGUI;
    private Grocery_View_Data mData;
    private Grocery_View_ApplicationLogic mApplicationLogic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grocery__view);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        initGUI();
        initData();
        initApplicationLogic();

        /**FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });**/
    }

    private void initGUI(){mGUI = new Grocery_View_GUI(this);}
    private void initData(){};
    private void initApplicationLogic(){mApplicationLogic = new Grocery_View_ApplicationLogic(mGUI, this);}

}
