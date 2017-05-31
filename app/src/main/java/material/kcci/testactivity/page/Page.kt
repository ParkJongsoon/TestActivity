package material.kcci.testactivity.page

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.res.Resources
import material.kcci.testactivity.MainActivity
import material.kcci.testactivity.MenuActivity
import material.kcci.testactivity.R

/**
 * Created by db2 on 2017-05-31.
 */

enum class Page(val nameId: Int, val page: Class<out Activity>)
{
    MAIN(R.string.page_main, MainActivity::class.java)
    {
        override fun intent(context: Context): Intent = super.intent(context).apply { addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP) }
    },
    SECOND(R.string.page_second, MenuActivity::class.java);

    open fun intent(context: Context) = Intent(context, page)
    fun name(resources: Resources) = resources.getString(nameId)

}