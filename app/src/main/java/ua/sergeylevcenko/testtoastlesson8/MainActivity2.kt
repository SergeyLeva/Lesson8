package ua.sergeylevcenko.testtoastlesson8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {

    fun backPage(view: View) {

        val intent = Intent(this@MainActivity2, MainActivity::class.java)
        startActivity(intent)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val button: Button = findViewById(R.id.button)


        button.setOnClickListener {
            val toast = Toast.makeText(applicationContext, R.string.cat, Toast.LENGTH_LONG)
            toast.setGravity(Gravity.CENTER, 0, 0)

            val toastContainer = toast.view as LinearLayout
            val catImage = ImageView(this)
            catImage.setImageResource(R.drawable.hungrycat)
            toastContainer.addView(catImage, 0)
            toast.show()
        }
    }
}