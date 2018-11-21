package com.example.user.a1;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GameModeActivity extends AppCompatActivity {


    Button level_1;
    Button level_2;
    Button level_3;
    Button level_4;
    Button level_5;
    MediaPlayer song;

    public  void initButton(){
        level_1 = (Button) findViewById(R.id.button1);
        level_2 = (Button) findViewById(R.id.button2);
        level_3 = (Button) findViewById(R.id.button3);
        level_4 = (Button) findViewById(R.id.button4);
        level_5 = (Button) findViewById(R.id.button5);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_mode);
        initButton();
    }
    public void clickButtonLevel_1(View view){
        Intent intent = new Intent(this,level_1.class);
        startActivity(intent);
    }


}
