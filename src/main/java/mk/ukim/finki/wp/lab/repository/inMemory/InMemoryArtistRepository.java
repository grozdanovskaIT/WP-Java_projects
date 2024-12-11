package mk.ukim.finki.wp.lab.repository.inMemory;

import mk.ukim.finki.wp.lab.model.Artist;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class InMemoryArtistRepository {
    private List<Artist> artists;

    public InMemoryArtistRepository() {
        artists = new ArrayList<>();

        artists.add(new Artist("Adele", "Adkins", "Bio of Adele"));
        artists.add(new Artist("Taylor", "Swift", "Bio of Taylor Swift"));
        artists.add(new Artist("Elton", "John", "Bio of Elton John"));
        artists.add(new Artist( "Lady", "Gaga", "Bio of Lady Gaga"));
        artists.add(new Artist( "Rihanna", "Fenty", "Bio of Rihanna"));
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