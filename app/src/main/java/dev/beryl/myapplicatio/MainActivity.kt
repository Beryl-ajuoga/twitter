package dev.beryl.myapplicatio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.beryl.myapplicatio.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        fun displayTweets() {
            var tweet = tweet(
                "Lulu",
                "Doe",
                "4",
                "Africa is made of 56 nations","")


            var tweet1 = tweet (
                "Jane",
                "Doe",
                "4",
                "Africa is made of 56 nations",
                "i like coding"
            )

            var tweet2 = tweet (
                "Lulu",
                "Doe",
                "4",
                "Africa is made of 56 nations","")

            var tweet3 = tweet(
                "Lulu",
                "Doe",
                "4",
                "Africa is made of 56 nations","")
            var tweet4 = tweet (
                "Lulu",
                "Doe",
                "4",
                "Africa is made of 56 nations","")


            var twitterList = listOf(tweet,tweet1,tweet2,tweet3 ,tweet4  )
            var twitterAdapter = TwitterRvAdapter(twitterList)
            binding.rvTweet .layoutManager = LinearLayoutManager(this,)
            binding.rvTweet .adapter  = twitterAdapter


        }
    }

}


