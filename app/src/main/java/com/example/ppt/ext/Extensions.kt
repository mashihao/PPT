@file:Suppress("DEPRECATION", "unused", "UNCHECKED_CAST")

package com.example.ppt.ext


import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.Parcelable
import androidx.core.app.ActivityOptionsCompat
import androidx.fragment.app.Fragment
import java.io.Serializable
import kotlin.reflect.KClass

/**

 *@version 2020/7/14
 */


fun <T> Intent.putExtras(vararg params: Pair<String, T>): Intent {
    if (params.isEmpty()) return this
    params.forEach { (key, value) ->
        when (value) {
            is Int -> putExtra(key, value)
            is Byte -> putExtra(key, value)
            is Char -> putExtra(key, value)
            is Long -> putExtra(key, value)
            is Float -> putExtra(key, value)
            is Short -> putExtra(key, value)
            is Double -> putExtra(key, value)
            is Boolean -> putExtra(key, value)
            is Bundle -> putExtra(key, value)
            is String -> putExtra(key, value)
            is IntArray -> putExtra(key, value)
            is ByteArray -> putExtra(key, value)
            is CharArray -> putExtra(key, value)
            is LongArray -> putExtra(key, value)
            is FloatArray -> putExtra(key, value)
            is Parcelable -> putExtra(key, value)
            is ShortArray -> putExtra(key, value)
            is DoubleArray -> putExtra(key, value)
            is BooleanArray -> putExtra(key, value)
            is CharSequence -> putExtra(key, value)
            is Array<*> -> {
                when {
                    value.isArrayOf<String>() -> putExtra(key, value as Array<String?>)
                    value.isArrayOf<Parcelable>() -> putExtra(key, value as Array<Parcelable?>)
                    value.isArrayOf<CharSequence>() -> putExtra(key, value as Array<CharSequence?>)
                    else -> putExtra(key, value)
                }
            }
            is Serializable -> putExtra(key, value)
        }
    }
    return this
}

inline fun <reified TARGET : Activity> Activity.startActivity(
    vararg params: Pair<String, Any?>
) = startActivity(Intent(this, TARGET::class.java).putExtras(*params))

inline fun <reified TARGET : Activity> Fragment.startActivity(
    vararg params: Pair<String, Any?>
) {
    startActivity(
        Intent(requireContext(), TARGET::class.java).putExtras(*params),
        ActivityOptionsCompat.makeBasic().toBundle()
    )
}

inline fun <reified TARGET : Activity> Fragment.startActivity(
    options: ActivityOptionsCompat = ActivityOptionsCompat.makeBasic(),
    vararg params: Pair<String, Any?>
) {
    startActivity(
        Intent(requireContext(), TARGET::class.java).putExtras(*params),
        options.toBundle()
    )
}


fun Activity.startActivity(
    target: KClass<out Activity>, vararg params: Pair<String, Any?>
) = startActivity(Intent(this, target.java).putExtras(*params))

fun Fragment.startActivity(
    target: KClass<out Activity>, vararg params: Pair<String, Any?>
) = activity?.run {
    startActivity(Intent(this, target.java).putExtras(*params))
}


/**
 */
fun Activity.startActivity(
    target: Class<out Activity>, vararg params: Pair<String, Any?>
) = startActivity(Intent(this, target).putExtras(*params))

fun Fragment.startActivity(
    target: Class<out Activity>, vararg params: Pair<String, Any?>
) = activity?.run {
    startActivity(Intent(this, target).putExtras(*params))
}

fun Activity.finish(vararg params: Pair<String, Any>) = run {
    setResult(Activity.RESULT_OK, Intent().putExtras(*params))
    finish()
}

fun Activity.finish(intent: Intent) = run {
    setResult(Activity.RESULT_OK, intent)
    finish()
}

fun String.toIntent(flags: Int = 0): Intent = Intent(this).setFlags(flags)

inline fun <O> O?.runIfNonNull(block: (O) -> Unit) {
    this?.let { block(it) }
}

inline fun <T, R> T.runSafely(block: (T) -> R) = try {
    block(this)
} catch (e: Exception) {
    e.printStackTrace()
    null
}

