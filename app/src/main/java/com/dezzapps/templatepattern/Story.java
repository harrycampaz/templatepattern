package com.dezzapps.templatepattern;

import android.app.Activity;
import android.content.Context;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public  abstract class Story {
    public String source;

    public void publish(Context context){
        init(context);
        setImage(context);
        setText(context);
        setTitle(context);
        setDate(context);

    }

    protected abstract void init(Context context);

    protected abstract void setTitle(Context context);
    protected abstract void setImage(Context context);
    protected abstract void  setText(Context context);

    protected  void setDate(Context context){

        Calendar calendar = new GregorianCalendar();

        SimpleDateFormat format = new SimpleDateFormat("MMMM d");
        format.setTimeZone(calendar.getTimeZone());

        TextView textDate = ((Activity) context).findViewById(R.id.text_view_date);

        textDate.setText(format.format(calendar.getTime()));
    }
}
