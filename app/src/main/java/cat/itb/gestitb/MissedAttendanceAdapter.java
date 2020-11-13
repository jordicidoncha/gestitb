package cat.itb.gestitb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

class MissedAttendanceViewHolder extends RecyclerView.ViewHolder {
    TextView studentName;

    public MissedAttendanceViewHolder(@NonNull View itemView) {
        super(itemView);

        studentName = itemView.findViewById(R.id.student_name_text);
    }

    public void bindData(MissedAttendance missedAttendance) {
        studentName.setText(missedAttendance.getNameStudent());
    }
}

public class MissedAttendanceAdapter extends RecyclerView.Adapter<MissedAttendanceViewHolder> {
    List<MissedAttendance> missedAttendances;

    public MissedAttendanceAdapter(List<MissedAttendance> missedAttendances) {
        this.missedAttendances = missedAttendances;
    }

    @NonNull
    @Override
    public MissedAttendanceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.missed_attendance_list_item, parent, false);

        return new MissedAttendanceViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MissedAttendanceViewHolder holder, int position) {
        holder.bindData(missedAttendances.get(position));
    }

    @Override
    public int getItemCount() {
        return missedAttendances.size();
    }
}

