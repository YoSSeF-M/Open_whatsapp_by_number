package com.yquery.openwhatsappbynumber

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        openButton.setOnClickListener {

                intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse("https://api.whatsapp.com/send?phone=2" + phoneEditText.text.toString())
                //intent.`package` = "com.whatsapp"
                startActivity(intent)

        }

    }
}