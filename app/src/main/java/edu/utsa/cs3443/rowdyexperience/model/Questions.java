<<<<<<< HEAD

package edu.utsa.cs3443.rowdyexperience.model;

/**
 * Represents a question in the Rowdy Experience application.
 * Each question has a text description and a boolean check status indicating whether it has been completed.
 */
=======
package edu.utsa.cs3443.rowdyexperience.model;

>>>>>>> 15312c2d50d55c11f89d629af8546c5e93fa43f7
public class Questions {
    private String question;
    private boolean check;

<<<<<<< HEAD
    /**
     * Constructs a new question with the specified text and check status.
     *
     * @param question the text of the question
     * @param check the initial check status of the question (true if checked, false otherwise)
     */
=======
>>>>>>> 15312c2d50d55c11f89d629af8546c5e93fa43f7
    public Questions(String question, boolean check) {
        this.question = question;
        this.check = check;
    }

<<<<<<< HEAD
    /**
     * Sets the text of the question.
     *
     * @param question the new text for the question
     */
=======
>>>>>>> 15312c2d50d55c11f89d629af8546c5e93fa43f7
    public void setQuestion(String question) {
        this.question = question;
    }

<<<<<<< HEAD
    /**
     * Returns the text of the question.
     *
     * @return the question text
     */
=======
>>>>>>> 15312c2d50d55c11f89d629af8546c5e93fa43f7
    public String getQuestion() {
        return this.question;
    }

<<<<<<< HEAD
    /**
     * Sets the check status of the question.
     *
     * @param check the new check status (true if checked, false otherwise)
     */
=======
>>>>>>> 15312c2d50d55c11f89d629af8546c5e93fa43f7
    public void setCheck(boolean check) {
        this.check = check;
    }

<<<<<<< HEAD
    /**
     * Returns the check status of the question.
     *
     * @return true if the question is checked, false otherwise
     */
=======
>>>>>>> 15312c2d50d55c11f89d629af8546c5e93fa43f7
    public boolean getCheck() {
        return this.check;
    }
}
