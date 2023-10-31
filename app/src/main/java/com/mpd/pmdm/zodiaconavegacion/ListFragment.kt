package com.mpd.pmdm.zodiaconavegacion

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.findNavController

class ListFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val starSigns = listOf<View>(
            view.findViewById(R.id.aquarius),
            view.findViewById(R.id.pisces),
            view.findViewById(R.id.aries),
            view.findViewById(R.id.taurus),
            view.findViewById(R.id.gemini),
            view.findViewById(R.id.cancer),
            view.findViewById(R.id.leo),
            view.findViewById(R.id.virgo),
            view.findViewById(R.id.libra),
            view.findViewById(R.id.scorpio),
            view.findViewById(R.id.sagittarius),
            view.findViewById(R.id.capricorn),
        )

        //Asociamos a cada TextView de Signo el propio fragment como onClickListener (porque lo implementamos)
        starSigns.forEach {
            // Ya no necesitamos el Bundle, al usar safeArgs
            //it = cada starSign de la lista
            it.setOnClickListener{
                //Con safeArgs, se ha creado una clase para los destinos de ListFragment
                //Hemos definido prevismente el argumento seguro en el grafo de navegación
                val action = ListFragmentDirections.starSignIdAction(starSignId = it.id )
                view.findNavController().navigate(action)
            }

        }

    }


}