package edu.utsa.cs3443.rowdyexperience.model;

import android.content.Context;
<<<<<<< HEAD
=======
import android.content.res.AssetManager;

import androidx.appcompat.app.AppCompatActivity;

>>>>>>> 15312c2d50d55c11f89d629af8546c5e93fa43f7
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;
<<<<<<< HEAD
/**
 * Represents a user in the Rowdy Experience application.
 * Each user has personal information like name, username, year, major, and password,
 * along with a collection of badges representing their achievements.
 */
=======

>>>>>>> 15312c2d50d55c11f89d629af8546c5e93fa43f7
public class User {
    private String firstName;
    private String lastName;
    private String userName;
    private int year;
    private String major;
    private String password;
    private ArrayList<Badges> badges;

<<<<<<< HEAD
    /**
     * Constructs a new User with the specified personal information.
     *
     * @param firstName the user's first name
     * @param lastName the user's last name
     * @param userName the unique username for the user
     * @param year the user's year in school (e.g., 1 for freshman, 2 for sophomore)
     * @param major the user's academic major
     * @param password the user's password (stored as plain text, consider hashing for security)
     */
=======

>>>>>>> 15312c2d50d55c11f89d629af8546c5e93fa43f7
    public User(String firstName, String lastName, String userName, int year, String major, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.year = year;
        this.major = major;
        this.password = password;
        this.badges = new ArrayList<>();
    }

<<<<<<< HEAD
    /**
     * Reads a user from a file at the specified filepath.
     * The first line of the file should contain user information in the format:
     *
     * <pre>
     * firstName,lastName,userName,year,major,password
     * </pre>
     *
     * Each subsequent line should contain badge information in the format:
     *
     * <pre>
     * badgeName,tier
     * </pre>
     *
     * @param context the application context (required for file access on Android)
     * @param filepath the path to the file containing the user data
     * @return a User object populated with the data from the file
     * @throws RuntimeException if an error occurs while reading the file
     */
=======

>>>>>>> 15312c2d50d55c11f89d629af8546c5e93fa43f7
    public static User readUser(Context context, String filepath) {
        User user;

        try {
            InputStream file = new FileInputStream(new File(filepath));
            Scanner scan = new Scanner(file);

<<<<<<< HEAD
            // Read the first line for basic user information
=======
>>>>>>> 15312c2d50d55c11f89d629af8546c5e93fa43f7
            String[] line = scan.nextLine().split(",");
            user = new User(
                    line[0],
                    line[1],
                    line[2],
                    Integer.parseInt(line[3].trim()),
                    line[4],
                    line[5]
            );

<<<<<<< HEAD
            // Read remaining lines for badge information
=======
>>>>>>> 15312c2d50d55c11f89d629af8546c5e93fa43f7
            while (scan.hasNextLine()) {
                String rawline = scan.nextLine();
                if (rawline.trim().isEmpty()) continue;

                line = rawline.split(",");
                if (line.length < 2) continue;

<<<<<<< HEAD
                Badges b = new Badges(line[0].trim(), Integer.parseInt(line[1].trim()));
                user.addBadge(b);
            }

            scan.close(); // Always close the scanner

=======
                Badges b = new Badges(line[0], Integer.parseInt(line[1].trim()));
                user.addBadge(b);
            }

>>>>>>> 15312c2d50d55c11f89d629af8546c5e93fa43f7
        } catch (IOException | NumberFormatException | ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException("Error reading user file at: " + filepath, e);
        }

        return user;
    }

<<<<<<< HEAD
    /**
     * Sets the user's first name.
     *
     * @param firstName the new first name
     */
=======








>>>>>>> 15312c2d50d55c11f89d629af8546c5e93fa43f7
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

<<<<<<< HEAD
    /**
     * Returns the user's first name.
     *
     * @return the first name
     */
=======
>>>>>>> 15312c2d50d55c11f89d629af8546c5e93fa43f7
    public String getFirstName() {
        return this.firstName;
    }

<<<<<<< HEAD
    /**
     * Sets the user's last name.
     *
     * @param lastName the new last name
     */
=======
>>>>>>> 15312c2d50d55c11f89d629af8546c5e93fa43f7
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

<<<<<<< HEAD
    /**
     * Returns the user's last name.
     *
     * @return the last name
     */
=======
>>>>>>> 15312c2d50d55c11f89d629af8546c5e93fa43f7
    public String getLastName() {
        return this.lastName;
    }

<<<<<<< HEAD
    /**
     * Sets the user's username.
     *
     * @param userName the new username
     */
=======
>>>>>>> 15312c2d50d55c11f89d629af8546c5e93fa43f7
    public void setUserName(String userName) {
        this.userName = userName;
    }

<<<<<<< HEAD
    /**
     * Returns the user's username.
     *
     * @return the username
     */
=======
>>>>>>> 15312c2d50d55c11f89d629af8546c5e93fa43f7
    public String getUserName() {
        return this.userName;
    }

<<<<<<< HEAD
    /**
     * Sets the user's year in school.
     *
     * @param year the new year (e.g., 1 for freshman, 2 for sophomore)
     */
=======
>>>>>>> 15312c2d50d55c11f89d629af8546c5e93fa43f7
    public void setYear(int year) {
        this.year = year;
    }

<<<<<<< HEAD
    /**
     * Returns the user's year in school.
     *
     * @return the year
     */
=======
>>>>>>> 15312c2d50d55c11f89d629af8546c5e93fa43f7
    public int getYear() {
        return this.year;
    }

<<<<<<< HEAD
    /**
     * Sets the user's major.
     *
     * @param major the new major
     */
=======
>>>>>>> 15312c2d50d55c11f89d629af8546c5e93fa43f7
    public void setMajor(String major) {
        this.major = major;
    }

<<<<<<< HEAD
    /**
     * Returns the user's major.
     *
     * @return the major
     */
=======
>>>>>>> 15312c2d50d55c11f89d629af8546c5e93fa43f7
    public String getMajor() {
        return this.major;
    }

<<<<<<< HEAD
    /**
     * Sets the user's password.
     *
     * @param password the new password (stored as plain text, consider hashing for security)
     */
=======
>>>>>>> 15312c2d50d55c11f89d629af8546c5e93fa43f7
    public void setPassword(String password) {
        this.password = password;
    }

<<<<<<< HEAD
    /**
     * Returns the user's password.
     *
     * @return the password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * Adds a badge to the user's collection.
     *
     * @param b the badge to add
     */
    public void addBadge(Badges b) {
        badges.add(b);
    }

    /**
     * Returns the list of badges earned by the user.
     *
     * @return an ArrayList of Badges
     */
    public ArrayList<Badges> getBadges() {
        return badges;
    }

    /**
     * Retrieves a badge by its name from the user's collection.
     *
     * @param name the name of the badge to find
     * @return the matching Badges object, or null if no match is found
     */
=======
    public String getPassword() {
        return this.password;
    }
    public void addBadge(Badges b){
        badges.add(b);

    }
    public ArrayList<Badges> getBadges(){
        return badges;
    }
>>>>>>> 15312c2d50d55c11f89d629af8546c5e93fa43f7
    public Badges getBadgeFromName(String name) {
        for (Badges b : badges) {
            if (b.getName().equalsIgnoreCase(name)) {
                return b;
            }
        }
        return null;
    }
<<<<<<< HEAD
}
=======


}

>>>>>>> 15312c2d50d55c11f89d629af8546c5e93fa43f7
