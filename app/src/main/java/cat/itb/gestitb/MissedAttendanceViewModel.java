package cat.itb.gestitb;

import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class MissedAttendanceViewModel extends ViewModel {
    List<MissedAttendance> missedAttendances = new ArrayList<MissedAttendance>();

    public MissedAttendanceViewModel() {
        MissedAttendance missedAttendance = new MissedAttendance();
        missedAttendance.setNameStudent("Jordi Cidoncha");
        for (int i = 0; i < 100; i++) {
            missedAttendances.add(missedAttendance);
        }
    }
}
