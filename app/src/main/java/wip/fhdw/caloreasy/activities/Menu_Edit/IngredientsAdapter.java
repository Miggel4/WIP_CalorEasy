package wip.fhdw.caloreasy.activities.Menu_Edit;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import wip.fhdw.caloreasy.R;

/**
 * Created by Simon on 05.02.2018.
 */

public class IngredientsAdapter extends ArrayAdapter<Ingredient> {

    public IngredientsAdapter(@NonNull Context context, @NonNull ArrayList<Ingredient> ingredients) {
        super(context, 0, ingredients);
    }


    // translation between the data item and the View
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Ingredient ingredient = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.listitem_ingredient, parent, false);
        }
        // Lookup view for data population
        TextView tvQuantity = (TextView) convertView.findViewById(R.id.list_item_ingredient_quantity);
        TextView tvUnit = (TextView) convertView.findViewById(R.id.list_item_ingredient_unit);
        TextView tvGrocery = (TextView) convertView.findViewById(R.id.list_item_ingredient_grocery);
        // Populate the data into the template view using the data object
        tvQuantity.setText("" + ingredient.getmQuantity());
        tvUnit.setText(ingredient.getmUnit());
        tvGrocery.setText(ingredient.getmGrocery());
        // Return the completed view to render on screen
        return convertView;
    }
}

