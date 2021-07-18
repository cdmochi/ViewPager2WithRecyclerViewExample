package pete.cdmochi.viewpager2experiment

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ViewPager2Adapter(private val context: Context,
                        private val listItem: List<String>): RecyclerView.Adapter<ViewPager2Adapter.ViewHolder>() {
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ViewPagerItemView(context).apply {
                layoutParams = RecyclerView.LayoutParams(
                    RecyclerView.LayoutParams.MATCH_PARENT,
                    RecyclerView.LayoutParams.MATCH_PARENT
                )
            }
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        (holder.itemView as ViewPagerItemView).init(listItem)
    }

    override fun getItemCount(): Int = listItem.size
}