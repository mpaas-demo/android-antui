package com.alipay.mobile.antui.viewdemo.form;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.mpaas.demo.antui.R;

/**
 * Created by minghui on 2017/8/31.
 */

public class FailResultActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View v = View.inflate(this, R.layout.fail_res, null);
        setContentView(v);

    }
}

