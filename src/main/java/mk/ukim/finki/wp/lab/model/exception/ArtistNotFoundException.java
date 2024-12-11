package mk.ukim.finki.wp.lab.model.exception;

public class ArtistNotFoundException extends RuntimeException{
    public ArtistNotFoundException(Long id) {
        super(String.format("Artist with id: %dwas not found", id));
    }
}