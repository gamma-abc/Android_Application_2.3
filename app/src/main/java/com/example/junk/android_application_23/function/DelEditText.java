package com.example.junk.android_application_23.function;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.EditText;

import com.example.junk.android_application_23.R;

/**
 * Created by Junk on 2018/8/9.
 * 实现搜索框中的删除按钮的功能，点击可以删除EditText中的文字
 */

public class DelEditText extends android.support.v7.widget.AppCompatEditText {
    private Drawable imgClear;
    private Context mContext;
    /**
     * 带参构造函数
     */
    public DelEditText(Context context, AttributeSet attrs){
        super(context,attrs);
        this.mContext=context;
        init();
    }

    /**
     * 烂尾工程~~~
     */
    private void init() {

    }
}
