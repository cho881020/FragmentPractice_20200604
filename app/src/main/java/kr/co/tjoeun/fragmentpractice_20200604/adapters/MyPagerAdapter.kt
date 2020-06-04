package kr.co.tjoeun.fragmentpractice_20200604.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import kr.co.tjoeun.fragmentpractice_20200604.fragments.FirstFragment
import kr.co.tjoeun.fragmentpractice_20200604.fragments.SecondFragment
import kr.co.tjoeun.fragmentpractice_20200604.fragments.ThirdFragment

class MyPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when(position) {
            0 -> FirstFragment()
            1 -> SecondFragment()
            else -> ThirdFragment()
        }
    }

    override fun getCount(): Int {
        return 3
    }


}