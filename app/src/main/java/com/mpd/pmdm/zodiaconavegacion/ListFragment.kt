package com.mpd.pmdm.zodiaconavegacion

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation

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
            val fragmentBundle = Bundle()
            //it = cada starSign de la lista
            fragmentBundle.putInt(STAR_SIGN_ID, it.id)
            //Asociamos a cada TextView signo un listener para el evento onClick
            //que nos da ya preparada la clase Navigation
            it.setOnClickListener(
                Navigation.createNavigateOnClickListener(R.id.star_sign_id_action, fragmentBundle)
            )
        }

    }


}