package com.example.challenges

import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Im
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val image1:ImageView = findViewById(R.id.fighter_1)
        val image2:ImageView = findViewById(R.id.fighter_2)
        val selectedImage:ImageView = findViewById(R.id.selected_fighter)

        image1.setOnClickListener{
            selectedImage.setImageResource(R.drawable.jin_kazama)
        }
        image2.setOnClickListener{
            selectedImage.setImageResource(R.drawable.marshall_law)
        }

    }
}