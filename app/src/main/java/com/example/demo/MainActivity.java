package com.example.demo;

import  android.app.*;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.*;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.Calendar;
import java.util.MissingFormatArgumentException;

public class MainActivity extends AppCompatActivity {
//CheckBox cb;
    DatePicker datapicker;
    int year,month,day;
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        datapicker=findViewById(R.id.dp);
        Calendar calendar= Calendar.getInstance();//初始化日历
        //获取日历的年月日
        year=calendar.get(Calendar.YEAR);
        month=calendar.get(Calendar.MONTH);
        day=calendar.get(Calendar.DAY_OF_MONTH);

        //初始化（实例化，否则出现空指针错误）
        datapicker.init(year, month, day, new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                MainActivity.this.year=year;
                MainActivity.this.month=monthOfYear;
                MainActivity.this.day=dayOfMonth;
                showdata(year,monthOfYear,dayOfMonth);
            }
        });






//        Button button=(Button) findViewById(R.id.button1);
//        //使用单击事件监听器实现
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this,"sss",Toast.LENGTH_SHORT).show();
//            }
//        });

            //获取单选框
//        RadioGroup rg = findViewById(R.id.rg1);
//        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup group, int checkedId) {
//                RadioButton rb=findViewById(checkedId);
//                rb.getText();
//                Toast.makeText(MainActivity.this,rb.getText(),Toast.LENGTH_SHORT).show();
//
//            }
//        });


        //复选框选中并强提示窗口
//        cb=findViewById(R.id.habby1);
//        cb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                if(cb.isChecked()){
//                    cb.getText();
//                    AlertDialog.Builder ab=new AlertDialog.Builder(MainActivity.this);
//                    ab.setMessage(cb.getText());
//                    ab.setTitle("提示：已选中");
//                    ab.show();
//
//                }
//            }
//        });

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

    }

    public void showdata(int year,int month,int day) {
        String str=year+"年"+(month+1)+"月"+day+"日";
        Toast.makeText(MainActivity.this,str,Toast.LENGTH_SHORT).show();

    }








    //使用onClick属性实现,写在oncreate外面
    public void onclick1(View view){
        Toast.makeText(MainActivity.this,"您已点击开始游戏",Toast.LENGTH_SHORT).show();
        //下方提示框都要调用show才能显示
//          AlertDialog.Builder builder = new AlertDialog.Builder(this);
//          builder.setTitle("dialog");
//          builder.setMessage("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
//          builder.show();
        //弹出提示框，都要调用show才能显示
    }

    public void onclick2(View view){
        Toast.makeText(MainActivity.this,"切换账号成功",Toast.LENGTH_SHORT).show();
    }

}
