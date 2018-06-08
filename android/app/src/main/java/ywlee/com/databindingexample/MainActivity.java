package ywlee.com.databindingexample;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;

import ywlee.com.databindingexample.databinding.ActivityMainBinding;

public class MainActivity extends Activity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // DataBinding 은 setContentView 가 필요없다.
//        setContentView(R.layout.activity_main);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setActivity(MainActivity.this);

        // 개쩜..바로 사용할수 있음..dddd
        binding.mainTxvBindingTest.setText("Test");
    }

    public void onButtonClick() {
        binding.mainTxvBindingTest.setText("clicked");
        binding.mainTxvBindingTest.setTextColor(Color.parseColor("#ff0000"));
    }
}
