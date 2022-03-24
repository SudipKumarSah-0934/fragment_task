package com.example.servicesdemo;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MYBGService extends Service {
    MediaPlayer musicPlayer;
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        musicPlayer = MediaPlayer.create(this, R.raw.sample3);
        musicPlayer.setLooping(false);
    }
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this, "Music Service started by user.", Toast.LENGTH_LONG).show();
        musicPlayer.start();
        return START_STICKY;
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        musicPlayer.stop();
        Toast.makeText(this, "Music Service destroyed by user.", Toast.LENGTH_LONG).show();
    }
}
