package com.example.yourapp
import com.example.practice15.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    private lateinit var animalDetailsTextView: TextView
    private lateinit var finishButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        animalDetailsTextView = findViewById(R.id.animalDetailsTextView)
        finishButton = findViewById(R.id.finishButton)


        val animal = intent.getParcelableExtra<Animal>("animal")


        animalDetailsTextView.text = "Порода животного: ${animal?.breed}\nГод рождения: ${animal?.birthYear}\nМесяц рождения: ${animal?.birthMonth}"

        finishButton.setOnClickListener {
            finish()
        }
    }
}