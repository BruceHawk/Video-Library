package uk.ac.aston.oop.javafx.assessed.model;

/**
 * The Video class represents a video object. Information about the video is
 * stored and can be retrieved.
 */
public class Video extends Item {
	private final String director;

	/**
	 * Constructor for objects of class Video
	 */
	public Video(String theTitle, String theDirector, int time) {
		super(theTitle, time);
		director = theDirector;
	}

	/**
	 * Return the director for this video.
	 */
	public String getDirector() {
		return director;
	}

	@Override
	public String toString() {
		return "Director: " + director + "\n" + super.toString();
	}
}
