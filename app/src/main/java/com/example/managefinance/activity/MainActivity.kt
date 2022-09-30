package com.example.managefinance.activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.managefinance.R
import com.example.managefinance.UI.Dashboard
import com.example.managefinance.UI.CreatorActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var menu_button : Button = findViewById(R.id.btnmenu)
        menu_button.setOnClickListener(View.OnClickListener {
            var intentlog = Intent(this, Dashboard::class.java )
            startActivity(intentlog)
        })

        var info_button : Button = findViewById(R.id.btninfo)
        info_button.setOnClickListener(View.OnClickListener {
            var intentreg = Intent(this, CreatorActivity::class.java)
            startActivity(intentreg)
        })
    }
}