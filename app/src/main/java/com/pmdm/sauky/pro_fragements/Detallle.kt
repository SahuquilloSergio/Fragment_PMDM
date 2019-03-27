package com.pmdm.sauky.pro_fragements

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class Detallle : Fragment() {
    //Object para el fragment
    companion object {
        fun newInstance(): Detallle {
            return Detallle()
        }
    }
    //Hacemos que se muestre el fragment
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_detallle, container, false)
    }


}
