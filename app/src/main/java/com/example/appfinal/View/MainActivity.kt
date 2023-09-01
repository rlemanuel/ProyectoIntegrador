package com.example.appfinal.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.appfinal.R
import com.example.appfinal.databinding.ActivityMainBinding
import com.example.appfinal.ViewModel.MainViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

    val editText1: EditText = findViewById(R.id.editTextText)
    val editText2: EditText = findViewById(R.id.editTextText2)
    val button: Button = findViewById(R.id.button5)
    val textViewResult: TextView = findViewById(R.id.textView2)

     button.setOnClickListener {
         val text1 = editText1.text.toString()
         val text2 = editText2.text.toString()

         val ComparacionResultante = viewModel.comparaStrings( text1, text2)
     if(ComparacionResultante.areEqual) {
         textViewResult.text = "Ambas cadenas son iguales :)"
     } else {
         textViewResult.text = "Las cadenas son diferentes"
            }
         }
    }
}