package ru.ordinatus.reminder.adapter;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.Map;

import ru.ordinatus.reminder.R;
import ru.ordinatus.reminder.fragment.BirthdayFragment;
import ru.ordinatus.reminder.fragment.HistoryFragment;
import ru.ordinatus.reminder.fragment.IdeasFragment;
import ru.ordinatus.reminder.fragment.TodoFragment;

public class TabsPagerFragmentAdapter extends FragmentPagerAdapter{

    private Map<Integer, Fragment> tabs;
    private Context context;

    public TabsPagerFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
        tabs.put(0, HistoryFragment.getInstance(context));
        tabs.put(1, IdeasFragment.getInstance(context));
        tabs.put(2, TodoFragment.getInstance(context));
        tabs.put(3, BirthdayFragment.getInstance(context));
    }


    @Override
    public CharSequence getPageTitle(int position) {

        return tabs.get(position);
    }

    @Override
    public Fragment getItem(int position) {
        return tabs.get(position);
    }

    @Override
    public int getCount() {
        return tabs.length;
    }
}
