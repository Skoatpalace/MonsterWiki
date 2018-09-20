package fr.wildcodeschool.monsterwiki;
import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class StatsPageAdapter extends PagerAdapter {

    private Context mContext;
    int[] mLayouts = {
            R.layout.slide_layout,
            R.layout.desc
    };
    String mMonsterName;
    int mlvl;
    String mDescription;
    int mWeakness;


    public StatsPageAdapter(Context context, int level, String monsterName, String description, int weakness) {
        mContext = context;
        mlvl = level;
        mMonsterName = monsterName;
        mDescription = description;
        mWeakness = weakness;
    }

    @Override
    public Object instantiateItem(ViewGroup collection, int position) {
        int lvlValue = 0;
        int powerValue = 220;
        int lifeValue = 50;
        int speedValue = 175;
        int staminaValue = 100;
        if (mlvl == 1) {
            powerValue = 308;
            lifeValue = 104;
            speedValue= 244;
            staminaValue = 100;
            lvlValue = 10;

        } else if (mlvl == 2){
            powerValue = 880;
            lifeValue= 1430;
            speedValue= 700;
            staminaValue= 100;
            lvlValue = 30;
        } else if (mlvl==3){
            powerValue = 1760;
            lifeValue = 7430;
            speedValue = 1400;
            staminaValue = 200;
            lvlValue = 70;
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
            EditText levelMonster = layout.findViewById(R.id.level);
            levelMonster.setText(String.valueOf(lvlValue));
        }

        collection.addView(layout);
        if (position == 0) {
            TextView monsterName = layout.findViewById(R.id.name_monster);
            monsterName.setText(mMonsterName);
        }else{
            TextView textDescription = layout.findViewById(R.id.text_Description);
            textDescription.setText(mDescription);
            ImageView imageWeakness = layout.findViewById(R.id.image_weakness);
            imageWeakness.setImageResource(mWeakness);
        }

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

    public void setLevel(int level) {
        mlvl = level;
    }
    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }
}

