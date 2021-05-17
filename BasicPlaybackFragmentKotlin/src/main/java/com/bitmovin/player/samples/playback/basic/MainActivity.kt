package com.bitmovin.player.samples.playerfragment.basic

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.OneShotPreDrawListener.add
import com.bitmovin.player.api.Player
import com.bitmovin.player.api.source.SourceConfig
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.player_fragment.*

private const val Sintel = "https://bitdash-a.akamaihd.net/content/sintel/sintel.mpd"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        //playerView.onStart()
    }

    override fun onResume() {
        super.onResume()
        //playerView.onResume()
    }

    override fun onPause() {
        //playerView.onPause()
        super.onPause()
    }

    override fun onStop() {
        //playerView.onStop()
        super.onStop()
    }

    override fun onDestroy() {
        //playerView.onDestroy()
        super.onDestroy()
    }

}
