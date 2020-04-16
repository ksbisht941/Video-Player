package com.example.videoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;
//import android.widget.MediaController;
//import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//            Video Player

            VideoView videoView = ( VideoView) findViewById(R.id.videoView);
            videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.demovideo);
            MediaController mediaController = new MediaController(this);
            mediaController.setAnchorView(videoView);
            videoView.setMediaController(mediaController);
            videoView.start();

    }
}
