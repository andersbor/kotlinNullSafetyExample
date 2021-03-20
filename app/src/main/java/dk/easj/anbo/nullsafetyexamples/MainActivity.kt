package dk.easj.anbo.nullsafetyexamples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun doIt(view: View) {
        var name = "Anders"
        //name = null // Null can not be a value of a non-null type
        var length = name.length

        var name2: String? = "Peter"

        val input: String = mainInputEditText.text.toString().trim();

        name2 = null
        if (input.length > 2) { name2 = input}
        //var length2 = name2.length

        val length2: Int? = name2?.length

        val length2b: Int = name2?.length ?: -1 // so-called Elvis operator (Elvis Presley hair style)

        // val name2a: Int = name2!!.length // !! programmer responsibility

        mainMessageTextView.text = "Name: " + name2
    }
}