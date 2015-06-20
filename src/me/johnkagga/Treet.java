package me.johnkagga;

import java.util.Date;

/**
 * Created by JohnKagga on 6/20/2015.
 */
public class Treet {
    private String mAuthor;
    private String mDescription;
    private Date mCreationDate;

    public Treet(String author, String description, Date creationDate) {
        mAuthor = author;
        mDescription = description;
        mCreationDate = creationDate;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public String getDescription() {
        return mDescription;
    }

    public Date getCreationDate() {
        return mCreationDate;
    }
}
