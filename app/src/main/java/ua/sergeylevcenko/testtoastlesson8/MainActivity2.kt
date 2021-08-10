package ua.sergeylevcenko.testtoastlesson8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Button
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
            val text = "Спасибо за просмотр.\n"

            val duration = Toast.LENGTH_SHORT

            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()
            toast.setGravity(Gravity.CENTER, 0, 0)
        }
    }
}