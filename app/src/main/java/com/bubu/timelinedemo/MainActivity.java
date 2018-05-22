package com.bubu.timelinedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TimeLineView timeLineView;
    private TimeLineView timeLineView1;
    private TimeLineView timeLineView2;
    private TimeLineView timeLineView3;
    private TimeLineView timeLineView4;
    private TimeLineView timeLineView5;
    private ArrayList<String> steps;
    private ArrayList<String> steps1;
    private ArrayList<String> steps2;
    private ArrayList<String> steps3;
    private ArrayList<String> steps4;
    private ArrayList<String> steps5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        timeLineView = findViewById(R.id.timeLineView);
        timeLineView1 = findViewById(R.id.timeLineView1);
        timeLineView2 = findViewById(R.id.timeLineView2);
        timeLineView3 = findViewById(R.id.timeLineView3);
        timeLineView4 = findViewById(R.id.timeLineView4);
        timeLineView5 = findViewById(R.id.timeLineView5);
        steps = new ArrayList<>();
        steps.add("step1");
        steps.add("step2");
        steps.add("step3");
        steps.add("step4");
        timeLineView.setPointStrings(steps,1);
        steps1 = new ArrayList<>();
        steps1.add("step1");
        steps1.add("step2");
        steps1.add("step3");
        steps1.add("step4");
        timeLineView1.setPointStrings(steps1, (float) 2.5);
        steps2 = new ArrayList<>();
        steps2.add("step1");
        steps2.add("step2");
        steps2.add("step3");
        steps2.add("step4");
        steps2.add("step5");
        timeLineView2.setPointStrings(steps2, 3);
        steps3 = new ArrayList<>();
        steps3.add("step1");
        steps3.add("step2");
        steps3.add("step3");
        steps3.add("step4");
        steps3.add("step5");
        timeLineView3.setPointStrings(steps3, (float) 3.5);
        steps4 = new ArrayList<>();
        steps4.add("step1");
        steps4.add("step2");
        steps4.add("step3");
        steps4.add("step4");
        steps4.add("step5");
        timeLineView4.setPointStrings(steps4, 5);
        steps5 = new ArrayList<>();
        steps5.add("斗者");
        steps5.add("斗师");
        steps5.add("大斗师");
        steps5.add("斗灵");
        steps5.add("斗王");
        steps5.add("斗皇");
        steps5.add("斗宗");
        steps5.add("斗尊");
        steps5.add("斗圣");
        steps5.add("斗帝");
        timeLineView5.setPointStrings(steps5, 10);
    }
}
