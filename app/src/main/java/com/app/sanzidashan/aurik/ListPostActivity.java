package com.app.sanzidashan.aurik;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ListPostActivity extends AppCompatActivity {


    List<Post> sampleList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_post_activity);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Click action
                Intent intent = new Intent(ListPostActivity.this, CreatePostActivity.class);
                startActivity(intent);
            }
        });


        sampleList.add(new Post("Post 1 Address", 52));
        sampleList.add(new Post("Post 2 Address", 42));
        sampleList.add(new Post("Post 3 Address", 33));
        sampleList.add(new Post("Post 4 Address", 22));


        initRecyclerView();

    }


    private void initRecyclerView() {
        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(sampleList);
        recyclerView.setAdapter(recyclerAdapter);




        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(this, new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        int likesCount = sampleList.get(position).getLikeCount();
                        likesCount++;
                        TextView likesCouterView = (TextView) view.findViewById(R.id.listPostLikesCount);
                        likesCouterView.setText(Integer.toString(likesCount));
                        sampleList.get(position).setLikeCount(likesCount);

                        /*Intent intent = new Intent(getApplicationContext(), ShowPostActivity.class);
                        intent.putExtra("postID", position + 1);
                        CardView cardView = (CardView)view;
                        TextView textView = (TextView)((LinearLayout) cardView.getChildAt(0)).getChildAt(1);
                        intent.putExtra("postTitle", textView.getText());
                        startActivity(intent);*/
                    }
                })
        );


    }
}