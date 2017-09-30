package io.github.itaouil.findmyage

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        // Display main activity
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        // Button event (click)
        buFindAge.setOnClickListener {

            // Fetch data of birth from input
            val dob:Int = dob.text.toString().toInt()

            // Compute user's age
            val age:Int = Calendar.getInstance().get(Calendar.YEAR) - dob

            // Display age in the text view
            ageView.text = "Your age is $age"
        }
        */

    }

    fun findAge(view: View) {

        // Fetch data of birth from input
        val yob:Int = yob.text.toString().toInt()

        // Current year
        val cur:Int = Calendar.getInstance().get(Calendar.YEAR)

        // Check if year is valid
        if (yob > cur) {

            ageView.text = "Your year of birth is invalid"
            return

        }

        // Compute user's age
        val age:Int = cur - yob

        // Display age in the text view
        ageView.text = "Your age is $age"

    }

}
