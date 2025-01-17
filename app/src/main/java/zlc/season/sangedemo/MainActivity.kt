package zlc.season.sangedemo

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import zlc.season.sangedemo.demo.DemoActivity
import zlc.season.sangedemo.demo.normal.NormalActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_normal.setOnClickListener {
            startActivity(Intent(this, NormalActivity::class.java))
        }

        btn_multi.setOnClickListener {
            startActivity(Intent(this, DemoActivity::class.java))
        }

    }
}