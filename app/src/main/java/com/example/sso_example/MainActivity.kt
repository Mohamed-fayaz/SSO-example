package com.example.sso_example

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btn = findViewById<Button>(R.id.button)
        IAMOAuth2SDK.getInstance(this).handleRedirection(this)
        btn.setOnClickListener {
//            try {
//                val myIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://accounts.zoho.com"))
//                startActivity(myIntent)
//            } catch (e: ActivityNotFoundException) {
//                Toast.makeText(
//                    this, "No application can handle this request."
//                            + " Please install a webbrowser", Toast.LENGTH_LONG
//                ).show()
//                e.printStackTrace()
//            }
        }
    }
}