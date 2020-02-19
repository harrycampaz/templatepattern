package com.dezzapps.templatepattern;

import android.app.Activity;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

public class Sports extends Story {

    TextView textTitle, textContent;
    ImageView imageView;

    @Override
    protected void init(Context context) {

        source = "Deportes";
        textTitle = ((Activity) context).findViewById(R.id.text_view_title);
        textContent = ((Activity) context).findViewById(R.id.text_view_content);
        imageView = ((Activity) context).findViewById(R.id.image_view_content);

    }

    @Override
    protected void setTitle(Context context) {


        textTitle.setText(context.getString(R.string.sports_title));


    }

    @Override
    protected void setImage(Context context) {

        imageView.setImageResource(R.drawable.hamilton);

    }

    @Override
    protected void setText(Context context) {

        textContent.setText(context.getString(R.string.sports_content));

    }


}
