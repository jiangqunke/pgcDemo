package com.bestv.pgc.tiktok;


import com.bestv.ijkplayer.player.IjkMediaPlayer;

public class PgcAgent {
    public static void init(){
        IjkMediaPlayer.loadLibrariesOnce(null);
    }
}
