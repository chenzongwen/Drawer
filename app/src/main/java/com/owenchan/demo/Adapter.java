package com.owenchan.demo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Owen Chan on 16/4/18.
 * Copyright © 2016 Owen Chan. All rights reserved.
 */
public class Adapter extends BaseAdapter {

    private ArrayList<Model> Data;
    private LayoutInflater inflater;


    private static final int TYPE_BUTTON = 0x00;
    private static final int TYPE_ARROW = 0x01;

    public Adapter(Context context, ArrayList<Model> Data){
        inflater = LayoutInflater.from(context);
        this.Data = Data;
    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public Object getItem(int position) {
        return Data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public int getCount() {
        if (Data != null) {
            return Data.size();
        }
        return 0;
    }

    @Override
    public int getItemViewType(int position) {

        return Data.get(position).ItemType;
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        int type = getItemViewType(position);
        if (convertView == null) {
            switch (type) {
                case TYPE_BUTTON:
                    convertView = inflater.inflate(R.layout.setting_item_arrow, null);
                    viewHolder = new ViewHolder();
                    viewHolder.itemName = (TextView) convertView.findViewById(R.id.demo);
                    break;
                case TYPE_ARROW:
                    convertView = inflater.inflate(R.layout.setting_item_arrow, null);
                    viewHolder = new ViewHolder();
                    viewHolder.itemName = (TextView) convertView.findViewById(R.id.demo);
                    break;
            }
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        switch (type) {
            case TYPE_BUTTON:
                viewHolder.itemName.setText(Data.get(position).ItemName);

                break;
            case TYPE_ARROW:
                viewHolder.itemName.setText(Data.get(position).ItemName);

                break;
        }


        return convertView;
    }

    private class ViewHolder {
        TextView itemName;
    }
}
