package com.example.mycounter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  private int mCount = 0;
  private TextView mShowCount;

  public void changeCountText(Integer amount) {
    mShowCount.setText(Integer.toString(amount));
  };

  @SuppressLint("SetTextI18n") // No warning for text internationalisation
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    mShowCount = (TextView) findViewById(R.id.textView_count);

    Button up = (Button) findViewById(R.id.button_countup);
    up.setOnClickListener(view -> {
      mCount++;
      changeCountText(mCount);
    });

    Button down = (Button) findViewById(R.id.button_countdown);
    down.setOnClickListener(view -> {
      mCount--;
      changeCountText(mCount);
    });

    Button reset = (Button) findViewById(R.id.button_reset);
    reset.setOnClickListener(view -> {
      mCount = 0;
      changeCountText(mCount);
      Toast.makeText(MainActivity.this, "the counter has been reset :3", Toast.LENGTH_SHORT).show();
    });

    Button doub = (Button) findViewById(R.id.button_double);
    doub.setOnClickListener(view -> {
      mCount = mCount * 2;
      changeCountText(mCount);
    });
  }
}