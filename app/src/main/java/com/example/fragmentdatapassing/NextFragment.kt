package com.example.fragmentdatapassing


import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

/**
 * A simple [Fragment] subclass.
 */
class NextFragment : Fragment() {

    lateinit var my_string : String
    lateinit var my_string_two : String

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_next, container, false)


        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments.let {
            val safeArgs = NextFragmentArgs.fromBundle(it!!)
            my_string = safeArgs.passData
            my_string_two = safeArgs.passedDataTwo
            Log.d("Check if data passed", my_string)
            Log.d("Check if data passed", my_string_two)

            Toast.makeText(context, my_string, Toast.LENGTH_SHORT).show()
        }
    }

}
