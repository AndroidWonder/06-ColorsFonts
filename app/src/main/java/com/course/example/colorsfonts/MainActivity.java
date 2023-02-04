package com.course.example.colorsfonts;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_main);

        TextView tvCustom=(TextView)findViewById(R.id.custom);

        // bind the "custom" TextView with chosen font
        Typeface typeface = getResources().getFont(R.font.jokerman);
        tvCustom.setTypeface(typeface);

        //set color from /res/values/
        int color = getResources().getColor(R.color.red, null);
        tvCustom.setTextColor(color);

        //set type size from /res/values/
        float size= getResources().getDimension(R.dimen.customsize);
        tvCustom.setTextSize(size);

    }
}