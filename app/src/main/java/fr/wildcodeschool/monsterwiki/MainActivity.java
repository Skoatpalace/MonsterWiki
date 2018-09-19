package fr.wildcodeschool.monsterwiki;



import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.Toolbar;


public class  MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView logo = findViewById(R.id.logo_marks);
        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        final Button buttonFireLion = findViewById(R.id.button_FireLion);
        buttonFireLion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentMonster = new Intent(MainActivity.this, ProfilMonsterActivity.class);
                intentMonster.putExtra("MonsterNumber",0);
                startActivity(intentMonster);

            }
        });
        final Button buttonGenie = findViewById(R.id.button_Genie);
        buttonGenie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentMonster = new Intent(MainActivity.this, ProfilMonsterActivity.class);
                intentMonster.putExtra("MonsterNumber",1);
                startActivity(intentMonster);

            }
        });
        final Button buttonLightSpirit = findViewById(R.id.button_LightSpirit);
        buttonLightSpirit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentMonster = new Intent(MainActivity.this, ProfilMonsterActivity.class);
                intentMonster.putExtra("MonsterNumber",2);
                startActivity(intentMonster);

            }
        });
        final Button buttonMetalsaur = findViewById(R.id.button_Metalsaur);
        buttonMetalsaur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentMonster = new Intent(MainActivity.this, ProfilMonsterActivity.class);
                intentMonster.putExtra("MonsterNumber",3);
                startActivity(intentMonster);

            }
        });
        final Button buttonPanda = findViewById(R.id.button_Panda);
        buttonPanda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentMonster = new Intent(MainActivity.this, ProfilMonsterActivity.class);
                intentMonster.putExtra("MonsterNumber",4);
                startActivity(intentMonster);

            }
        });
        final Button buttonRock = findViewById(R.id.button_Rockilla);
        buttonRock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentMonster = new Intent(MainActivity.this, ProfilMonsterActivity.class);
                intentMonster.putExtra("MonsterNumber",5);
                startActivity(intentMonster);

            }
        });
        final Button buttonTG = findViewById(R.id.button_Teagle);
        buttonTG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentMonster = new Intent(MainActivity.this, ProfilMonsterActivity.class);
                intentMonster.putExtra("MonsterNumber",6);
                startActivity(intentMonster);

            }
        });
        final Button buttonTurtle = findViewById(R.id.button_Turtle);
        buttonTurtle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentMonster = new Intent(MainActivity.this, ProfilMonsterActivity.class);
                intentMonster.putExtra("MonsterNumber",7);
                startActivity(intentMonster);

            }
        });
        final Button buttonTyran = findViewById(R.id.button_Tyrranoking);
        buttonTyran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentMonster = new Intent(MainActivity.this, ProfilMonsterActivity.class);
                intentMonster.putExtra("MonsterNumber",8);
                startActivity(intentMonster);

            }
        });


    }


}
