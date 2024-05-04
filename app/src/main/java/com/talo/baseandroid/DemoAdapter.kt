package com.talo.baseandroid

import android.view.LayoutInflater
import android.view.ViewGroup
import com.talo.baseandroid.components.BaseAdapter
import com.talo.baseandroid.databinding.ItemDemoBinding

class DemoAdapter: BaseAdapter<TextData, ItemDemoBinding>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder<ItemDemoBinding> {
        val binding = ItemDemoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder<ItemDemoBinding>, position: Int) {
        val itemData = dataList[position]
        holder.binding.apply {
            tv.text = itemData.string
        }
    }

}