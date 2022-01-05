package id.yuana.demo.interceptlayoutdemo

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.Button

/**
 * @see: https://helw.net/2018/08/06/appcompat-view-inflation/
 * @see: https://academy.realm.io/posts/layoutinflater-droid-kaigi-2017-jenx/
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        val layoutInflater = LayoutInflater.from(this)
        layoutInflater.factory2 = object : LayoutInflater.Factory2 {

            override fun onCreateView(
                parent: View?,
                name: String,
                context: Context,
                attrs: AttributeSet
            ): View? {
                if (name == "TextView") {
                    return RedTextView(context, attrs)
                }

                /**
                 * @example: if we return null, not using from [AppCompatButton] just [Button]
                 * @example: if we return from delegate, we can replace [Button] to [AppCompatButton]
                 */
                return delegate.createView(parent, name, context, attrs)
            }

            override fun onCreateView(name: String, context: Context, attrs: AttributeSet): View? =
                onCreateView(null, name, context, attrs)

        }

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnSecondActivity).apply {
            setOnClickListener {
                startActivity(SecondActivity.createIntent(this@MainActivity))
            }
        }
    }
}