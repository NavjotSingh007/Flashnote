package navjot.nikhil.flashnote;

public class Note {


    private int id;
    private String note_heading;
    private String note_description;

    public Note(int id, String note_heading, String note_description) {
        this.id = id;
        this.note_heading = note_heading;
        this.note_description = note_description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNote_heading() {
        return note_heading;
    }

    public void setNote_heading(String note_heading) {
        this.note_heading = note_heading;
    }

    public String getNote_description() {
        return note_description;
    }

    public void setNote_description(String note_description) {
        this.note_description = note_description;
    }
}

