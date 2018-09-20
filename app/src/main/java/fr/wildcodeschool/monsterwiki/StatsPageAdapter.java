package fr.wildcodeschool.monsterwiki;
import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class StatsPageAdapter extends PagerAdapter {

    private Context mContext;
    int[] mLayouts = {
            R.layout.slide_layout,
            R.layout.desc
    };
    String mMonsterName;

    public StatsPageAdapter(Context context, String monsterName) {
        mContext = context;
        mMonsterName = monsterName;
    }

    @Override
    public Object instantiateItem(ViewGroup collection, int position) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        ViewGroup layout = (ViewGroup) inflater.inflate(mLayouts[position], collection, false);
        collection.addView(layout);


        if (position == 0) {
            TextView monsterName = layout.findViewById(R.id.name_monster);
            monsterName.setText(mMonsterName);
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
}

