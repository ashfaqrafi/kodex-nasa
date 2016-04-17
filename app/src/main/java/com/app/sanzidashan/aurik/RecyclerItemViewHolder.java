package com.app.sanzidashan.aurik;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class RecyclerItemViewHolder extends RecyclerView.ViewHolder {

    private final TextView listPostAddressTextview;
    private final TextView listLikesCount;

    public RecyclerItemViewHolder(final View parent, TextView postAddress, TextView likesCount) {
        super(parent);
        listPostAddressTextview = postAddress;
        listLikesCount = likesCount;
    }

    public static RecyclerItemViewHolder newInstance(View parent) {
        TextView listPostAddress = (TextView) parent.findViewById(R.id.listPostAddress);
        TextView listLikesCount = (TextView) parent.findViewById(R.id.listPostLikesCount);
        return new RecyclerItemViewHolder(parent, listPostAddress, listLikesCount);
    }

    public void setItemText(CharSequence address, int likesCout) {
        listPostAddressTextview.setText(address);
        listLikesCount.setText(Integer.toString(likesCout));
    }



}
