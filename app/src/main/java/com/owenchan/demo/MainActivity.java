package com.owenchan.demo;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.owenchan.demo.view.HeadView;
import com.owenchan.demo.view.MiddleView;

public class MainActivity extends Activity implements OnScrollListener {

    ListView mListView;

    LinearLayout shadowLayout;
    View middleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView) findViewById(R.id.demo_lv);
        shadowLayout = (LinearLayout) findViewById(R.id.shadow_layout);

        middleView = new MiddleView(this);

        mListView.addHeaderView(new HeadView(this));
        mListView.addHeaderView(middleView);

        mListView.setOnScrollListener(this);
        mListView.setAdapter(new Adapter(this, Model.getSettingItem()));
    }


    @Override
    public void onScrollStateChanged(AbsListView view, int scrollState) {
        //
    }

    @SuppressLint("NewApi")
    @Override
    public void onScroll(AbsListView view, int firstVisibleItem,
                         int visibleItemCount, int totalItemCount) {
        int middleViewLocal = middleView.getTop();
        if (middleViewLocal <= 0 || firstVisibleItem >= 1) {
            shadowLayout.setVisibility(View.VISIBLE);
        } else {
            shadowLayout.setVisibility(View.INVISIBLE);
        }
    }
}
