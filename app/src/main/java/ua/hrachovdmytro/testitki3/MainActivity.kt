package ua.hrachovdmytro.testitki3

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var questionTextView: TextView
    private lateinit var trueButton: Button
    private lateinit var falseButton: Button
    private lateinit var feedbackTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        questionTextView = findViewById(R.id.questionTextView)
        trueButton = findViewById(R.id.trueButton)
        falseButton = findViewById(R.id.falseButton)
        feedbackTextView = findViewById(R.id.feedbackTextView)

        trueButton.setOnClickListener {
            feedbackTextView.apply {
                text = "Correct!"
                visibility = TextView.VISIBLE
            }
        }

        falseButton.setOnClickListener {
            feedbackTextView.apply {
                text = "Incorrect!"
                visibility = TextView.VISIBLE
            }
        }
    }
}

