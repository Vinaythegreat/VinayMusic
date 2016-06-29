package com.example.android.vinaymusic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Find the View that shows the now playing
        TextView nowPlaying = (TextView) findViewById(R.id.nowPlaying);

        // Set a click listener on that View
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Now Playing text is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NowPlayingActivity}
                Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);

                // Start the new activity
                startActivity(nowPlayingIntent);
            }
        });

        // Find the View that shows the Favourites
        TextView favourites = (TextView) findViewById(R.id.favourites);

        // Set a click listener on that View
        favourites.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Now Playing text is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FavouritesActivity}
                Intent favouritesIntent = new Intent(MainActivity.this, FavouritesActivity.class);

                // Start the new activity
                startActivity(favouritesIntent);
            }
        });

        // Find the View that shows the playlisy
        TextView playlist = (TextView) findViewById(R.id.playlist);

        // Set a click listener on that View
        playlist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Now Playing text is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PlaylistActivity}
                Intent playlistIntent = new Intent(MainActivity.this, PlaylistActivity.class);

                // Start the new activity
                startActivity(playlistIntent);
            }
        });

        // Find the View that shows the AllSongs
        TextView allSongs = (TextView) findViewById(R.id.allSongs);

        // Set a click listener on that View
        playlist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Now Playing text is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link AllSongsActivity}
                Intent allSongsIntent = new Intent(MainActivity.this, AllSongsActivity.class);

                // Start the new activity
                startActivity(allSongsIntent);
            }
        });

        // Find the View that shows the Artist
        TextView artist = (TextView) findViewById(R.id.artist);

        // Set a click listener on that View
        playlist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Now Playing text is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ArtistActivity}
                Intent artistIntent = new Intent(MainActivity.this, ArtistActivity.class);

                // Start the new activity
                startActivity(artistIntent);
            }
        });

        // Find the View that shows the Buy Now
        TextView buyMusic = (TextView) findViewById(R.id.buyMusic);

        // Set a click listener on that View
        playlist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Now Playing text is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link BuyNowActivity}
                Intent buyMusicIntent = new Intent(MainActivity.this, BuyNowActivity.class);

                // Start the new activity
                startActivity(buyMusicIntent);
            }
        });

    }
}
