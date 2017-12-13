package androidparavisionarios.com.kmuzik;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import adapters.ArtistTrackAdapter;
import models.Album;
import models.ArtistTrackList;
import models.Artista;
import models.Track;

public class TelaArtistaDetalhada extends AppCompatActivity {

    RecyclerView listaDeMusicas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listaDeMusicas = findViewById(R.id.listaDeMusicas);
        setTitle("Forca Suprema");
        Artista fs = new Artista(0, "Forca Suprema",
                "description", "Hiphop",
                R.drawable.header, true);
        Track urna = new Track();
        Album caveira = new Album(1, "Caveira", fs.getId(),
                "2017", "500,00 KZ");
        urna.setAlbum(caveira);
        urna.setArtist(fs);
        urna.setTrackCover(R.drawable.fs);
        urna.setId(0);
        urna.setaName("Urna");

        ArrayList<Track> tracks = new ArrayList<>();
        tracks.add(urna);
        ArtistTrackList fsTrackList = new ArtistTrackList(1, fs.getId(), tracks);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        listaDeMusicas.setLayoutManager(linearLayoutManager);
        ArtistTrackAdapter adapter = new ArtistTrackAdapter(this, fsTrackList);
        listaDeMusicas.setAdapter(adapter);

    }
}
