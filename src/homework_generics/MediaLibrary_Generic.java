package homework_generics;

import java.util.ArrayList;
import java.util.List;

public class MediaLibrary_Generic<T> {
    private List<T> mediaItems = new ArrayList<>();

    public static class Book { public String title = "Book"; }
    public static class Video { public String title = "Video"; }
    public static class Newspaper { public String title = "Newspaper"; }

    public void addMediaItem(T item) {
        mediaItems.add(item);
    }

    public T getMediaItems(int index) {
        if (index >= 0 && index < mediaItems.size() ) {
            return mediaItems.get(index);
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println("Generic Library");

        MediaLibrary_Generic<Book> bookLib = new MediaLibrary_Generic<>();
        bookLib.addMediaItem(new Book());

        MediaLibrary_Generic<Video> videoLib = new MediaLibrary_Generic<>();
        videoLib.addMediaItem(new Video());

        MediaLibrary_Generic<Newspaper> newspaperLio = new MediaLibrary_Generic<>();
        newspaperLio.addMediaItem(new Newspaper());

        Book retrievedBook = bookLib.getMediaItems(0);
        System.out.println("Retrieved Book: " + retrievedBook.title);

        Video retrievedVideo = videoLib.getMediaItems(0);
        System.out.println("Retrieved Video: " + retrievedVideo.title);

        Newspaper retrievedNewspaper = newspaperLio.getMediaItems(0);
        System.out.println("Retrieved Newspaper: " + retrievedNewspaper.title);
    }
}
