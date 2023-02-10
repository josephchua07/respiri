package com.chua.respiriapp.ui.today

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.chua.respiriapp.ui.today.symptoms.SymptomsFragment

class TodayPagerAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {

    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return SymptomsFragment()
    }
}