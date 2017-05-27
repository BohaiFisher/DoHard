package com.hell.dohard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn_go_git)
    Button btnGoGit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_go_git})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_go_git:
                Intent intent = new Intent(MainActivity.this, GitIntroActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
