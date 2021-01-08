package com.purpleaf.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.purpleaf.ct.ColourfulToast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onDefaultClick(view: View) {
        ColourfulToast.text("多彩土司 · 系统风格")
            .duration(ColourfulToast.Duration.LENGTH_SHORT)
            .gravity(ColourfulToast.Gravity.BOTTOM)
            .style(ColourfulToast.Style.DEFAULT)
            .show()
    }

    fun onSuccessClick(view: View) {
        ColourfulToast.text("多彩土司 · 成功风格")
            .duration(ColourfulToast.Duration.LENGTH_SHORT)
            .gravity(ColourfulToast.Gravity.BOTTOM)
            .style(ColourfulToast.Style.SUCCESS)
            .show()
    }

    fun onFailedClick(view: View) {
        ColourfulToast.text("多彩土司 · 失败风格")
            .duration(ColourfulToast.Duration.LENGTH_SHORT)
            .gravity(ColourfulToast.Gravity.BOTTOM)
            .style(ColourfulToast.Style.FAILED)
            .show()
    }

    fun onPromptClick(view: View) {
        ColourfulToast.text("多彩土司 · 提示风格")
            .duration(ColourfulToast.Duration.LENGTH_SHORT)
            .gravity(ColourfulToast.Gravity.BOTTOM)
            .style(ColourfulToast.Style.PROMPT)
            .show()
    }

    fun onWarningClick(view: View) {
        ColourfulToast.text("多彩土司 · 警告风格")
            .duration(ColourfulToast.Duration.LENGTH_SHORT)
            .gravity(ColourfulToast.Gravity.BOTTOM)
            .style(ColourfulToast.Style.WARNING)
            .show()
    }

    fun onNormalClick(view: View) {
        ColourfulToast.text("多彩土司 · 正常风格")
            .duration(ColourfulToast.Duration.LENGTH_SHORT)
            .gravity(ColourfulToast.Gravity.BOTTOM)
            .style(ColourfulToast.Style.NORMAL)
            .show()
    }
}