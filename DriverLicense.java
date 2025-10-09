package two;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * This class represents a Driver's License, which is a type of ID Card.
 * It includes information such as the expiration year of the license.
 * @author Adil Osman.
 */
public class DriverLicense extends IDCard {
    private int expirationYear;

    /**
     * Constructs a new DriverLicense with the specified expiration year, name,
     * and ID number.
     * @param expirationYear is when the driver's license expires.
     * @param name the name of the license holder.
     * @param idNumber is the ID number of the license.
     * @author Adil Osman.
     */
    public DriverLicense(int expirationYear, String name, int idNumber) {
        super(idNumber, name);
        this.expirationYear = expirationYear;
    }

    /**
     * Formats the correct information to the driver's license as a String.
     * @return a formatted string including the license holder's name, ID number,
     * and expiration year.
     * @author Adil Osman.
     */
    @Override
    public String format() {
        return super.format() + " Expiration Date: " + expirationYear;
    }

    /**
     * Checks whether the driver's license is expired.
     * This method uses the GregorianCalendar class from the java.util package to
     * get the current year. Also, the GregorianCalendar is based on the standard
     * calendar used worldwide.
     * This method checks if the driver's license is expired.
     *
     * @return true if the license is expired, false if the expiration date is valid.
     * @author Adil Osman.
     */
    @Override
    public boolean isExpired() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        int year = gregorianCalendar.get(Calendar.YEAR);
        if (this.expirationYear < year) {
            return false;
        }
        else {
            return true;
        }
    }
}