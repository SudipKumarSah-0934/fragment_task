package com.example.fragment_task.all_fragments.recyclerview;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fragment_task.R;

import java.util.ArrayList;
import java.util.List;

public class Fragment_Static_Recycler extends Fragment implements View.OnClickListener {
    List<Movie> movieList;
    public Fragment_Static_Recycler() {
        // Required empty public constructor
    }
    public static Fragment_Static_Recycler newInstance() {
        Fragment_Static_Recycler fragment = new Fragment_Static_Recycler();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments()!=null){}
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment__static__recycler, container, false);
        initData();
        initRecyclerView(view);
        return view;
    }
    private void initRecyclerView(View view) {
        RecyclerView recyclerView = view.findViewById(R.id.recycler);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        MovieAdapter adapter = new MovieAdapter(movieList,this);
        recyclerView.setAdapter(adapter);
    }
    private void initData() {
        movieList = new ArrayList<>();
        movieList.add(new Movie("Iron Man", "7.9", "2008", "After being held captive in an Afghan cave, billionaire engineer Tony Stark creates a unique weaponized suit of armor to fight evil."));
        movieList.add(new Movie("The Incredible Hulk", "6.7", "2008", "Bruce Banner, a scientist on the run from the U.S. Government, must find a cure for the monster he turns into, whenever he loses his temper."));
        movieList.add(new Movie("Iron Man 2", "7.0", "2010", "With the world now aware of his identity as Iron Man, Tony Stark must contend with both his declining health and a vengeful mad man with ties to his father's legacy."));
        movieList.add(new Movie("Thor", "7.0", "2011", "The powerful but arrogant god Thor is cast out of Asgard to live amongst humans in Midgard (Earth), where he soon becomes one of their finest defenders."));
        movieList.add(new Movie("Captain America: The First Avenger", "6.9", "2011", "Steve Rogers, a rejected military soldier transforms into Captain America after taking a dose of a Super-Soldier serum. But being Captain America comes at a price as he attempts to take down a war monger and a terrorist organization."));
        movieList.add(new Movie("The Avengers", "8.0", "2012", "Earth's mightiest heroes must come together and learn to fight as a team if they are going to stop the mischievous Loki and his alien army from enslaving humanity."));
        movieList.add(new Movie("Iron Man 3","7.2","2013","When Tony Stark's world is torn apart by a formidable terrorist called the Mandarin, he starts an odyssey of rebuilding and retribution."));
        movieList.add(new Movie("Thor: The Dark World","6.9","2013","When the Dark Elves attempt to plunge the universe into darkness, Thor must embark on a perilous and personal journey that will reunite him with doctor Jane Foster."));
        movieList.add(new Movie("Captain America: The Winter Soldier","7.8","2014","As Steve Rogers struggles to embrace his role in the modern world, he teams up with a fellow Avenger and S.H.I.E.L.D agent, Black Widow, to battle a new threat from history: an assassin known as the Winter Soldier."));
        movieList.add(new Movie("Avengers: Age of Ultron","7.3","2015","When Tony Stark and Bruce Banner try to jump-start a dormant peacekeeping program called Ultron, things go horribly wrong and it's up to Earth's mightiest heroes to stop the villainous Ultron from enacting his terrible plan."));
        movieList.add(new Movie("Ant-Man","7.3","2015","Armed with a super-suit with the astonishing ability to shrink in scale but increase in strength, cat burglar Scott Lang must embrace his inner hero and help his mentor, Dr. Hank Pym, plan and pull off a heist that will save the world."));
        movieList.add(new Movie("Captain America: Civil War","7.8","2016","Political involvement in the Avengers' affairs causes a rift between Captain America and Iron Man."));
        movieList.add(new Movie("Thor: Ragnarok","7.9","2017","Thor (Chris Hemsworth) is imprisoned on the planet Sakaar, and must race against time to return to Asgard and stop Ragnarök, the destruction of his world, at the hands of the powerful and ruthless villain Hela (Cate Blanchett)."));
        movieList.add(new Movie("Black Panther","7.3","2018","T'Challa, heir to the hidden but advanced kingdom of Wakanda, must step forward to lead his people into a new future and must confront a challenger from his country's past."));
        movieList.add(new Movie("Avengers: Infinity War","8.5","2018","The Avengers and their allies must be willing to sacrifice all in an attempt to defeat the powerful Thanos before his blitz of devastation and ruin puts an end to the universe."));
        movieList.add(new Movie("Ant-Man and the Wasp","7.1","2018","As Scott Lang balances being both a Super Hero and a father, Hope van Dyne and Dr. Hank Pym present an urgent new mission that finds the Ant-Man fighting alongside The Wasp to uncover secrets from their past."));
        movieList.add(new Movie("Avengers: Endgame","8.5","2019","After the devastating events of Avengers: Infinity War (2018), the universe is in ruins. With the help of remaining allies, the Avengers assemble once more in order to reverse Thanos' actions and restore balance to the universe."));
    }

    @Override
    public void onClick(View view) {

    }
}