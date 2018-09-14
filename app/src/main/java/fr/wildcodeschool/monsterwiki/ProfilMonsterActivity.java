package fr.wildcodeschool.monsterwiki;

import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class ProfilMonsterActivity extends AppCompatActivity {

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
    }
}
