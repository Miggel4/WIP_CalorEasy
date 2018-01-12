package wip.fhdw.caloreasy.activities.Menu_Edit;

import android.util.Log;
import android.view.View;

import wip.fhdw.caloreasy.R;

/**
 * Created by Simon on 11.01.2018.
 */

public class Menu_Edit_ClickListener implements View.OnClickListener{

    private Menu_Edit_ApplicationLogic mApplicationLogic;

    public Menu_Edit_ClickListener(Menu_Edit_ApplicationLogic applicationLogic) {
        mApplicationLogic = applicationLogic;
    }


    @Override
    public void onClick(View view) {
        switch ( view.getId() ) {
            case R.id.action_cancel:
                Log.d("LOGTAG", "onViewActionCancelClicked ...");
                mApplicationLogic.onViewActionCancelClicked();
                break;
            case R.id.action_done:
                Log.d("LOGTAG", "onViewActionDoneClicked ...");
                mApplicationLogic.onViewActionDoneClicked();
                break;
        }
    }
}
