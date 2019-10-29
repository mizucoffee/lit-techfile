package net.mizucoffee.profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myImageView.visibility = View.INVISIBLE
        myText.visibility = View.INVISIBLE

        myNameButton.setOnClickListener {
            myImageView.visibility = View.VISIBLE
            myText.visibility = View.VISIBLE
        }
    }
}
