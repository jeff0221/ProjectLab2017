package Models.AbstractModels;

/**
 * Created by Jeffrey on 24-03-2017.
 */
public abstract class Tag
{
    /*
    *TagName to make sure we have the tag information and a coherenceRating that goes from 0.0 - 1.0 that shows the integrity of the data
    *It shows how accurate the tag is for the thing it is attached to.
    **/
    String tagName;
    int coherenceRating;
}
