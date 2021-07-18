package pete.cdmochi.viewpager2experiment

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ViewPagerItemView: FrameLayout {
    constructor(context: Context): super(context)
    constructor(context: Context, attributeSet: AttributeSet): super(context, attributeSet)
    constructor(context: Context, attributeSet: AttributeSet, defStyle: Int): super(context, attributeSet, defStyle)

    init {
        inflate(context, R.layout.view_view_pager_itemview, this)
    }

    fun init(items: List<String>) {
        val rv = findViewById<RecyclerView>(R.id.rvItems)
        with(rv) {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            adapter = ItemAdapter(
                context = context,
                items = items
            )
        }
    }
}