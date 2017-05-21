package cn.jangit.programc.Activity.RankActivity;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ListView;

import cn.jangit.programc.Activity.Component.ChapterButton;
import cn.jangit.programc.Activity.Component.PersonalInf;
import cn.jangit.programc.R;
import cn.jangit.programc.Tool.Fonts;
import cn.jangit.programc.Tool.ListViewAdapter;

public class RankActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        long time=System.currentTimeMillis();
        setContentView(R.layout.activity_rank);
        LinearLayout linearLayout=(LinearLayout)findViewById(R.id.rank_section);
        ListView listView = new ListView(this);
        ListViewAdapter adapter=new ListViewAdapter();
        for(int i=1;i<50;i++){
            adapter.addPersonalInf(new PersonalInf(this,"bbbb","04106076","1000",i, Fonts.customFont ));
        }
        adapter.commit();
        listView.setAdapter(adapter);
        linearLayout.addView(listView);
        System.out.println("time:"+(System.currentTimeMillis()-time));
    }
}
