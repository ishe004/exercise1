package com.cst2335.exercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.makeText;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Context context=null;
        StringBuilder result=new StringBuilder();
        TextView mytext = findViewById(R.id.textview);
        EditText myedit = findViewById(R.id.myedittext);
        Button button = findViewById(R.id.mybutton);
        CheckBox mycheckbox = findViewById(R.id.mycheckbox);
        Switch myswitch = findViewById(R.id.myswitch);
        RadioButton myradio = findViewById(R.id.myradio);
        ImageView myimage= findViewById(R.id.mylogo);
        ImageButton imgbtn= findViewById(R.id.myimagebutton);
        String editString= myedit.getText().toString();
        button.setOnClickListener( vw-> mytext.setText(" Your edit text has: " + editString));
        mycheckbox.setText("Do you drink Coffee?");
        myswitch.setText("Do you like to travel?");
        myradio.setText("Do you like to read?");






       mycheckbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView,boolean isChecked) {
                if (mycheckbox.isChecked()) {
                  //String getCB = mycheckbox.getText().toString();
                    Toast.makeText(MainActivity.this,"you have clicked the checkbox",Toast.LENGTH_LONG).show();
                }
            }
        });
        myswitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView,boolean isChecked) {
                if (myswitch.isChecked()) {

                    Toast.makeText(MainActivity.this,"you have clicked the Switch ",Toast.LENGTH_SHORT).show();
                }
            }
        });
        myradio.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView,boolean isChecked) {
                if (myradio.isChecked()) {

                    Toast.makeText(MainActivity.this,"you have clicked the RadioButton ",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this,"the Radio Button is unchecked",Toast.LENGTH_SHORT).show();
                }
            }
        });


        imgbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

              String result="the width is : " +imgbtn.getMeasuredHeight()+ " the height is: " +imgbtn.getMeasuredWidth();
                Toast.makeText(MainActivity.this,result.toString(),Toast.LENGTH_LONG).show();
            }
        });

    }
}