# ColourfulToast - 多彩土司

> 多彩土司 · 打造不一样的提示！

- 库开发者：紫叶工作室
- 开源协议：MIT License
- 联系方式：QQ-3287319782
- 加入我们：Email-3287319782@qq.com
- 库负责人：@凉笙初雨



# 库类信息

- 兼容最低：API 21 Android 5.0
- 使用版本：API 29 Android 10
- 版本代码：2
- 版本名称：1.0.1
- 使用语言：Kotlin 100%



# 导入依赖

> 打开项目根目录内的 `build.gradle` 

```groovy
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```



> 打开app目录内的 `build.gradle` 

```groovy
dependencies {
	implementation 'com.github.purpleafx:colourfultoast:1.0.1'
}
```



# 如何使用

> Java

```java
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // 初始化多彩土司，否则不能正常显示！
        ColourfulToast.initialize(this);
    }
}
```

```java
// 完整使用
ColourfulToast.text("多彩土司 · 系统风格")// 设置文本，缺省："多彩土司"
            .duration(ColourfulToast.Duration.LENGTH_SHORT)// 设置持续时间，缺省：ColourfulToast.Duration.LENGTH_SHORT
            .gravity(ColourfulToast.Gravity.BOTTOM)// 设置重力，缺省：ColourfulToast.Gravity.BOTTOM
            .style(ColourfulToast.Style.DEFAULT)// 设置风格，缺省：ColourfulToast.Style.DEFAULT
            .show();// 显示
```



> Kotlin

```kotlin
class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        // 初始化多彩土司，否则不能正常显示！
        ColourfulToast.initialize(this)
    }
}
```

```kotlin
// 完整使用
ColourfulToast.text("多彩土司 · 系统风格")// 设置文本，缺省："多彩土司"
            .duration(ColourfulToast.Duration.LENGTH_SHORT)// 设置持续时间，缺省：ColourfulToast.Duration.LENGTH_SHORT
            .gravity(ColourfulToast.Gravity.BOTTOM)// 设置重力，缺省：ColourfulToast.Gravity.BOTTOM
            .style(ColourfulToast.Style.DEFAULT)// 设置风格，缺省：ColourfulToast.Style.DEFAULT
            .show()// 显示
```



# 常量表格

> 请遵循本库的定义，用本库自带的常量！

| 内部类   | 常量名       | 中文描述         |
| -------- | ------------ | ---------------- |
| Duration | LENGTH_SHORT | 持续时间-长度-短 |
| Duration | LENGTH_LONG  | 持续时间-长度-长 |
| Gravity  | TOP          | 重力-顶部        |
| Gravity  | CENTER       | 重力-中间        |
| Gravity  | BOTTOM       | 重力-底部        |
| Style    | DEFAULT      | 风格-默认        |
| Style    | SUCCESS      | 风格-成功        |
| Style    | FAILED       | 风格-失败        |
| Style    | PROMPT       | 风格-提示        |
| Style    | WARNING      | 风格-警告        |
| Style    | NORMAL       | 风格-正常        |



# 最后说明

> `AIDE` 有可能使用不了该库，请换用 `Android Studio` 

谢谢大家的支持！发现BUG请即时告知我们哦~
