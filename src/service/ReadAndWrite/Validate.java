package service.ReadAndWrite;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    public static final String NAME_REGEX = "^[A-Za-z]{2,9}$";
    public static final String ADDRESS_REGEX = "^[A-Za-z]{2,9}\\s{1}[A-Za-z]{2,9}$";
    public static final String GENDER_REGEX = "^(?:nam|nu)$";
    public static final String PHONE_REGEX = "^[0]{1}\\d{9}$";
    public static final String ID_DOCTOR_REGEX = "^[dr]{1}\\.\\d{3}$";
    public static final String ID_PREVENTIVE_REGEX = "^[pdr]{1}\\.\\d{3}$";
    public static final String ID_NURSE_REGEX = "^[n]{1}\\.\\d{3}$";
    public static final String ID_PATIENT_REGEX = "^[p]{1}\\.\\d{3}$";
    public static final String POSITION_REGEX = "^[hang1|hang2|hang3]$";
    public static final String LEVEL_REGEX = "^[1-9]{1}$";
    public static final String LEVEL_NURSE_REGEX = "^[1-12]{1}$";
    public static final String ID_ROOM_REGEX = "^[A-D]{1}[1-9]{3}$";

    private Matcher matcher;
    private static Pattern pattern;

    public Validate() {
    }

    public boolean validate(String regex) {
        Pattern patternName = pattern.compile(NAME_REGEX);
        Pattern patternAddress= pattern.compile(ADDRESS_REGEX);
        Pattern patternGender = pattern.compile(GENDER_REGEX);
        Pattern patternPhone = pattern.compile(PHONE_REGEX);
        Pattern patternDoctor = pattern.compile(ID_DOCTOR_REGEX);
        Pattern patternPreventiveDoctor = pattern.compile(ID_PREVENTIVE_REGEX);
        Pattern patternNurse = pattern.compile(ID_NURSE_REGEX);
        Pattern patternPatient = pattern.compile(ID_PATIENT_REGEX);
        Pattern patternPosition = pattern.compile(POSITION_REGEX);
        Pattern patternLevel = pattern.compile(LEVEL_REGEX);
        Pattern patternLevelNurse = pattern.compile(LEVEL_NURSE_REGEX);
        Pattern patternIdRoom = pattern.compile(ID_ROOM_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

}
