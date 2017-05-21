package cn.jangit.programc.Activity.MainActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import cn.jangit.programc.Activity.LinearPractiseListActivity.LinearPractiseListActivity;
import cn.jangit.programc.Activity.MockExamActivity.MockExamActivity;
import cn.jangit.programc.Activity.RandomPracticeActivity.RandomPracticeActivity;
import cn.jangit.programc.Activity.RankActivity.RankActivity;
import cn.jangit.programc.Tool.Fonts;
import cn.jangit.programc.User.User;
import cn.jangit.programc.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Fonts.customFont = Typeface.createFromAsset(this.getAssets(), "fonts/pianpian.otf");

        //Linear Practice Button
        ImageButton linear_practice_btn=(ImageButton)findViewById(R.id.linear_practice_btn);
        linear_practice_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(User.isLogin()) {
                    Intent intent = new Intent(MainActivity.this, LinearPractiseListActivity.class);
                    startActivity(intent);
                }else{
                    User.doLogin();
                }
            }
        });

        //Random Practice Button
        ImageButton random_practice_btn=(ImageButton)findViewById(R.id.random_practice_btn);
        random_practice_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(User.isLogin()) {
                    Intent intent = new Intent(MainActivity.this, RandomPracticeActivity.class);
                    startActivity(intent);
                }else{
                    User.doLogin();
                }
            }
        });

        //Mock Exam Button
        ImageButton mock_exam_btn=(ImageButton)findViewById(R.id.mock_exam_btn);
        mock_exam_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(User.isLogin()) {
                    Intent intent = new Intent(MainActivity.this, MockExamActivity.class);
                    startActivity(intent);
                }else{
                    User.doLogin();
                }
            }
        });

        //Rank Button
        ImageButton rank_btn=(ImageButton)findViewById(R.id.rank_btn);
        rank_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(User.isLogin()) {
                    Intent intent = new Intent(MainActivity.this, RankActivity.class);
                    startActivity(intent);
                }else {
                    User.doLogin();
                }
            }
        });


    }
}
