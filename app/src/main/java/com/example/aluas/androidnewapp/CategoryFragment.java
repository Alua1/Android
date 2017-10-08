package com.example.aluas.androidnewapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class CategoryFragment extends Fragment {
    private RecyclerView recyclerView;
    private CategoriesAdapter adapter;
    private List<Category> categoryList;

    public CategoryFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_category, container, false);
        // Inflate the layout for this fragment

        recyclerView = view.findViewById(R.id.recycler_view);

        categoryList = new ArrayList<>();
        adapter = new CategoriesAdapter(this.getContext(), categoryList);
        recyclerView.setLayoutManager(new GridLayoutManager(this.getContext(), 2));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

        prepareCategories();

        return view;
    }

    /**
     * Adding few categories for testing
     */
    private void prepareCategories() {
        int[] covers = new int[]{
                R.drawable.business,
                R.drawable.health,
                R.drawable.sport,
                R.drawable.store,
                R.drawable.travel,
                R.drawable.health,
                R.drawable.store,
                R.drawable.sport,
                R.drawable.travel,
                R.drawable.business,
                R.drawable.sport};

        Category a = new Category("News & Politics", 13, covers[0]);
        categoryList.add(a);

        a = new Category("Health", 8, covers[1]);
        categoryList.add(a);

        a = new Category("Sport", 11, covers[2]);
        categoryList.add(a);

        a = new Category("Store", 12, covers[3]);
        categoryList.add(a);

        a = new Category("Travel", 14, covers[4]);
        categoryList.add(a);

        a = new Category("doctor", 1, covers[5]);
        categoryList.add(a);

        a = new Category("Shop", 11, covers[6]);
        categoryList.add(a);

        a = new Category("Football", 14, covers[7]);
        categoryList.add(a);

        a = new Category("Airplanes", 11, covers[8]);
        categoryList.add(a);

        a = new Category("Meetings", 7, covers[9]);
        categoryList.add(a);

        adapter.notifyDataSetChanged();
    }
}
