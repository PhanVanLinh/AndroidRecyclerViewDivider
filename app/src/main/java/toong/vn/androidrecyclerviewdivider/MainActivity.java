package toong.vn.androidrecyclerviewdivider;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import toong.vn.androidrecyclerviewdivider.adapter.OneItemTypeAdapter;
import toong.vn.androidrecyclerviewdivider.model.Item;

public class MainActivity extends AppCompatActivity
        implements OneItemTypeAdapter.ItemClickListener {
    private RecyclerView mRecyclerView;
    private OneItemTypeAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("One Item Type Recycler List");

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        ArrayList<Item> data = new ArrayList<>();
        data.add(new Item("a", "b"));
        data.add(new Item("c", "b"));
        data.add(new Item("d", "b"));
        data.add(new Item("e", "b"));

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new OneItemTypeAdapter(this, data.toArray(new Item[data.size()]));
        adapter.setItemClickListener(this);
        mRecyclerView.setAdapter(adapter);

        //        mRecyclerView.addItemDecoration(
        //                new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

        mRecyclerView.addItemDecoration(
                new DividerItemDecoration(this, LinearLayout.VERTICAL, false));
    }

    @Override
    public void onItemClick(View view, int position) {

    }
}
