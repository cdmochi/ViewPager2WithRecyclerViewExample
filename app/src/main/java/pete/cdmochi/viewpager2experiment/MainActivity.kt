package pete.cdmochi.viewpager2experiment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val viewPager = findViewById<ViewPager2>(R.id.vpViewsWithItem)

        viewPager.adapter = ViewPager2Adapter(
            context = this,
            listItem = listOf(
                "EXAMPLE1",
                "EXAMPLE2",
                "EXAMPLE3",
                "EXAMPLE4"
            )
        )
    }
}