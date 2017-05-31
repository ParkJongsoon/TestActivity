package material.kcci.testactivity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import material.kcci.testactivity.ex.go
import material.kcci.testactivity.page.Page


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button5.text = getString(R.string.go, Page.SECOND.name(resources))
        button5.setOnClickListener {
            go(Page.SECOND)
        }
    }
}
