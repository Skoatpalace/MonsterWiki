package fr.wildcodeschool.monsterwiki;

import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class ProfilMonsterActivity extends AppCompatActivity {
    int mlevel = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_monster);

        ArrayList<Drawable>listeEvolution = new ArrayList<>();
        listeEvolution.add(ContextCompat.getDrawable(ProfilMonsterActivity.this, R.drawable.fire_lion_0));
        listeEvolution.add(ContextCompat.getDrawable(ProfilMonsterActivity.this, R.drawable.fire_lion_1));
        listeEvolution.add(ContextCompat.getDrawable(ProfilMonsterActivity.this, R.drawable.fire_lion_2));
        listeEvolution.add(ContextCompat.getDrawable(ProfilMonsterActivity.this, R.drawable.fire_lion_3));
        ViewPager viewPager = (ViewPager) findViewById(R.id.view_slide_monster);
        viewPager.setAdapter(new EvolutionPagerAdapter(this,listeEvolution));

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                mlevel = position;

                ViewPager slideDesc = findViewById(R.id.slideMonster);
                slideDesc.setAdapter(new StatsPageAdapter(ProfilMonsterActivity.this, mlevel));

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        ViewPager slideDesc = findViewById(R.id.slideMonster);
        slideDesc.setAdapter(new StatsPageAdapter(ProfilMonsterActivity.this, mlevel));

        ImageView logo = findViewById(R.id.logo_marks);
        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


    }


}
