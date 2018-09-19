package fr.wildcodeschool.monsterwiki;

import android.graphics.drawable.Drawable;
import android.support.constraint.ConstraintLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class ProfilMonsterActivity extends AppCompatActivity {
    int mlevel = 0;



    String[] mMonsterNames = {
            "Fire Lion",
            "Génie",
            "Light Spirit",
            "Metalsaur",
            "Panda",
            "Rockilla",
            "Thunder Eagle",
            "Turtle",
            "Tyranno King",
    };




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_monster);

        int monsterFamily = getIntent().getIntExtra("MonsterNumber", 0);

        ArrayList<Drawable> lionEvolution = new ArrayList<>();
        lionEvolution.add(ContextCompat.getDrawable(ProfilMonsterActivity.this, R.drawable.fire_lion_0));
        lionEvolution.add(ContextCompat.getDrawable(ProfilMonsterActivity.this, R.drawable.fire_lion_1));
        lionEvolution.add(ContextCompat.getDrawable(ProfilMonsterActivity.this, R.drawable.fire_lion_2));
        lionEvolution.add(ContextCompat.getDrawable(ProfilMonsterActivity.this, R.drawable.fire_lion_3));

        ArrayList<Drawable> genieEvolution = new ArrayList<>();
        genieEvolution.add(ContextCompat.getDrawable(ProfilMonsterActivity.this, R.drawable.genie_0));
        genieEvolution.add(ContextCompat.getDrawable(ProfilMonsterActivity.this, R.drawable.genie_1));
        genieEvolution.add(ContextCompat.getDrawable(ProfilMonsterActivity.this, R.drawable.genie_2));
        genieEvolution.add(ContextCompat.getDrawable(ProfilMonsterActivity.this, R.drawable.genie_3));

        ArrayList<Drawable> lightSpiritEvolution = new ArrayList<>();
        lightSpiritEvolution.add(ContextCompat.getDrawable(ProfilMonsterActivity.this, R.drawable.light_spirit_0));
        lightSpiritEvolution.add(ContextCompat.getDrawable(ProfilMonsterActivity.this, R.drawable.light_spirit_1));
        lightSpiritEvolution.add(ContextCompat.getDrawable(ProfilMonsterActivity.this, R.drawable.light_spirit_2));
        lightSpiritEvolution.add(ContextCompat.getDrawable(ProfilMonsterActivity.this, R.drawable.light_spirit_3));

        ArrayList<Drawable> metalsaurEvolution = new ArrayList<>();
        metalsaurEvolution.add(ContextCompat.getDrawable(ProfilMonsterActivity.this, R.drawable.metalsaur_0));
        metalsaurEvolution.add(ContextCompat.getDrawable(ProfilMonsterActivity.this, R.drawable.metalsaur_1));
        metalsaurEvolution.add(ContextCompat.getDrawable(ProfilMonsterActivity.this, R.drawable.metalsaur_2));
        metalsaurEvolution.add(ContextCompat.getDrawable(ProfilMonsterActivity.this, R.drawable.metalsaur_3));

        ArrayList<Drawable> pandaEvolution = new ArrayList<>();
        pandaEvolution.add(ContextCompat.getDrawable(ProfilMonsterActivity.this, R.drawable.panda_0));
        pandaEvolution.add(ContextCompat.getDrawable(ProfilMonsterActivity.this, R.drawable.panda_1));
        pandaEvolution.add(ContextCompat.getDrawable(ProfilMonsterActivity.this, R.drawable.panda_2));
        pandaEvolution.add(ContextCompat.getDrawable(ProfilMonsterActivity.this, R.drawable.panda_3));

        ArrayList<Drawable> rockillaEvolution = new ArrayList<>();
        rockillaEvolution.add(ContextCompat.getDrawable(ProfilMonsterActivity.this, R.drawable.rockilla_0a));
        rockillaEvolution.add(ContextCompat.getDrawable(ProfilMonsterActivity.this, R.drawable.rockilla_1a));
        rockillaEvolution.add(ContextCompat.getDrawable(ProfilMonsterActivity.this, R.drawable.rockilla_2a));
        rockillaEvolution.add(ContextCompat.getDrawable(ProfilMonsterActivity.this, R.drawable.rockilla_3a));

        ArrayList<Drawable> tEagleEvolution = new ArrayList<>();
        tEagleEvolution.add(ContextCompat.getDrawable(ProfilMonsterActivity.this, R.drawable.thunder_eagle_0));
        tEagleEvolution.add(ContextCompat.getDrawable(ProfilMonsterActivity.this, R.drawable.thunder_eagle_1));
        tEagleEvolution.add(ContextCompat.getDrawable(ProfilMonsterActivity.this, R.drawable.thunder_eagle_2));
        tEagleEvolution.add(ContextCompat.getDrawable(ProfilMonsterActivity.this, R.drawable.thunder_eagle_3));

        ArrayList<Drawable> turtleEvolution = new ArrayList<>();
        turtleEvolution.add(ContextCompat.getDrawable(ProfilMonsterActivity.this, R.drawable.turtle_0));
        turtleEvolution.add(ContextCompat.getDrawable(ProfilMonsterActivity.this, R.drawable.turtle_1));
        turtleEvolution.add(ContextCompat.getDrawable(ProfilMonsterActivity.this, R.drawable.turtle_2));
        turtleEvolution.add(ContextCompat.getDrawable(ProfilMonsterActivity.this, R.drawable.turtle_3));

        ArrayList<Drawable> tKingEvolution = new ArrayList<>();
        tKingEvolution.add(ContextCompat.getDrawable(ProfilMonsterActivity.this, R.drawable.tyrannoking_0));
        tKingEvolution.add(ContextCompat.getDrawable(ProfilMonsterActivity.this, R.drawable.tyrannoking_1));
        tKingEvolution.add(ContextCompat.getDrawable(ProfilMonsterActivity.this, R.drawable.tyrannoking_2));
        tKingEvolution.add(ContextCompat.getDrawable(ProfilMonsterActivity.this, R.drawable.tyrannoking_3));


        ArrayList<Drawable> finalMonsterList;
        if (monsterFamily == 1) {
            finalMonsterList = genieEvolution;
        } else if (monsterFamily == 2) {
            finalMonsterList = lightSpiritEvolution;
        } else if (monsterFamily == 3) {
            finalMonsterList = metalsaurEvolution;
        } else if (monsterFamily == 4) {
            finalMonsterList = pandaEvolution;
        } else if (monsterFamily == 5) {
            finalMonsterList = rockillaEvolution;
        } else if (monsterFamily == 6) {
            finalMonsterList = tEagleEvolution;
        } else if (monsterFamily == 7) {
            finalMonsterList = turtleEvolution;
        } else if (monsterFamily == 8) {
            finalMonsterList = tKingEvolution;
        } else {
            finalMonsterList = lionEvolution;
        }

        int[] mHabitat = {
             R.drawable.fire_habitat_8,
             R.drawable.magic_habitat_8,
             R.drawable.light_habitat_8,
             R.drawable.metal_habitat_8,
             R.drawable.nature_habitat_8,
             R.drawable.earth_habitat_8,
             R.drawable.thunder_habitat_8,
             R.drawable.water_habitat_8,
             R.drawable.dark_habitat_8,
        };

        int[] mBackGround = {
            R.drawable.orange,
            R.drawable.background,
            R.drawable.ligktback,
            R.drawable.metal_texture,
            R.drawable.green_background,
            R.drawable.ocre,
            R.drawable.teagle2,
            R.drawable.turtle,
            R.drawable.wallpaper,
        };

        ConstraintLayout mLinearLayout = findViewById(R.id.linearLayoutID);
        mLinearLayout.setBackgroundResource(mBackGround[monsterFamily]);
        ViewPager viewPager = findViewById(R.id.view_slide_monster);
        viewPager.setAdapter(new EvolutionPagerAdapter(this, finalMonsterList));
        viewPager.setBackgroundResource(mHabitat[monsterFamily]);





        // Slider de Pierre

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
        slideDesc.setAdapter(new StatsPageAdapter(ProfilMonsterActivity.this, mMonsterNames[monsterFamily]));

        ImageView logo = findViewById(R.id.logo_marks);
        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


    }


}
