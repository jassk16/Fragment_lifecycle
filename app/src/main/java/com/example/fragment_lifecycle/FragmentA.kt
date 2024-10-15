package com.example.fragment_lifecycle

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class FragmentA : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        logFragmentLifecycle("onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        logFragmentLifecycle("onCreateView")
        return inflater.inflate(R.layout.fragment_a, container, false)
    }

    override fun onStart() {
        super.onStart()
        logFragmentLifecycle("onStart")
    }

    override fun onResume() {
        super.onResume()
        logFragmentLifecycle("onResume")
    }

    override fun onPause() {
        super.onPause()
        logFragmentLifecycle("onPause")
    }

    override fun onStop() {
        super.onStop()
        logFragmentLifecycle("onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        logFragmentLifecycle("onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        logFragmentLifecycle("onDestroy")
    }

    private fun logFragmentLifecycle(event: String) {
        Log.d("FragmentA", "$event called")
    }
}
