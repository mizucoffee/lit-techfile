package net.mizucoffee.profile

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        myImageView.visibility = View.INVISIBLE
////        myText.visibility = View.INVISIBLE
////
////        myNameButton.setOnClickListener {
////            myImageView.visibility = View.VISIBLE
////            myText.visibility = View.VISIBLE
////        }

        myNameButton.setOnClickListener {
            myNameButton.setBackgroundColor(Color.parseColor("#29abe2"))
            myLikeSportsButton.setBackgroundColor(Color.parseColor("#929292"))
            myLikeFoodsButton.setBackgroundColor(Color.parseColor("#929292"))
            myLikeHobbyButton.setBackgroundColor(Color.parseColor("#929292"))
            myImageView.setImageResource(R.drawable.tobisuke)
            myText.text = "とびすけ"
        }
        myLikeSportsButton.setOnClickListener {
            myNameButton.setBackgroundColor(Color.parseColor("#929292"))
            myLikeSportsButton.setBackgroundColor(Color.parseColor("#29abe2"))
            myLikeFoodsButton.setBackgroundColor(Color.parseColor("#929292"))
            myLikeHobbyButton.setBackgroundColor(Color.parseColor("#929292"))
            myImageView.setImageResource(R.drawable.soccer)
            myText.text = "サッカー"
        }
        myLikeFoodsButton.setOnClickListener {
            myNameButton.setBackgroundColor(Color.parseColor("#929292"))
            myLikeSportsButton.setBackgroundColor(Color.parseColor("#929292"))
            myLikeFoodsButton.setBackgroundColor(Color.parseColor("#29abe2"))
            myLikeHobbyButton.setBackgroundColor(Color.parseColor("#929292"))
            myImageView.setImageResource(R.drawable.sushi)
            myText.text = "すし"
        }
        myLikeHobbyButton.setOnClickListener {
            myNameButton.setBackgroundColor(Color.parseColor("#929292"))
            myLikeSportsButton.setBackgroundColor(Color.parseColor("#929292"))
            myLikeFoodsButton.setBackgroundColor(Color.parseColor("#929292"))
            myLikeHobbyButton.setBackgroundColor(Color.parseColor("#29abe2"))
            myImageView.setImageResource(R.drawable.dance)
            myText.text = "ダンス"
        }

    }
}
