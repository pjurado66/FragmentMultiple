package com.pjurado.fragmentmultiple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import com.pjurado.fragmentmultiple.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), OnCambiaFragment {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction()
            .add(R.id.frameLayout1, MenuFragment())
            .commit()
    }

    override fun cambiaFragment(numBoton: Int) {
        if (numBoton == 1){
            supportFragmentManager.beginTransaction()
                .replace(R.id.frameLayout2, Fragment1())
                .commit()
        }
        else{
            supportFragmentManager.beginTransaction()
                .replace(R.id.frameLayout2, Fragment2())
                .commit()
        }

    }
}