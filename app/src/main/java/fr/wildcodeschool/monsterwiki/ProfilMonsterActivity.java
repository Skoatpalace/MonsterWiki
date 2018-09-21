package fr.wildcodeschool.monsterwiki;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.constraint.ConstraintLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ProfilMonsterActivity extends AppCompatActivity {
    int mlevel = 0;



    StatsPageAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_monster);

        final int monsterFamily = getIntent().getIntExtra("MonsterNumber", 0);

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

        String[] mMonsterNames = {
                getString(R.string.name_firelion),
                getString(R.string.name_genie),
                getString(R.string.name_lightspirit),
                getString(R.string.name_metalsaur),
                getString(R.string.name_panda),
                getString(R.string.name_rockilla),
                getString(R.string.name_thundereagle),
                getString(R.string.name_turtle),
                getString(R.string.name_tyrannoking),
        };

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

        int[] mWeakness = {
                R.drawable.bte_water,
                R.drawable.bte_nature,
                R.drawable.bte_metal,
                R.drawable.bte_magic,
                R.drawable.bte_fire,
                R.drawable.bte_dark,
                R.drawable.bte_earth,
                R.drawable.bte_thunder,
                R.drawable.bte_light,
        };

        String[] mDescription = {
                getString(R.string.lion_description),
                getString(R.string.genie_description),
                getString(R.string.light_spirit_description),
                getString(R.string.metalsaur_description),
                getString(R.string.panda_description),
                getString(R.string.rockilla_description),
                getString(R.string.thunder_eagle_description),
                getString(R.string.turtle_description),
                getString(R.string.tyranno_description),
        };

        ConstraintLayout mLinearLayout = findViewById(R.id.linearLayoutID);
        mLinearLayout.setBackgroundResource(mBackGround[monsterFamily]);




        ViewPager viewPager = findViewById(R.id.view_slide_monster);
        viewPager.setAdapter(new EvolutionPagerAdapter(this, finalMonsterList));
        viewPager.setBackgroundResource(mHabitat[monsterFamily]);


        // Slider de Pierre

        mAdapter = new StatsPageAdapter(ProfilMonsterActivity.this, mlevel, mMonsterNames[monsterFamily],mDescription[monsterFamily],mWeakness[monsterFamily]);


        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                mlevel = position;
                mAdapter.setLevel(mlevel);
                mAdapter.notifyDataSetChanged();
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        ViewPager slideDesc = findViewById(R.id.slideMonster);
        slideDesc.setAdapter(mAdapter);

        ImageView logo = findViewById(R.id.logo_marks);
        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });




    }


}
