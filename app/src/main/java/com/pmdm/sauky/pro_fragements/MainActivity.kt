package com.pmdm.sauky.pro_fragements

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Mostramos el fragment al iniciar
        if (savedInstanceState == null){
            supportFragmentManager
                    .beginTransaction()
                    .add(R.id.fragment, Detallle.newInstance(),
                            "detalle")
                    .commit()
        }
    }
}
