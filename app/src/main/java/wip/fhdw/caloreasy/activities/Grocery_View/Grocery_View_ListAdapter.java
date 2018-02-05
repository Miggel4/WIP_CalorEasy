package wip.fhdw.caloreasy.activities.Grocery_View;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

import wip.fhdw.caloreasy.R;

/**
 * Created by Falk on 04.02.2018.
 */

public class Grocery_View_ListAdapter extends CursorAdapter{
    public Grocery_View_ListAdapter(Context context, Cursor cursor){
        super(context,cursor,0);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        return LayoutInflater.from(context).inflate(R.layout.grocery_row_view, parent, false);
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        TextView groceryTV = (TextView) view.findViewById(R.id.grocery);
        TextView amountTV = (TextView) view.findViewById(R.id.baseAmount);
        TextView baseMeasurementTV = (TextView) view.findViewById(R.id.baseMeasurement);
        TextView baseCaloriesTV = (TextView) view.findViewById(R.id.baseCalories);

        String grocery = cursor.getString(cursor.getColumnIndexOrThrow("name"));
        String baseMeasurement = cursor.getString(cursor.getColumnIndexOrThrow("baseMeasurement"));
        int amount = cursor.getInt(cursor.getColumnIndexOrThrow("baseAmount"));
        int calories = cursor.getInt(cursor.getColumnIndexOrThrow("baseCalories"));

        groceryTV.setText(grocery);
        amountTV.setText(String.valueOf(amount));
        baseMeasurementTV.setText(baseMeasurement);
        baseCaloriesTV.setText(String.valueOf(calories));

    }
}
