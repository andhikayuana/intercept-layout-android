package id.yuana.demo.interceptlayoutdemo

import android.content.Context
import android.util.AttributeSet
import androidx.annotation.Keep
import com.google.android.material.theme.MaterialComponentsViewInflater

/**
 * @see: https://helw.net/2018/08/06/appcompat-view-inflation/
 * @see: https://academy.realm.io/posts/layoutinflater-droid-kaigi-2017-jenx/
 */
@Keep
//class CustomViewInflater : AppCompatViewInflater() {
class CustomViewInflater : MaterialComponentsViewInflater() {

    override fun createTextView(context: Context, attrs: AttributeSet) =
        RedTextView(context, attrs)
}