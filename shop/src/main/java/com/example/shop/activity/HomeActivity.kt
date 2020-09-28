package com.example.shop.activity

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.appcompat.app.AppCompatActivity
import com.example.shop.R
import com.example.shop.fragment.GetFragment
import com.example.shop.fragment.MainFragment
import com.example.shop.fragment.SendFragment
import kotlinx.android.synthetic.main.activity_home.*
import java.util.*


class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val fragments: MutableList<Fragment> = ArrayList()
        fragments.add(MainFragment())
        fragments.add(GetFragment())
        fragments.add(SendFragment())

        bu_1.setOnClickListener { replaceFragment(fragments[0]) }
        bu_2.setOnClickListener { replaceFragment(fragments[1])  }
        bu_3.setOnClickListener { replaceFragment(fragments[2]) }
    }

    private fun replaceFragment(fragment: Fragment) {
        val transaction: FragmentTransaction = supportFragmentManager.beginTransaction() // 开启一个事务
        transaction.replace(R.id.fl_content, fragment)
        transaction.commit()
    }
}