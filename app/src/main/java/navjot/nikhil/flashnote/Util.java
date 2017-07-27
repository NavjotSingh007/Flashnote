package navjot.nikhil.flashnote;

/**
 * Created by hp on 7/27/2017.
 */

public class Util {

    // Symbolic Constants

    public static final int DB_VERSION = 1;
    public static final String DB_NAME = "note_db.db";

    public static final String TAB_NAME = "Users";
    public static final String COL_ID = "_ID";
    public static final String COL_HEADING = "HEADING";
    public static final String COL_DESCRIPTION = "DESCRIPTION";

    public static final String CREATE_TAB_QUERY = "create table Users(" +
            "_ID integer primary key autoincrement," +
            "NAME text," +
            "PHONE text," +
            "EMAIL text," +
            "PASSWORD text," +
            "GENDER text," +
            "CITY text" +
            ")";

    public static final Uri USER_URI = Uri.parse("content://com.auribises.cpdemogwa.usercontentprovider/"+TAB_NAME);

    public static final String KEY_USER = "keyUser";
}
