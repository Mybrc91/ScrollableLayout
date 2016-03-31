package com.vhall.asymmetricgridview;

import android.os.Parcelable;
import android.widget.ListAdapter;

public interface AsymmetricGridViewAdapterContract extends ListAdapter {
    public void recalculateItemsPerRow();

    public void notifyDataSetChanged();

    public Parcelable saveState();

    public void restoreState(final Parcelable state);
}
