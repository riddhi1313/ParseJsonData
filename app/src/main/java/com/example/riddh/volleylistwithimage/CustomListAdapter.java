package com.example.riddh.volleylistwithimage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Movie;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;

import java.util.List;

/**
 * Created by riddh on 5/6/2018.
 */

public class CustomListAdapter extends BaseAdapter {
    private Activity activity;
    private LayoutInflater inflater;
    private List<User> usersItems;
    ImageLoader imageLoader = AppController.getInstance().getImageLoader();

    public CustomListAdapter(Activity activity, List<User> usersItems) {
        this.activity = activity;
        this.usersItems = usersItems;
    }

    @Override
    public int getCount() {
        return usersItems.size();
    }

    @Override
    public Object getItem(int location) {
        return usersItems.get(location);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (inflater == null)
            inflater = (LayoutInflater) activity
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null)
            convertView = inflater.inflate(R.layout.list_row, null);

        if (imageLoader == null)
            imageLoader = AppController.getInstance().getImageLoader();
        NetworkImageView avtar = (NetworkImageView) convertView
                .findViewById(R.id.avtarimg);
        TextView fname = (TextView) convertView.findViewById(R.id.fname);
        TextView lname = (TextView) convertView.findViewById(R.id.lname);


        // getting movie data for the row
        User u = usersItems.get(position);

        // thumbnail image
        avtar.setImageUrl(u.getavtarUrl(), imageLoader);

        // title
        fname.setText("FirstNameName: "+ u.getFname());

        // rating
        lname.setText("LastName: " + String.valueOf(u.getLname()));



        return convertView;
    }

}
