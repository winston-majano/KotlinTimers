package dev.winstonmajano.kotlintimers

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


       object: CountDownTimer(10000,1000){
           override fun onFinish() {

                tv1.text = "Left: 0"
           }

           override fun onTick(p0: Long) {

                tv1.text = "Left: "+ p0 / 1000
           }

       }.start()
    }
}
