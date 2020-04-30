package com.kanyideveloper.lesson01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        textView.text = "Hello Joel how are you enjoying Kotlin, is it fun, learn it, it will help you somewhere. Plus learning it is an added advantage Java + Kotlin"
        textView.setSingleLine()
        textView.ellipsize = TextUtils.TruncateAt.MARQUEE
        textView.marqueeRepeatLimit  = -1
        textView.isSelected = true

        clickMe.setOnClickListener(View.OnClickListener {
            clickMe.text = "Wow1 I was clicked"
        })

        clickMe.setOnLongClickListener(View.OnLongClickListener {
            clickMe.text = "Hurray! I was long presseed"
            true
        })

        submit.setOnClickListener(View.OnClickListener {
            var result = ""

            if(radioGroup.checkedRadioButtonId != -1){
                result += "Selected items are :"

                if(male.isChecked)
                    result+= "Male\n"
                else if(female.isChecked)
                    result += "Female\n"
            }
            result += "Known Languages : "

            if(english.isChecked)
                result+= "English,"
            if(kiswahili.isChecked)
                result+= "Kiswahili,"
            if(french.isChecked)
                result+= "French,"
            if(gikuyu.isChecked)
                result+= "Gikuyu,"
            if(german.isChecked)
                result+= "German,"


            textToDisplay.text = result
        })
    }
}
