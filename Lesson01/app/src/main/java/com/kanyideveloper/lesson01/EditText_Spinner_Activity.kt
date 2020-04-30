package com.kanyideveloper.lesson01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_edit_text__spinner_.*

class EditText_Spinner_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_text__spinner_)

        copy.setOnClickListener(View.OnClickListener {
            tv_display.text = editText.text
        })

        editText.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable?) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                tv_display.text = s
            }

        })

        val languages = arrayOf("Kotlin","Java","Python","JavaScript","Golang","Dart")

        option.adapter = ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,languages)

        option.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {
                tv_spinner.text = "Please select your favorite language"
            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long
            ) {
                    tv_spinner.text = languages.get(position)
            }
        }

        mySeekbar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                tv_seekbar.text = "Seeking at : $progress"
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
                tv_seekbar.text = "Started at : ${seekBar.progress}"
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                tv_seekbar.text = "Stopped at : ${seekBar.progress}"
            }
        })

    }
}
