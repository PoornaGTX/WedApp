package com.example.dreamwedmadd.costumeAdmin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.dreamwedmadd.R;
import com.example.dreamwedmadd.models.Costume;

import java.util.List;

public class CostumeAdapter extends ArrayAdapter<Costume> {

    private Context context;
    private int resource;
    List<Costume> costumes;

    CostumeAdapter(Context context, int resource, List<Costume> costumes){
        super(context,resource,costumes);
        this.context = context;
        this.resource = resource;
        this.costumes = costumes;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View row = inflater.inflate(resource,parent,false);

        TextView title = row.findViewById(R.id.tvtitle);
        TextView description = row.findViewById(R.id.tvdecription);
        ImageView imageView = row.findViewById(R.id.imageview);


        // costumes [obj1,obj2,obj3]
        Costume costume = costumes.get(position);
        title.setText(costume.getTitle());
        description.setText(costume.getDescription());
        imageView.setVisibility(row.VISIBLE);

        return row;
    }
}