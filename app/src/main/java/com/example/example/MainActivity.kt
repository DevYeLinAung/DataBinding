package com.example.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.example.databinding.ActivityMainBinding
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
//    private lateinit var btnSumbit: Button
//    lateinit var ed_txt1: EditText
//    lateinit var ed_txt2: EditText
//    lateinit var txt_view1: TextView
//    lateinit var txt_view2:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
//        btnSumbit = findViewById(R.id.btnSubmit)
//        ed_txt1=findViewById(R.id.editText1)
//        ed_txt2=findViewById(R.id.editText2)
//        txt_view1=findViewById(R.id.txt1)
//        txt_view2=findViewById(R.id.txt2)
//        btnSumbit.setOnClickListener{
//            var ed_1:String = ed_txt1.text.toString()
//            var ed_2:String = ed_txt2.text.toString()
//            var people:People =People("$ed_1","$ed_2")
        binding.btnSubmit.setOnClickListener {
            var ed1: String = binding.editText1.text.toString()
            var ed2: String = binding.editText2.text.toString()
            var p: People = People("$ed1", "$ed2")


            binding.person = p
        }

    }

}

