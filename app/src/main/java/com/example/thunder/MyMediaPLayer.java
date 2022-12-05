package com.example.thunder;

import android.media.MediaPlayer;

public class MyMediaPLayer {
    static MediaPlayer instance;
    public static MediaPlayer GetInstance()
    {
        if(instance ==null)
        {
            instance= new MediaPlayer();
        }
        return instance;
    }

    public static int currentIndex = -1;
}
