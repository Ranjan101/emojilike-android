package ro.andreidobrescu.sample.recycler;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;
import ro.andreidobrescu.emojilike.ActivityWithEmoji;
import ro.andreidobrescu.sample.R;

/**
 * Created by using on 7/4/2016.
 */
public class RecyclerActivitySample extends ActivityWithEmoji
{
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_recycler);

        ButterKnife.bind(this);

        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(new RecyclerAdapterSample(this));
    }
}
