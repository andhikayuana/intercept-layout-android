package id.yuana.demo.interceptlayoutdemo

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView

class RedTextView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : AppCompatTextView(context, attrs) {

    init {
        setBackgroundColor(Color.RED)
        setTextColor(Color.WHITE)
    }

}
