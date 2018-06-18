package com.example.arnau.loggindemo.Juego;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.arnau.loggindemo.Clases.Objeto;
import com.example.arnau.loggindemo.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class ObjetoArrayAdapter extends ArrayAdapter<Objeto> {
    public ObjetoArrayAdapter(@NonNull Context context, List<Objeto> resource) {
        super(context, 0,resource);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        Objeto u = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.objeto_layout, parent, false);
        }
        Picasso.with(super.getContext()).load(u.getUrlObjeto()).into((ImageView) convertView.findViewById(R.id.avatar_image));
        TextView et = (TextView)convertView.findViewById(R.id.username_txt);
        et.setText(u.getNombreObjeto());
        return convertView;
    }
}
