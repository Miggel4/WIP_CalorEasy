package wip.fhdw.caloreasy.activities.Menu_Edit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

import wip.fhdw.caloreasy.activities.Dashboard.Dashboard_Init;

import static android.support.v4.content.ContextCompat.startActivity;

/**
 * Created by Simon on 11.01.2018.
 */

public class Menu_Edit_ApplicationLogic {

    Menu_Edit_Gui mGui;
    Menu_Edit_Data mData;
    IngredientsAdapter mIngredientsAdapter;
    AppCompatActivity mActivity;

    public Menu_Edit_ApplicationLogic(Menu_Edit_Data data, Menu_Edit_Gui gui, AppCompatActivity activity) {
        mGui = gui;
        mActivity = activity;
        mData = data;
        initGui();
        initClickListener();

        Ingredient in = new Ingredient("Öl","g", 3);
        mData.addValueToList(in);

    }

    private void initGui(){
        // Create the adapter to convert the array to views
        mIngredientsAdapter = new IngredientsAdapter(mActivity, mData.getmIngredients());
        // Attach the adapter to the ListView
        mGui.getmListView().setAdapter(mIngredientsAdapter);
    }

    private void initClickListener() {
        Menu_Edit_ClickListener cl;
        cl = new Menu_Edit_ClickListener(this);

        // initialize your Views that you want to listen to
        mGui.getmCancelActionView().setOnClickListener(cl);
        mGui.getmDoneActionView().setOnClickListener(cl);
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
