package material.kcci.testactivity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        toast("Hello MenuActivity")

    }

    fun toast(message:String, length: Int = Toast.LENGTH_SHORT)
    {
        Toast.makeText(this,message,length).show()
    }
}
