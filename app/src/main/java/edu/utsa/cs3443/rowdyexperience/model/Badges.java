package edu.utsa.cs3443.rowdyexperience.model;

<<<<<<< HEAD
/**
 * Represents a badge in the Rowdy Experience application.
 * Each badge has a name and a tier indicating its level.
 */

=======
>>>>>>> 15312c2d50d55c11f89d629af8546c5e93fa43f7
public class Badges {
    private String name;
    private int tier;

<<<<<<< HEAD
    /**
     * Constructs a new Badge with the specified name and tier.
     *
     * @param name the name of the badge
     * @param tier the tier level of the badge
     */
=======
>>>>>>> 15312c2d50d55c11f89d629af8546c5e93fa43f7
    public Badges(String name, int tier) {
        this.name = name;
        this.tier = tier;
    }

<<<<<<< HEAD
    /**
     * Sets the name of the badge.
     *
     * @param name the new name of the badge
     */
=======
>>>>>>> 15312c2d50d55c11f89d629af8546c5e93fa43f7
    public void setName(String name) {
        this.name = name;
    }

<<<<<<< HEAD
    /**
     * Returns the name of the badge.
     *
     * @return the name of the badge
     */
=======
>>>>>>> 15312c2d50d55c11f89d629af8546c5e93fa43f7
    public String getName() {
        return this.name;
    }

<<<<<<< HEAD
    /**
     * Sets the tier level of the badge.
     *
     * @param tier the new tier level of the badge
     */
=======
>>>>>>> 15312c2d50d55c11f89d629af8546c5e93fa43f7
    public void setTier(int tier) {
        this.tier = tier;
    }

<<<<<<< HEAD
    /**
     * Returns the tier level of the badge.
     *
     * @return the tier level of the badge
     */
=======
>>>>>>> 15312c2d50d55c11f89d629af8546c5e93fa43f7
    public int getTier() {
        return this.tier;
    }
}
