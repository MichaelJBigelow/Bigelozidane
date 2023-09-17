package com.bigelowinventions.bigelozidane.ui.links

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bigelowinventions.bigelozidane.databinding.FragmentLinksBinding

class LinksFragment : Fragment() {

    private var _binding: FragmentLinksBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLinksBinding.inflate(inflater, container, false)

        binding.websiteButton.setOnClickListener {
            val urlIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.bigelowinventions.com/shop")
            )

            startActivity(urlIntent)
        }

        binding.youtubeButton.setOnClickListener {
            val urlIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/channel/UCCM439w1ADH2XJWHrhZeUGA")
            )

            startActivity(urlIntent)
        }

        binding.twitchButton.setOnClickListener {
            val urlIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.twitch.tv/bigelowinventions")
            )

            startActivity(urlIntent)
        }

        binding.twitterButton.setOnClickListener {
            val urlIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://twitter.com/BigelowInvents")
            )

            startActivity(urlIntent)
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}