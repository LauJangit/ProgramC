package cn.jangit.programc.Activity.Component;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import cn.jangit.programc.Tool.Screen;

/**
 * Created by jangitlau on 2017/5/19.
 */

public class ChapterButton extends ImageButton{
    public ChapterButton(Context context){
        super(context);
        int screenWitdh=Screen.getScreenWidth(context);
        LinearLayout.LayoutParams layoutParams=new LinearLayout.LayoutParams(
                screenWitdh/10*9, LinearLayout.LayoutParams.MATCH_PARENT);
        layoutParams.setMargins(screenWitdh/20,0,screenWitdh/20,0);
        this.setLayoutParams(layoutParams);



        this.setBackgroundColor(Color.parseColor("#000000"));
//        this.setBackground(Drawable.createFromPath());
    }
}
