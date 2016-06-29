package android.mymddemo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kogitune.activity_transition.ActivityTransitionLauncher;

/**
 * Created by xiekun on 2016/1/21 0021.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private Context context;
    private RecyclerView recyclerView;

    public RecyclerViewAdapter(Context context, RecyclerView recyclerView) {
        this.context = context;
        this.recyclerView = recyclerView;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        final View view = holder.view;
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Snackbar.make(v, "Wow " + position + " !!", Snackbar.LENGTH_SHORT).show();
                Intent intent = new Intent(context, SubActivity.class);
                ActivityTransitionLauncher.with((Activity) context).from(v).launch(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return 100;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public final View view;

        public ViewHolder(View itemView) {
            super(itemView);
            this.view = itemView;
        }

    }

}
