package ywlee.com.databindingexample;

import android.app.Activity;
import android.databinding.DataBindingUtil;
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

        // 개쩜..바로 사용할수 있음..
        binding.mainTxvBindingTest.setText("Test");
    }
}
