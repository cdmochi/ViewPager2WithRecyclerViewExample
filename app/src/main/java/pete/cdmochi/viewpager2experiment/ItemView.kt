package pete.cdmochi.viewpager2experiment

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout
import android.widget.TextView

class ItemView: FrameLayout {
    constructor(context: Context): super(context)
    constructor(context: Context, attributeSet: AttributeSet): super(context, attributeSet)
    constructor(context: Context, attributeSet: AttributeSet, defStyle: Int): super(context, attributeSet, defStyle)

    init {
        inflate(context, R.layout.view_item, this)
    }

    fun init(text: String) {
        findViewById<TextView>(R.id.tvItemText).text = text
    }
}