package com.example.fragment_lifecycle


import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Log activity lifecycle event
        logActivityLifecycle("onCreate")

        // Add fragment to Activity A
        if (savedInstanceState == null) {
            val fragmentA = FragmentA()
            supportFragmentManager.beginTransaction()
                .add(R.id.fragmentContainer, fragmentA, "FragmentA")
                .commit()
        }

        // Button to navigate to Activity B
        val button: Button = findViewById(R.id.buttonOpenActivityB)
        button.setOnClickListener {
            val intent = Intent(this, ActivityB::class.java)
            startActivity(intent)
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
        Log.d("ActivityA", "$event called")
    }
}
