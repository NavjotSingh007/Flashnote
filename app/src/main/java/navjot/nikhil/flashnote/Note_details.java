package navjot.nikhil.flashnote;

import android.content.ContentValues;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Note_details extends AppCompatActivity {

    EditText etxtheading;
    EditText etxtdescription ;
    Button btnSubmit ;
    Note note;

    void initviews()
    {
        etxtdescription = (EditText)findViewById(R.id.editTextDesrcription);
        etxtheading = (EditText)findViewById(R.id.editTextHeading);
        btnSubmit = (Button)findViewById(R.id.button);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_details);
        initviews();
        note = new Note();

    }

    public void buttonOnClick(View v)
    {
        note.setNote_heading(etxtheading.getText().toString().trim());
        note.setNote_description(etxtdescription.getText().toString().trim());

        insertUser();
    }

    void insertUser()
    {
        ContentValues values = new ContentValues();
        values.put(Util.COL_NAME,user.getName());
        values.put(Util.COL_EMAIL,user.getEmail());
        values.put(Util.COL_PASSWORD,user.getPassword());
        values.put(Util.COL_GENDER,user.getGender());
        values.put(Util.COL_CITY,user.getCity());

        if(!updateMode) {
            Uri uri = resolver.insert(Util.USER_URI, values);
            Toast.makeText(this, user.getName() + " registered successfully with id " + uri.getLastPathSegment(), Toast.LENGTH_LONG).show();
            clearFields();
        }else{
            String where = Util.COL_ID+" = "+rcvUser.getId();
            int i = resolver.update(Util.USER_URI,values,where,null);
            if(i>0){
                Toast.makeText(this,rcvUser.getName()+ " updated...",Toast.LENGTH_LONG).show();
                finish();
            }
        }
    }
}
