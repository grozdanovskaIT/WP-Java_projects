package mk.ukim.finki.wp.lab.repository.inMemory;

import mk.ukim.finki.wp.lab.model.Album;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class InMemoryAlbumRepository {
    private List<Album> albums;

    public InMemoryAlbumRepository() {
        albums = new ArrayList<>();


        albums.add(new Album("Abbey Road", "Electronic", "1969"));
        albums.add(new Album("Thriller", "Pop", "1982"));
        albums.add(new Album("Kind of Blue", "Jazz", "1959"));
        albums.add(new Album("The Wall", "Rock", "1979"));
        albums.add(new Album("Nevermind", "Rock", "1991"));
    }

    public List<Album> findAll(){
        return albums;
    }

    public Optional<Album> findById(Long id){
        return albums.stream()
                .filter(album -> album.getId().equals(id))
                .findFirst();
    }

}