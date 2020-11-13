package cat.itb.gestitb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment missedAttendanceList =  getSupportFragmentManager().findFragmentById(R.id.fragment_container);

        if (missedAttendanceList == null) {
            missedAttendanceList = new MissedAttendanceListFragment();
            getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, missedAttendanceList).commit();
        }

    }
}