package ua.sergeylevcenko.testtoastlesson8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    fun nextPage(view: View) {
        val intent = Intent(this@MainActivity, MainActivity2::class.java)
        startActivity(intent)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            val text = "У лукоморья дуб зелёный;\n" +
                    "Златая цепь на дубе том:\n" +
                    "И днём и ночью кот учёный\n" +
                    "Всё ходит по цепи кругом;\n" +
                    "Идёт направо — песнь заводит,\n" +
                    "Налево — сказку говорит."
            val duration = Toast.LENGTH_SHORT

            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()
            toast.setGravity(Gravity.CENTER, 0, 0)
        }
    }
}