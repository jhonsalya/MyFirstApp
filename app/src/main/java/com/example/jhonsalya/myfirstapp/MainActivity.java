package com.example.jhonsalya.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //private CheckBox check1, check2, check3;
    //private Button button_sel;

    private static RadioGroup radio_g;
    private static RadioButton radio_b;
    private static Button button_sbm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onClickListenerButton();
        //addListenerOnButton();
    }

    public void onClickListenerButton(){
        radio_g = (RadioGroup)findViewById(R.id.radio_animals);
        button_sbm = (Button)findViewById(R.id.button4);
        button_sbm.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int selected_id = radio_g.getCheckedRadioButtonId();
                        radio_b = (RadioButton)findViewById(selected_id);
                        Toast.makeText(MainActivity.this, radio_b.getText().toString(), Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }
    /* CHECK BOX
    public void addListenerCheckBoxDog(){
        check1 = (CheckBox)findViewById(R.id.checkBox_Dog);
        check1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(((CheckBox)view).isChecked()){
                            Toast.makeText(MainActivity.this, "Dog Selected", Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );
    }

    public void addListenerOnButton(){
        check1 = (CheckBox)findViewById(R.id.checkBox_Dog);
        check2 = (CheckBox)findViewById(R.id.checkBox_Cat);
        check3 = (CheckBox)findViewById(R.id.checkBox_Babi);
        button_sel = (Button)findViewById(R.id.button3);
        button_sel.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        StringBuffer result = new StringBuffer();
                        result.append("Dog: ").append(check1.isChecked());
                        result.append("\nCat: ").append(check2.isChecked());
                        result.append("\nBabi: ").append(check3.isChecked());

                        Toast.makeText(MainActivity.this, result.toString(), Toast.LENGTH_LONG).show();
                    }
                }

        );
    }*/

    /*
    public void addListenerOnButton(){
        pass_word = (EditText)findViewById(R.id.editText7);
        button_sbm = (Button)findViewById(R.id.button2);
        button_sbm.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  Toast.makeText(
                    MainActivity.this, pass_word.getText(), Toast.LENGTH_SHORT
                  ).show();
              }
          }

        );
    }*/

    public void onButtonClick(View v){
        EditText e1 = (EditText)findViewById(R.id.editText5);
        EditText e2 = (EditText)findViewById(R.id.editText6);
        TextView t1 = (TextView)findViewById(R.id.textView2);
        int num1 = Integer.parseInt(e1.getText().toString());
        int num2 = Integer.parseInt(e2.getText().toString());
        int sum = num1 + num2;
        t1.setText(Integer.toString(sum));
    }
}
