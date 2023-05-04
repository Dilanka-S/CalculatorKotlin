package lk.sliit.calculatorkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_clear.setOnClickListener {
            input.text = ""
            output.text = ""
        }
        button_bracket_left.setOnClickListener {
            input.text = ""
            output.text = ""
        }
    }

    private fun addToInputText(buttonValue : String ): String{
        
    }
}