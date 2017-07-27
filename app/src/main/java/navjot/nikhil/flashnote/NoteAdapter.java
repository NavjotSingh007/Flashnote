package navjot.nikhil.flashnote;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by hp on 7/27/2017.
 */

public class NoteAdapter {

    Context context;
    int resource;
    ArrayList<Note> noteList,tempList;

    public NoteAdapter(Context context, int resource, ArrayList<Note> objects) {
        super(context, resource, objects);

        this.context = context;
        this.resource = resource;
        noteList = objects;


        tempList = new ArrayList<>();
        tempList.addAll(noteList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = null;

        view = LayoutInflater.from(context).inflate(resource,parent,false);

        TextView txtHeading = (TextView)view.findViewById(R.id.textViewHeading);
        TextView txtDescription = (TextView)view.findViewById(R.id.textViewDescription);

        Note note = noteList.get(position);
        txtHeading.setText(note.getId()+" - "+note.getNote_heading());
        txtDescription.setText(note.getNote_description());

        return view;
    }

    public void filter(String str){

        noteList.clear();

        if(str.length()==0){
            noteList.addAll(tempList);
        }else{
            for(int i=0;i<tempList.size();i++){
                if(tempList.get(i).getNote_heading().toLowerCase().contains(str.toLowerCase())){
                    noteList.add(tempList.get(i));
                }
            }
        }


//        notifyDataSetChanged();
    }
}
