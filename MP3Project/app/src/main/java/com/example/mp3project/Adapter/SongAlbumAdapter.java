package com.example.mp3project.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.mp3project.DataBinding.AppBinding;
import com.example.mp3project.R;
import com.example.mp3project.Song;

public class SongAlbumAdapter  {


    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tv_NameSong;
        private TextView tv_time;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_NameSong = itemView.findViewById(R.id.tv_name_song_DA);
            tv_time = itemView.findViewById(R.id.tv_time_DA);
        }

        public void binData(Song song){
            tv_NameSong.setText(song.getName());
            AppBinding.setDuration(tv_time, song.getDuration());
        }
    }
}
