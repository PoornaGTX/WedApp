package com.example.dreamwedmadd.DecorationAdmin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.dreamwedmadd.R;
import com.example.dreamwedmadd.models.Decorator;
import com.google.android.material.textview.MaterialTextView;

import java.util.List;

public class DecoAdaptor extends ArrayAdapter<Decorator> {

    Context context;
    int resource;
    List<Decorator> decorators;

    public DecoAdaptor(Context context,int resource,List<Decorator> decorators){
        super(context,resource,decorators);
        this.context=context;
        this.resource=resource;
        this.decorators=decorators;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater=LayoutInflater.from(context);
        View row=layoutInflater.inflate(resource,parent,false);

        TextView name=row.findViewById(R.id.SingleDecTitle);
        TextView description=row.findViewById(R.id.SingleDecdis);

        Decorator decorator=decorators.get(position);

        name.setText(decorator.getfName());
        description.setText(decorator.getDescription());


        return row;
    }
}


//
//    Context context;
//    int resource;
//    List<ToDo> toDos;
//
//
//    public ToDoAdaptor(Context context, int resource, List<ToDo> toDos){
//        super(context,resource,toDos);
//
//        this.context=context;
//        this.resource=resource;
//        this.toDos=toDos;
//
//    }
//
//    @NonNull
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//
//
//        LayoutInflater inflater=LayoutInflater.from(context);
//        View row=inflater.inflate(resource,parent,false);
//
//        TextView title=row.findViewById(R.id.tvTitle);
//        TextView description =row.findViewById(R.id.tvdescription);
//        ImageView imageView=row.findViewById(R.id.imageView);
//
//        ToDo toDo=toDos.get(position);
//        title.setText(toDo.getTitle());
//        description.setText(toDo.getDescription());
//        imageView.setVisibility(row.INVISIBLE);
//
//        if (toDo.getFinished()>0){
//            imageView.setVisibility(View.VISIBLE);
//
//        }
//
//        return row;
//    }

