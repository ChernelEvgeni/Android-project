package com.example.user.a1;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnTraining;
    Button btnGameMode;
    Button btnSettings;
    MediaPlayer song;

    public  void initButton(){
        btnTraining = (Button) findViewById(R.id.buttonTraining);
        btnGameMode = (Button) findViewById(R.id.buttonGameMode);
        btnSettings = (Button) findViewById(R.id.buttonSettings);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       /* song = MediaPlayer.create(this,R.raw.music);
        song.start();*/

        initButton();
    }


    public void clickButtonGameMode(View view){
        Intent intent = new Intent(this,GameModeActivity.class);
        startActivity(intent);
    }
    public void clickButtonTraining(View view){
        Intent intent = new Intent(this,TrainingActivity.class);
        startActivity(intent);
    }
    public void clickButtonSettings(View view){
        Intent intent = new Intent(this,SettingsActivity.class);
        startActivity(intent);
    }


}
