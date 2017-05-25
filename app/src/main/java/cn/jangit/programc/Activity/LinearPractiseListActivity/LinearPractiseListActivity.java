package cn.jangit.programc.Activity.LinearPractiseListActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

import cn.jangit.programc.Activity.Component.ChapterButton;
import cn.jangit.programc.R;

public class LinearPractiseListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_practise_list);
        LinearLayout list_section=(LinearLayout)findViewById(R.id.list_section);

        list_section.addView(new ChapterButton(this));
        list_section.addView(new ChapterButton(this));
        list_section.addView(new ChapterButton(this));
        list_section.addView(new ChapterButton(this));
        list_section.addView(new ChapterButton(this));
        list_section.addView(new ChapterButton(this));
        list_section.addView(new ChapterButton(this));
        list_section.addView(new ChapterButton(this));
        list_section.addView(new ChapterButton(this));

    }
}
