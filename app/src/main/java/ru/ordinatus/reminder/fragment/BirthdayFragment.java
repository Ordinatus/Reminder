package ru.ordinatus.reminder.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ru.ordinatus.reminder.R;

public class BirthdayFragment extends Fragment {
    private static final int LAYOUT = R.layout.fragment_example;

    private Context context;
    private String title;
    private View view;

    public static BirthdayFragment getInstance(Context context) {
        Bundle args = new Bundle();
        BirthdayFragment fragment = new BirthdayFragment();
        fragment.setArguments(args);
        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.tab_item_birthdays));

        return (fragment);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);



        return view;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
