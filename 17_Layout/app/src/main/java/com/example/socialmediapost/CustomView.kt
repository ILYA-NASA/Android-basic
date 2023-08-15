package com.example.socialmediapost

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.example.socialmediapost.databinding.MyCustomSmpBinding

class CustomView
@JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {
    private val binding = MyCustomSmpBinding.inflate(LayoutInflater.from(context))

    init {
        addView(binding.root)
    }

    fun setName(text: String) {
        binding.myCustomSmpNameText.text = text
    }

    fun setStatus(text: String) {
        binding.myCustomSmpStatusText.text = text
    }

}