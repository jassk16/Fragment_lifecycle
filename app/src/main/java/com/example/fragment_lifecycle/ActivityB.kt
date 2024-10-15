package com.example.fragment_lifecycle


import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class ActivityB : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        // Log activity lifecycle event
        logActivityLifecycle("onCreate")

        // Add fragment to Activity B
        if (savedInstanceState == null) {
            val fragmentB = FragmentB()
            supportFragmentManager.beginTransaction()
                .add(R.id.fragmentContainer, fragmentB, "FragmentB")
                .commit()
        }
    }

    override fun onStart() {
        super.onStart()
        logActivityLifecycle("onStart")
    }

    override fun onResume() {
        super.onResume()
        logActivityLifecycle("onResume")
    }

    override fun onPause() {
        super.onPause()
        logActivityLifecycle("onPause")
    }

    override fun onStop() {
        super.onStop()
        logActivityLifecycle("onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        logActivityLifecycle("onDestroy")
    }

    private fun logActivityLifecycle(event: String) {
        Log.d("ActivityB", "$event called")
    }
}

