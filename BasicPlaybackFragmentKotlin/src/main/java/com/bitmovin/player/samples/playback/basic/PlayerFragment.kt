package com.bitmovin.player.samples.playerfragment.basic

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bitmovin.player.api.Player
import com.bitmovin.player.api.source.SourceConfig
import com.bitmovin.player.samples.playerfragment.basic.R
import kotlinx.android.synthetic.main.player_fragment.*


class PlayerFragment : Fragment(R.layout.player_fragment) {

    private lateinit var player: Player

    private val Sintel = "https://bitdash-a.akamaihd.net/content/sintel/sintel.mpd"

    override fun onCreateView(inflater: LayoutInflater, parent: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Defines the xml file for the fragment
        return inflater.inflate(R.layout.player_fragment, parent, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        initializePlayer()
    }


    override fun onStart() {
        super.onStart()
        playerView.onStart()
    }

    override fun onResume() {
        super.onResume()
        playerView.onResume()
    }

    override fun onPause() {
        playerView.onPause()
        super.onPause()
    }

    override fun onStop() {
        playerView.onStop()
        super.onStop()
    }

    override fun onDestroy() {
        playerView.onDestroy()
        super.onDestroy()
    }

    private fun initializePlayer() {
        player = Player.create(this.requireContext()).also { playerView.player = it }

        player.load(SourceConfig.fromUrl(Sintel))
    }
}