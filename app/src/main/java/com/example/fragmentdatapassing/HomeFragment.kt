package com.example.fragmentdatapassing


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {

    lateinit var pass_data : Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root =  inflater.inflate(R.layout.fragment_home, container, false)



        // button to pass data onclick
        pass_data = root.findViewById(R.id.pass_data)

        pass_data.setOnClickListener {
            //data to be passsed
            val data_one  = "Moses Wangira"
            val data_two = "Everline Mwato"
            val pass_data_to_next = HomeFragmentDirections.actionHomeFragmentToNextFragment(data_one, data_two)

            Navigation.findNavController(it).navigate(pass_data_to_next)
        }
        return root
    }


}
