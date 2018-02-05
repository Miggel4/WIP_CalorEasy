package wip.fhdw.caloreasy.activities.Menu_Edit;

/**
 * Created by Simon on 05.02.2018.
 */

public class Ingredient {

    private String mGrocery;
    private String mUnit;
    private int mQuantity;

    public Ingredient(String mGrocery, String mUnit, int mQuantity) {
        this.mGrocery = mGrocery;
        this.mUnit = mUnit;
        this.mQuantity = mQuantity;
    }

    public String getmGrocery() {
        return mGrocery;
    }

    public void setmGrocery(String mName) {
        this.mGrocery = mName;
    }

    public String getmUnit() {
        return mUnit;
    }

    public void setmUnit(String mUnit) {
        this.mUnit = mUnit;
    }

    public int getmQuantity() {
        return mQuantity;
    }

    public void setmQuantity(int mQuantity) {
        this.mQuantity = mQuantity;
    }
}
