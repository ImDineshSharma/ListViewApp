package com.example.listviewapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

class CustomAdapter extends ArrayAdapter<String> {

    public CustomAdapter(@NonNull Context context, String[] foods) {
        super(context, R.layout.custom_view, foods);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater MyInflater = LayoutInflater.from(getContext());
        View customView = MyInflater.inflate(R.layout.custom_view, parent, false);

        String singleFoodItem = getItem(position);
        TextView MyText = (TextView)customView.findViewById(R.id.MessageText);
        ImageView MyImage = (ImageView)customView.findViewById(R.id.Image);

        MyText.setText(singleFoodItem);
        switch (position){
            case 0:
                MyImage.setImageResource(R.drawable.pasta);
                break;
            case 1:
                MyImage.setImageResource(R.drawable.apple);

        }
        return customView;
    }
}
