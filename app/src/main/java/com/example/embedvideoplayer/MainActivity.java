package com.example.embedvideoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button video1, video2, video3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        video1 = findViewById(R.id.video1);
        video2 = findViewById(R.id.video2);
        video3 = findViewById(R.id.video3);


        video1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                //variable assign
                videoPlayer.video_url = "https://www.youtube.com/embed/rVVeLdouViU";

                // video player access
                Intent videoIntent = new Intent(MainActivity.this, videoPlayer.class);
                startActivity(videoIntent);
            }
        });


        // video 2 enable
        video2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //variable assign
                videoPlayer.video_url = "https://www.youtube.com/embed/qSD74GKrNaA";

                // video player access
                Intent videoIntent = new Intent(MainActivity.this, videoPlayer.class);
                startActivity(videoIntent);
            }
        });


        // video 3 enable
        video3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //variable assign
                videoPlayer.video_url = "https://www.youtube.com/embed/COn9x4NbOBY";

                // video player access
                Intent videoIntent = new Intent(MainActivity.this, videoPlayer.class);
                startActivity(videoIntent);
            }
        });
    }
}