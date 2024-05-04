package com.talo.baseandroid.components

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

/**
 * @param B DataBinding佈局
 * */
abstract class BaseActivity<B: ViewDataBinding>: AppCompatActivity() {

    open lateinit var binding: B

    abstract fun getLayoutRes(): Int
    abstract fun initView()
    abstract fun initial()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, getLayoutRes())
        binding.lifecycleOwner = this

        initView()
        initial()
    }
}