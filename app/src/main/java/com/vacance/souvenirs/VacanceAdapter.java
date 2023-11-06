package com.vacance.souvenirs;

import static android.content.Context.ALARM_SERVICE;
import static androidx.core.content.ContextCompat.getSystemService;
import static androidx.core.content.ContextCompat.startActivity;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.icu.util.Calendar;
import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;


public class VacanceAdapter extends RecyclerView.Adapter<VacanceAdapter.ViewHolder> {

    private final List<VacanceModel> eventList;
    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView title;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.tv_rv_title);

        }
    }

    public VacanceAdapter(List<VacanceModel> eventList) {
        this.eventList = eventList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View eventItem = inflater.inflate(R.layout.schedule_rv_item_row, parent, false);
        ViewHolder viewHolder = new ViewHolder(eventItem);
        return viewHolder;
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @SuppressLint({"RecyclerView", "ResourceAsColor"})
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        VacanceModel event = eventList.get(position);
        Context ctx = holder.title.getContext();
        TextView title = holder.title;
        title.setText(event.getmTitle());
        ArrayList<String> exemple = new ArrayList<>();
        exemple.add("Bjr");
        exemple.add("Bsr");

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                notifyItemChanged(position);
                Intent intent = new Intent(ctx, AffichageVacance.class);
                intent.putExtra("position",position);
                intent.putExtra("lieu",exemple);
                startActivity(ctx,intent,null);
            }
        });
    }

    @Override
    public int getItemCount() {
        return eventList.size();
    }
}

