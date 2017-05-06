package com.wordpress.kadekadityablog.mytourguide;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class EventsFragment extends Fragment {

    public EventsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.information_list, container, false);

        // Create a list of information
        final ArrayList<Information> informations = new ArrayList<Information>();
        informations.add(new Information(getString(R.string.events_judul_pkb),R.drawable.pkb,getString(R.string.events_deskrispi_pkb)));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        InformationAdapter informationAdapter = new InformationAdapter(getActivity(), informations);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_listyout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(informationAdapter);

        /**
         * bikin item supaya bisa di klik dan menuju ke halaman informasi
         */
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                /**
                 * ketahui dulu data mana yang di klik
                 */
                Information information = informations.get(position);

                /**
                 * bikin intent untuk perpindahan dari fragment menuju actvity yang di inginkan
                 */
                Intent intent = new Intent(getActivity(),InformationDetail.class);

                /**
                 * pass object yang berisi informasi menuju intent yang baru kemudian jalankan
                 * view nya
                 */
                intent.putExtra(String.valueOf(R.string.pass_information),information);
                startActivity(intent);
            }
        });

        return rootView;
    }

    @Override
    public void onStop() {
        super.onStop();
    }

}
