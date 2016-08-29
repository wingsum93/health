package com.example.wayne.androidhealth.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.wayne.androidhealth.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by steve_000 on 2016/8/29.
 * for project anroidHealth
 * package name com.example.wayne.androidhealth.activity
 */
public class InputCaloryAct extends Activity implements View.OnClickListener{

    private String t = "InputCaloryAct";
    @BindView(R.id.btn_ok) protected Button btn_ok;
    @BindView(R.id.btn_cancel) protected Button btn_cancel;
    @BindView(R.id.editText) protected EditText editText;



    public static Intent newIntent(Context context){
        Intent i = new Intent(context,InputCaloryAct.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        i.putExtra("a","aaa");
        return i;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_input_car);
        ButterKnife.bind(this);
        setMyView();
    }

    private void setMyView() {
        setTitle(R.string.title_dialog_input_calory);
        //set text

        //listener
        btn_ok.setOnClickListener(this);
        btn_ok.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_ok:

                break;
            case R.id.btn_cancel:
                break;
        }
    }
}
