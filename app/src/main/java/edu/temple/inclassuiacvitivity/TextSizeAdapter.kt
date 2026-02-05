package edu.temple.inclassuiacvitivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class TextSizeAdapter(private val context: Context, private val textSizes: Array<Int>) : BaseAdapter() {

    override fun getCount(): Int {
        return textSizes.size
    }

    override fun getItem(position: Int): Any {
        return textSizes[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val textView = (convertView as? TextView) ?: TextView(context).apply {
            textSize = 22f
            setPadding(16, 16, 16, 16)
        }
        textView.text = textSizes[position].toString()
        return textView
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val textView = (convertView as? TextView) ?: TextView(context).apply{
            setPadding(16, 16, 16, 16)
        }
        val size = textSizes[position]
        textView.text = size.toString()
        textView.textSize = size.toFloat()
        return textView
    }
}