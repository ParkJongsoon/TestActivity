package material.kcci.testactivity.ex

import android.app.Activity
import android.content.Intent
import material.kcci.testactivity.page.Page

/**
 * Created by db2 on 2017-05-31.
 */

inline fun Activity.go(page: Page, f: (intent: Intent) -> Intent) = startActivity(f(page.intent(applicationContext)))

fun Activity.go(page: Page) = startActivity(page.intent(applicationContext))