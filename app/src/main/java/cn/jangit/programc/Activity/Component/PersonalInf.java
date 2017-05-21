package cn.jangit.programc.Activity.Component;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import cn.jangit.programc.Tool.Screen;

/**
 * Created by jangitlau on 2017/5/19.
 */

public class PersonalInf extends RelativeLayout{
    public PersonalInf(Context context,String _Name,String _StuID,String _Score,int _Rank, Typeface customFont){
        super(context);

        int screenWitdh= Screen.getScreenWidth(context);

        LinearLayout.LayoutParams layoutParams=new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, 300);
        this.setLayoutParams(layoutParams);

        //排名
        BrushTextView rankImageView=new BrushTextView(context,customFont);
        rankImageView.setNumber(_Rank);
        rankImageView.setLayoutParams(new LinearLayout.LayoutParams(170, LinearLayout.LayoutParams.MATCH_PARENT));

        //头像
        ImageView imageView=new ImageView(context);
        imageView.setBackgroundColor(Color.parseColor("#ffffff"));
        imageView.setLayoutParams(new LayoutParams(300, LinearLayout.LayoutParams.MATCH_PARENT));
        RelativeLayout.LayoutParams imageViewParams = new RelativeLayout.LayoutParams(imageView.getLayoutParams());
        imageViewParams.setMargins(200, 0, 0, 0);//left, top, right, bottom
        imageView .setLayoutParams(imageViewParams);

        //等级/姓名
        TextView levelTextView=new TextView(context);
        levelTextView.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT,
                LayoutParams.WRAP_CONTENT));
        levelTextView.setText("二品"+"\n"+_Name);
        levelTextView.setTextSize(18);
        RelativeLayout.LayoutParams levelTextViewParams = new RelativeLayout.LayoutParams(levelTextView.getLayoutParams());
        levelTextViewParams.setMargins(550, 10, 0, 0);//left, top, right, bottom
        levelTextView .setLayoutParams(levelTextViewParams);

        //学号/积分
        TextView stuIDTextView=new TextView(context);
        stuIDTextView.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT,
                LayoutParams.WRAP_CONTENT));
        stuIDTextView.setText(_StuID+"\n"+_Score);
        stuIDTextView.setTextSize(18);
        RelativeLayout.LayoutParams stuIDTextViewParams = new RelativeLayout.LayoutParams(stuIDTextView.getLayoutParams());
        stuIDTextViewParams.setMargins(550, 140, 0, 0);//left, top, right, bottom
        stuIDTextView .setLayoutParams(stuIDTextViewParams);


        this.addView(rankImageView);
        this.addView(imageView);
        this.addView(levelTextView);
        this.addView(stuIDTextView);

    }
}
