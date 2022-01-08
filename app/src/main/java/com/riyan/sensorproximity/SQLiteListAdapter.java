package com.riyan.sensorproximity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SQLiteListAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<String> user_id;
    private ArrayList<String> user_title;
    private ArrayList<String> user_x;

    SQLiteListAdapter(Context context1, ArrayList<String> ID, ArrayList<String> TITLE, ArrayList<String> X) {
        this.context = context1;
        this.user_id = ID;
        this.user_title = TITLE;
        this.user_x = X;
    }

    public class Holder {
        TextView textView_id;
        TextView textView_title;
        TextView textView_x;
    }

    @Override
    public int getCount() {
        return user_id.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Holder holder;
        LayoutInflater inflater;

        if (convertView == null) {
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.listview_data_layout, null);

            holder = new Holder();

            holder.textView_id = convertView.findViewById(R.id.text_id);
            holder.textView_title = convertView.findViewById(R.id.text_title);
            holder.textView_x = convertView.findViewById(R.id.text_x);

            convertView.setTag(holder);
        } else {
            holder = (Holder) convertView.getTag();
        }

        holder.textView_id.setText(user_id.get(position));
        holder.textView_title.setText(user_title.get(position));
        holder.textView_x.setText(user_x.get(position));
        return convertView;
    }
}