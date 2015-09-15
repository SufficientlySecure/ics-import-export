// Generated by prefgen.py - Do not edit by hand!

package org.sufficientlysecure.ical;

import android.content.SharedPreferences;

public class Settings {
    public static final String PREF_DEBUG_LOGGING = "debug_logging";
    public static final String PREF_DEFAULT_REMINDERS = "default_reminders";
    public static final String PREF_DEVELOPER_MODE = "developer_mode";
    public static final String PREF_DUPLICATE_HANDLING = "duplicate_handling";
    public static final String PREF_GLOBAL_UIDS = "global_uids";
    public static final String PREF_ICAL4J_COMPATIBILITY_NOTES = "ical4j.compatibility.notes";
    public static final String PREF_ICAL4J_COMPATIBILITY_OUTLOOK = "ical4j.compatibility.outlook";
    public static final String PREF_ICAL4J_COMPATIBILITY_VCARD = "ical4j.compatibility.vcard";
    public static final String PREF_ICAL4J_PARSING_RELAXED = "ical4j.parsing.relaxed";
    public static final String PREF_ICAL4J_UNFOLDING_RELAXED = "ical4j.unfolding.relaxed";
    public static final String PREF_ICAL4J_VALIDATION_RELAXED = "ical4j.validation.relaxed";
    public static final String PREF_IMPORT_REMINDERS = "import_reminders";
    public static final String PREF_KEEP_UIDS = "keep_uids";
    public static final String PREF_LASTEXPORTFILE = "lastExportFile";
    public static final String PREF_LASTURL = "lastUrl";
    public static final String PREF_LASTURLPASSWORD = "lastUrlPassword";
    public static final String PREF_LASTURLUSERNAME = "lastUrlUsername";
    public static final String PREF_MICROSOFT_EXTENSIONS = "microsoft_extensions";
    public static final String PREF_NET_FORTUNA_ICAL4J_TIMEZONE_UPDATE_ENABLED = "net.fortuna.ical4j.timezone.update.enabled";
    public static final String PREF_SAVE_PASSWORDS = "save_passwords";
    public static final String PREF_TEST_FILE_SUPPORT = "test_file_support";
    public static final String PREF_UIDPID = "uidPid";
    public enum DuplicateHandlingEnum {
        DUP_REPLACE,
        DUP_REPLACE_ANY,
        DUP_IGNORE,
        DUP_DONT_CHECK,
    }
    private final SharedPreferences mPreferences;

    public Settings(SharedPreferences preferences) {
        mPreferences = preferences;
    }

    public SharedPreferences getPreferences() {
        return mPreferences;
    }

    public int getInt(final String key, final int def) {
        return mPreferences.getInt(key, def);
    }

    public int getInt(final String key) {
        return getInt(key, 0);
    }

    public void putInt(final String key, final int value) {
        mPreferences.edit().putInt(key, value).commit();
    }

    public boolean getBoolean(final String key, final boolean def) {
        return mPreferences.getBoolean(key, def);
    }

    public boolean getBoolean(final String key) {
        return getBoolean(key, false);
    }

    public void putBoolean(final String key, final boolean value) {
        mPreferences.edit().putBoolean(key, value).commit();
    }

    public String getString(final String key, final String def) {
        return mPreferences.getString(key, def);
    }

    public String getString(final String key) {
        return getString(key, "");
    }

    public void putString(final String key, final String value) {
        mPreferences.edit().putString(key, value).commit();
    }

    public int getEnumInt(final String key, final int def) {
        return Integer.parseInt(getString(key, String.valueOf(def)));
    }

    public void putEnumInt(final String key, final int value) {
        putString(key, String.valueOf(value));
    }

    public boolean getSavePasswords() {
        return getBoolean(PREF_SAVE_PASSWORDS, false);
    }

    public void setSavePasswords(boolean value) {
        putBoolean(PREF_SAVE_PASSWORDS, value);
    }

    public boolean getNetFortunaIcal4jTimezoneUpdateEnabled() {
        return getBoolean(PREF_NET_FORTUNA_ICAL4J_TIMEZONE_UPDATE_ENABLED, false);
    }

