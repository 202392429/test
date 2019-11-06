package com.example.test;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomListView extends ArrayAdapter<User> {

    private LayoutInflater mInflater;
    private ArrayList<User> users;
    private int mViewResourceId;

    public CustomListView(Context context, int textViewResourceId, ArrayList<User> users) {
        super(context, textViewResourceId, users);
        this.users = users;
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mViewResourceId = textViewResourceId;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = mInflater.inflate(mViewResourceId, null);

        User user = users.get(position);

        if (user != null) {
            TextView firstName = (TextView) convertView.findViewById(R.id.FirstText);
            TextView lastName = (TextView) convertView.findViewById(R.id.SecondText);
            TextView favFood = (TextView) convertView.findViewById(R.id.ThirdText);
            TextView age = (TextView) convertView.findViewById(R.id.fourText);


            if (firstName != null) {
                firstName.setText(user.getFirstText());
            }
            if (lastName != null) {
                lastName.setText((user.getSecondText()));
            }
            if (favFood != null) {
                favFood.setText((user.getThirdText()));
            }
            if (age != null) {
                age.setText((user.getfourText()));
            }

        }

        return convertView;
    }
}