package com.sumit.bottomtabspager.adapter

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.sumit.bottomtabspager.fragments.FragmentKiss
import com.sumit.bottomtabspager.fragments.FragmentSmile
import com.sumit.bottomtabspager.fragments.FragmentCry
import com.sumit.bottomtabspager.fragments.FragmentWink

class EmojiPagerAdaper(fragment: AppCompatActivity) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int = 4

    override fun createFragment(position: Int): Fragment {

        return when (position) {
            0 -> FragmentSmile()
            1 -> FragmentWink()
            2 -> FragmentCry()
            3 -> FragmentKiss()

            else -> FragmentSmile()
        }
    }
}