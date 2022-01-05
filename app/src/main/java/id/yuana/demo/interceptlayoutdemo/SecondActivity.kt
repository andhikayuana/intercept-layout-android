package id.yuana.demo.interceptlayoutdemo

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity(R.layout.activity_second) {

    companion object {
        fun createIntent(context: Context): Intent = Intent(context, SecondActivity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        findViewById<Button>(R.id.btnOkay).apply {
            setOnClickListener {
                finish()
            }
        }
    }
}