package com.purpleaf.ct

import android.content.Context
import android.view.LayoutInflater
import android.widget.TextView
import android.widget.Toast

/**
 * 多彩土司 · 打造不一样的提示！
 */
object ColourfulToast {
    private var context: Context? = null// 上下文

    /**
     * 初始化多彩土司，
     * 该方法应放在 Application 类的子类中的 onCreate 方法内被调用
     */
    @JvmStatic
    fun initialize(context: Context) {
        this.context = context
    }

    /**
     * 设置文本，参数可空。参数 text 默认值为："多彩土司"
     */
    @JvmStatic
    fun text(text: CharSequence = "多彩土司"): Builder {
        return Builder(text)
    }

    /**
     * 建造者
     */
    class Builder(private val text: CharSequence) {
        private var duration = Duration.LENGTH_SHORT// 持续时间
        private var gravity = Gravity.BOTTOM// 重力
        private var style = Style.DEFAULT// 风格

        /**
         * 设置持续时间
         */
        fun duration(duration: Int): Builder {
            this.duration = duration
            return this
        }

        /**
         * 设置重力
         */
        fun gravity(gravity: Int): Builder {
            this.gravity = gravity
            return this
        }

        /**
         * 设置风格
         */
        fun style(style: Int): Builder {
            this.style = style
            return this
        }

        /**
         * 显示
         */
        fun show() {
            if (context != null) {
                if (style == Style.DEFAULT) {
                    val toast = Toast.makeText(context, null, Toast.LENGTH_SHORT)
                    toast.setText(text)
                    toast.duration = duration
                    toast.setGravity(gravity, 0, toast.yOffset)
                    toast.show()
                } else {
                    var layoutResId = R.layout.colourful_toast_style_normal
                    when (style) {
                        Style.SUCCESS -> layoutResId = R.layout.colourful_toast_style_success
                        Style.FAILED -> layoutResId = R.layout.colourful_toast_style_failed
                        Style.PROMPT -> layoutResId = R.layout.colourful_toast_style_prompt
                        Style.WARNING -> layoutResId = R.layout.colourful_toast_style_warning
                    }
                    val view = LayoutInflater.from(context)
                        .inflate(layoutResId, null, false)
                    view.findViewById<TextView>(R.id.tv_text).text = text

                    val toast = Toast.makeText(context, null, Toast.LENGTH_SHORT)
                    toast.view = view
                    toast.duration = duration
                    toast.setGravity(gravity, 0, toast.yOffset)
                    toast.show()
                }
            }
        }
    }

    /**
     * 持续时间
     */
    object Duration {
        const val LENGTH_SHORT = Toast.LENGTH_SHORT// 长度_短
        const val LENGTH_LONG = Toast.LENGTH_LONG// 长度_长
    }

    /**
     * 重力
     */
    object Gravity {
        const val TOP = android.view.Gravity.TOP// 顶部
        const val CENTER = android.view.Gravity.CENTER// 中间
        const val BOTTOM = android.view.Gravity.BOTTOM// 底部
    }

    /**
     * 风格
     */
    object Style {
        const val DEFAULT = 0
        const val SUCCESS = 1
        const val FAILED = 2
        const val PROMPT = 3
        const val WARNING = 4
        const val NORMAL = 5
    }
}