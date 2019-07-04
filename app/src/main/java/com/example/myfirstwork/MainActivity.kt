package com.example.myfirstwork

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // ボタン切り替えフラグ
        var flag = false

        // リスナーをボタンに登録
        button.setOnClickListener {

            if(flag){
                textView.setText(getString(R.string.tempura))
                flag = false

            } else {
                textView.setText(getString(R.string.sushi))
                flag = true
            }
        }
    }
}
