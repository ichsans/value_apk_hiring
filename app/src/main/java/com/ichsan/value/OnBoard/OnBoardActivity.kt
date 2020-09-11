package com.ichsan.value.OnBoard

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.ichsan.value.common.BaseActivity
import com.ichsan.value.login.LoginScreenActivity
import com.ichsan.value.R
import kotlinx.android.synthetic.main.activity_on_board.*

class OnBoardActivity : BaseActivity(), View.OnClickListener {

    val mResources = intArrayOf(R.drawable.ic_easy,
        R.drawable.ic_fast,
        R.drawable.ic_free,
        R.drawable.ic_join)
    lateinit var adapter: SlidingPagerAdapter
    var currentTab = 0
    var tabCount = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_board)
        tabCount = mResources.size
        adapter = SlidingPagerAdapter(supportFragmentManager, mResources)
        viewPager.adapter = adapter

        val pageTransformer = ParallaxTransformer()
        viewPager.setPageTransformer(true, pageTransformer)

        tabLayout.setupWithViewPager(viewPager)
        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabReselected(tab: TabLayout.Tab?) {
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabSelected(tab: TabLayout.Tab?) {
                viewPager.currentItem = tab!!.position
            }

        })
        viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(state: Int) {

            }

            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                currentTab = position + 1
                if (currentTab == tabCount) {
                    skip.text = getString(R.string.continues)
                } else {
                    skip.text = getString(R.string.skip)
                }
            }

            override fun onPageSelected(position: Int) {
            }

        })
        next.setOnClickListener(this)
        skip.setOnClickListener(this)

    }

    override fun clickListener() {
        TODO("Not yet implemented")
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.next -> {
                if (currentTab == tabCount) {
                    skip.text = getString(R.string.continues)
                } else {
                    skip.text = getString(R.string.skip)
                    viewPager.currentItem = currentTab
                }
            }

            R.id.skip -> {
                if (currentTab == tabCount) {
                    Toast.makeText(
                        this,
                        "Continue Press",
                        Toast.LENGTH_SHORT
                    ).show()
                } else {
                    Toast.makeText(
                        this,
                        "Skip Press",
                        Toast.LENGTH_SHORT
                    ).show()
                }

                baseStartActivity<LoginScreenActivity>(this)
            }
        }
    }
}


@Suppress("DEPRECATION")
class SlidingPagerAdapter(fragmentManager: FragmentManager?, val mResources: IntArray) : FragmentPagerAdapter(
    fragmentManager!!
) {

    override fun getItem(position: Int): Fragment {
        return IntroPage().newInstance(position)
    }

    override fun getCount(): Int {
        return mResources.size
    }
}