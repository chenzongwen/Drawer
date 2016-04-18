package com.owenchan.demo.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import com.owenchan.demo.R;

/**
 * Created by Owen Chan on 16/4/18.
 * Copyright © 2016 Owen Chan. All rights reserved.
 */
public class HeadView extends LinearLayout implements View.OnClickListener {
    public HeadView(Context context) {
        super(context);
        init(context);
    }

    public HeadView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }


    private void init(Context context) {
        LayoutInflater.from(context).inflate(R.layout.head_view, this);

    }


    @Override
    public void onClick(View v) {


    }
}
