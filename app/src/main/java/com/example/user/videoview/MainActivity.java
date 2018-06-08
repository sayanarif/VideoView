package com.example.user.videoview;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
private VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView=(VideoView)findViewById(R.id.vidv);

        String path="android.resource://"+getPackageName()+"/"+R.raw.b_letter;
        Uri uri=Uri.parse(path);
        videoView.setVideoURI(uri);

        videoView.start();

    }
}
