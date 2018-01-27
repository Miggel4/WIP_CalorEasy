package wip.fhdw.caloreasy.activities.Dashboard;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import wip.fhdw.caloreasy.R;

/**
 * Created by Robin on 27.01.18.
 */

public class TodayFragment extends Fragment {

    // Store instance variables
    private String title;
    private int page;

    // newInstance constructor for creating fragment with arguments
    public static TodayFragment newInstance(int page, String title) {
        TodayFragment fragmentToday = new TodayFragment();
        Bundle args = new Bundle();
        args.putInt("someInt", page);
        args.putString("someTitle", title);
        fragmentToday.setArguments(args);
        return fragmentToday;
    }

    // Store instance variables based on arguments passed
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page = getArguments().getInt("someInt", 0);
        title = getArguments().getString("someTitle");
    }

    // Inflate the view for the fragment based on layout XML
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_today, container, false);
        // TextView tvLabel = (TextView) view.findViewById(R.id.tvLabel);
        // tvLabel.setText(page + " -- " + title);
        return view;
    }

}
