package com.chua.respiriapp.ui.medication

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.chua.respiriapp.ui.medication.other_meds.OtherMedsFragment
import com.chua.respiriapp.ui.medication.preventers.PreventerFragment
import com.chua.respiriapp.ui.medication.reliever.RelieverFragment

class MedicationPagerAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {
    override fun getCount(): Int = 3

    override fun getItem(position: Int): Fragment {
        return when(position) {
            0 -> RelieverFragment()
            1 -> PreventerFragment()
            else -> OtherMedsFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence {
        return when(position) {
            0 -> "Relievers"
            1 -> "Preventers"
            else -> "Other meds"
        }
    }
}