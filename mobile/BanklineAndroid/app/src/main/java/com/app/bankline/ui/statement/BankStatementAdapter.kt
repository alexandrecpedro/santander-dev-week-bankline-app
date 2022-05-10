package com.app.bankline.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

/**
 * Reference: https://developer.android.com/guide/topics/ui/layout/recyclerview?hl=pt-br#kotlin
 */
class BankStatementAdapter {
    class CustomAdapter(private val dataSet: List<TODO_MODEL>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

        class ViewHolder(private val binding: TODO_BINDING) : RecyclerView.ViewHolder(binding.root) {

            fun bind(item: TODO_MODEL) = with(binding) {
                TODO()
            }
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val binding = TODO_BINDING.inflate(LayoutInflater.from(parent.context), parent, false)
            return ViewHolder(binding)
        }

        override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
            val item = dataSet[position]
            viewHolder.bind(item)
        }

        override fun getItemCount() = dataSet.size
    }
}