package com.talo.baseandroid.components

import android.annotation.SuppressLint
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

/**
 * @param DATA 自定義的Data Class來源
 * @param B DataBinding佈局
 * */
abstract class BaseAdapter<DATA, B : ViewDataBinding> : RecyclerView.Adapter<BaseAdapter.ViewHolder<B>>() {

    protected val dataList: MutableList<DATA> = mutableListOf()

    @SuppressLint("NotifyDataSetChanged")
    open fun setData(list: List<DATA>) {
        dataList.clear()
        dataList.addAll(list)
        notifyDataSetChanged()
    }

    class ViewHolder<B : ViewDataBinding>(val binding: B) : RecyclerView.ViewHolder(binding.root)

    override fun getItemCount(): Int = dataList.size
}