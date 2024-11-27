package mk.ukim.finki.wp.lab.repository;

import mk.ukim.finki.wp.lab.model.Artist;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ArtistRepository {
    private List<Artist> artists;
    private static long ID=0L;

    public ArtistRepository() {
        artists = new ArrayList<>();

        artists.add(new Artist( 1L,"Adele", "Adkins", "Bio of Adele"));
        artists.add(new Artist(2L, "Taylor", "Swift", "Bio of Taylor Swift"));
        artists.add(new Artist(3L, "Elton", "John", "Bio of Elton John"));
        artists.add(new Artist(4L, "Lady", "Gaga", "Bio of Lady Gaga"));
        artists.add(new Artist(5L, "Rihanna", "Fenty", "Bio of Rihanna"));
    }

    public List<Artist> findAll(){
        return artists;
    }
    public Optional<Artist> findById(Long id){
        return artists.stream()
                .filter(artist -> artist.getId()==id)
                .findFirst();
    }
}
