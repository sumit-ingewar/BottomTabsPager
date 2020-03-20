package com.sumit.bottomtabspager

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.google.android.material.tabs.TabLayoutMediator
import com.sumit.bottomtabspager.adapter.EmojiPagerAdaper
import com.sumit.bottomtabspager.util.TabDataFactory
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var demoCollectionAdapter: EmojiPagerAdaper
    var list = TabDataFactory.getTabData()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        demoCollectionAdapter = EmojiPagerAdaper(this)
        pager.adapter = demoCollectionAdapter

        TabLayoutMediator(tab_layout, pager) { tab, position ->
            val tabData = list[position]
            tab.text = tabData.title
            tab.icon = ContextCompat.getDrawable(this, tabData.imageDrawable)
        }.attach()
    }
}

