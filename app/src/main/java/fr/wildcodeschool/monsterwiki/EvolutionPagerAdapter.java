package fr.wildcodeschool.monsterwiki;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

public class EvolutionPagerAdapter extends PagerAdapter {

    private Context mContext;
    private ArrayList<Drawable> mEvolutions;

    public EvolutionPagerAdapter(Context context, ArrayList<Drawable> evolutions) {
        mContext = context;
        mEvolutions = evolutions;
    }

    @Override
    public Object instantiateItem(ViewGroup collection, int position) {
        Drawable evolution = mEvolutions.get(position);
        LayoutInflater inflater = LayoutInflater.from(mContext);
        ViewGroup layout = (ViewGroup) inflater.inflate(R.layout.activity_screen_slide, collection, false);
        collection.addView(layout);
        ImageView imageEvolution = layout.findViewById(R.id.image_evolution);
        imageEvolution.setImageDrawable(evolution);
        return layout;
    }

    @Override
    public void destroyItem(ViewGroup collection, int position, Object view) {
        collection.removeView((View) view);
    }

    @Override
    public int getCount() {
        return mEvolutions.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

}