    public void setNetFortunaIcal4jTimezoneUpdateEnabled(boolean value) {
        putBoolean(PREF_NET_FORTUNA_ICAL4J_TIMEZONE_UPDATE_ENABLED, value);
    }

    public DuplicateHandlingEnum getDuplicateHandling() {
        return DuplicateHandlingEnum.values()[getEnumInt(PREF_DUPLICATE_HANDLING, 0)];
    }

    public void setDuplicateHandling(DuplicateHandlingEnum value) {
        putEnumInt(PREF_DUPLICATE_HANDLING, value.ordinal());
    }

    public boolean getKeepUids() {
        return getBoolean(PREF_KEEP_UIDS, true);
    }

    public void setKeepUids(boolean value) {
        putBoolean(PREF_KEEP_UIDS, value);
    }

    public boolean getGlobalUids() {
        return getBoolean(PREF_GLOBAL_UIDS, false);
    }

    public void setGlobalUids(boolean value) {
        putBoolean(PREF_GLOBAL_UIDS, value);
    }

    public boolean getImportReminders() {
        return getBoolean(PREF_IMPORT_REMINDERS, true);
    }

    public void setImportReminders(boolean value) {
        putBoolean(PREF_IMPORT_REMINDERS, value);
    }

    public boolean getIcal4jUnfoldingRelaxed() {
        return getBoolean(PREF_ICAL4J_UNFOLDING_RELAXED, true);
    }

    public void setIcal4jUnfoldingRelaxed(boolean value) {
        putBoolean(PREF_ICAL4J_UNFOLDING_RELAXED, value);
    }

    public boolean getIcal4jParsingRelaxed() {
        return getBoolean(PREF_ICAL4J_PARSING_RELAXED, true);
    }

    public void setIcal4jParsingRelaxed(boolean value) {
        putBoolean(PREF_ICAL4J_PARSING_RELAXED, value);
    }

    public boolean getIcal4jCompatibilityOutlook() {
        return getBoolean(PREF_ICAL4J_COMPATIBILITY_OUTLOOK, true);
    }

    public void setIcal4jCompatibilityOutlook(boolean value) {
        putBoolean(PREF_ICAL4J_COMPATIBILITY_OUTLOOK, value);
    }

    public boolean getIcal4jCompatibilityNotes() {
        return getBoolean(PREF_ICAL4J_COMPATIBILITY_NOTES, true);
    }

    public void setIcal4jCompatibilityNotes(boolean value) {
        putBoolean(PREF_ICAL4J_COMPATIBILITY_NOTES, value);
    }

    public boolean getIcal4jCompatibilityVcard() {
        return getBoolean(PREF_ICAL4J_COMPATIBILITY_VCARD, false);
    }

    public void setIcal4jCompatibilityVcard(boolean value) {
        putBoolean(PREF_ICAL4J_COMPATIBILITY_VCARD, value);
    }

    public boolean getIcal4jValidationRelaxed() {
        return getBoolean(PREF_ICAL4J_VALIDATION_RELAXED, true);
    }

    public void setIcal4jValidationRelaxed(boolean value) {
        putBoolean(PREF_ICAL4J_VALIDATION_RELAXED, value);
    }

    public boolean getMicrosoftExtensions() {
        return getBoolean(PREF_MICROSOFT_EXTENSIONS, true);
    }

    public void setMicrosoftExtensions(boolean value) {
        putBoolean(PREF_MICROSOFT_EXTENSIONS, value);
    }

    public boolean getDeveloperMode() {
        return getBoolean(PREF_DEVELOPER_MODE, false);
    }

    public void setDeveloperMode(boolean value) {
        putBoolean(PREF_DEVELOPER_MODE, value);
    }

    public boolean getDebugLogging() {
        return getBoolean(PREF_DEBUG_LOGGING, false);
    }

    public void setDebugLogging(boolean value) {
        putBoolean(PREF_DEBUG_LOGGING, value);
    }

    public boolean getTestFileSupport() {
        return getBoolean(PREF_TEST_FILE_SUPPORT, false);
    }

    public void setTestFileSupport(boolean value) {
        putBoolean(PREF_TEST_FILE_SUPPORT, value);
    }

}