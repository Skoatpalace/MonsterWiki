package fr.wildcodeschool.monsterwiki;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class StatsPageAdapter extends PagerAdapter {

    private Context mContext;
    int[] mLayouts = {
            R.layout.slide_layout,
            R.layout.desc
    };
    int mlvl;

    public StatsPageAdapter(Context context, int level) {
        mContext = context;
        mlvl = level;
    }

    @Override
    public Object instantiateItem(ViewGroup collection, int position) {
        int powerValue = 220;
        int lifeValue = 50;
        int speedValue = 175;
        int staminaValue = 100;
        if (mlvl == 1) {
            powerValue = 300;
            lifeValue = 60;
            speedValue= 200;
            staminaValue = 100;

        } else if (mlvl == 2){
            powerValue = 500;
            lifeValue= 70;
            speedValue= 250;
            staminaValue= 150;
        } else if (mlvl==3){
            powerValue = 700;
            lifeValue = 100;
            speedValue = 300;
            staminaValue = 200;
        }
        LayoutInflater inflater = LayoutInflater.from(mContext);
        ViewGroup layout = (ViewGroup) inflater.inflate(mLayouts[position], collection, false);
        if (position==0){
            EditText power = layout.findViewById(R.id.statOne);
            power.setText(String.valueOf(powerValue));
            EditText life = layout.findViewById(R.id.statTwo);
            life.setText(String.valueOf(lifeValue));
            EditText speed = layout.findViewById(R.id.statThree);
            speed.setText(String.valueOf(speedValue));
            EditText stamina = layout.findViewById(R.id.statFour);
            stamina.setText(String.valueOf(staminaValue));

        }





        collection.addView(layout);
        return layout;
    }

    @Override
    public void destroyItem(ViewGroup collection, int position, Object view) {
        collection.removeView((View) view);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public int getCount() {
        return mLayouts.length;
    }
}

