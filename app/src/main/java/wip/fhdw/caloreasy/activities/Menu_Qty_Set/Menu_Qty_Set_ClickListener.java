package wip.fhdw.caloreasy.activities.Menu_Qty_Set;

import android.view.View;
import wip.fhdw.caloreasy.R;
import android.util.Log;

/**
 * Created by Mesquita on 12.01.2018.
 */

public class Menu_Qty_Set_ClickListener implements View.OnClickListener {

    private Menu_Qty_Set_ApplicationLogic mApplicationLogic;

    public Menu_Qty_Set_ClickListener(Menu_Qty_Set_ApplicationLogic applicationLogic) {
        mApplicationLogic = applicationLogic;
    }

    public Menu_Qty_Set_ClickListener() {
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
