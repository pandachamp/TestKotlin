package puri.excalibur.testkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_test_test.*

class TestTest : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_test)

        button.setOnClickListener({
            var st = editText_1.text.toString().toInt()
            var nd = editText_2.text.toString().toInt()

            val result = st+nd

            textView_1.text = result.toString()
        })

    }
}