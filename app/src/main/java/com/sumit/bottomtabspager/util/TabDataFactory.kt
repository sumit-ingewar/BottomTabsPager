package com.sumit.bottomtabspager.util

import androidx.annotation.DrawableRes
import com.sumit.bottomtabspager.R

class TabDataFactory {

    private var tabList = listOf<TabData>()

    companion object {

        fun getTabData(): List<TabData> {
            val tabList = arrayListOf<TabData>()
            tabList.add(TabData(title = "Smile", imageDrawable = R.drawable.ic_smile))
            tabList.add(TabData(title = "Wink", imageDrawable = R.drawable.ic_wink))
            tabList.add(TabData(title = "Cry", imageDrawable = R.drawable.ic_cry))
            tabList.add(TabData(title = "Kiss", imageDrawable = R.drawable.ic_kiss))

            return tabList

        }
    }


    data class TabData(var title: String, @DrawableRes var imageDrawable: Int)
}