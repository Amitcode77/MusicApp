package com.example.block_04;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    MediaPlayer song;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        song = MediaPlayer.create(this, R.raw.music);
        Switch switch_looping = (Switch) findViewById(R.id.switchLooping);
        switch_looping.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                song.setLooping(isChecked);
            }
        });
    }
    public void playMusic (View v){
        song.start();
    }
    public void pauseMusic (View v){
        if(song.isPlaying())
        song.pause();
    }

}
