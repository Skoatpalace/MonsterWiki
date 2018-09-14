package fr.wildcodeschool.monsterwiki;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class profilMonster extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_monster);

        ViewPager slideDesc = findViewById(R.id.slideMonster);
        slideDesc.setAdapter(new StatsPageAdapter(profilMonster.this));
    }
}

