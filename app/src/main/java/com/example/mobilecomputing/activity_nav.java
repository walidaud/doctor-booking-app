package com.example.mobilecomputing;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mobilecomputing.databinding.ActivityNavBinding;

import java.util.ArrayList;

public class activity_nav extends AppCompatActivity {


        private RecyclerView recyclerView;
        private Adapter adapter;
        private ArrayList<Clinic> ArrayList;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_nav);

            addData();

            recyclerView = findViewById(R.id.recycler_view);

            adapter = new Adapter(ArrayList);

            RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(activity_nav.this);

            recyclerView.setLayoutManager(layoutManager);

            recyclerView.setAdapter(adapter);
        }

        void addData() {
            ArrayList = new ArrayList<>();
            ArrayList.add(new Clinic("23JAM KLINIK MEDIVIRON KUALA LUMPUR TRADERS SQUARE", "8-G\n" +
                    "PLAZA KLTS, 99 JALAN GOMBAK", "0340317483"));
            ArrayList.add(new Clinic("ACTIV CARE CLINIC", "NO. 85, JALAN RAJA ABDULLAH\n" +
                    "KAMPUNG BARU", "00340317483"));
            ArrayList.add(new Clinic("AL-ISLAM SPECIALIST HOSPITAL", "NO. 21-G,JALAN CEMPAKA SD12/2,\n" +
                    "BANDAR SRI DAMANSARA", "0340317483"));
            ArrayList.add(new Clinic("AMAN PUTRI DISPENSARY", "G11 GROUND FLOOR PLATINUM SENTRAL\n" +
                    "JLN STESEN SENTRAL 2", "0340317483"));
            ArrayList.add(new Clinic("BERKAT AMPANG CLINIC", "NO. 85, JALAN RAJA ABDULLAH\n" +
                    "KAMPUNG BARU", "0340317483"));
            ArrayList.add(new Clinic("ASP MEDICAL CLINIC SDN BHD", "G11 GROUND FLOOR PLATINUM SENTRAL\n" +
                    "JLN STESEN SENTRAL 2", "0340317483"));
            ArrayList.add(new Clinic("BLANC MEDICAL CLINIC", "NO. 21-G,JALAN CEMPAKA SD12/2,\n" +
                    "BANDAR SRI DAMANSARA", "0340317483"));
            ArrayList.add(new Clinic("BERKAT AMPANG CLINIC", "NO. 85, JALAN RAJA ABDULLAH\n" +
                    "KAMPUNG BARU", "0340317483"));
            ArrayList.add(new Clinic("BERKAT AMPANG CLINIC", "NO. 27-G (TINGKAT BAWAH), JALAN 13/149L\n" +
                    "BANDAR BARU SERI PETALING", "0340317483"));
            ArrayList.add(new Clinic("ASP MEDICAL CLINIC SDN BHD", "NO. 21-G,JALAN CEMPAKA SD12/2,\n" +
                    "BANDAR SRI DAMANSARA", "0340317483"));
            ArrayList.add(new Clinic("BP DIAGNOSTIC CENTRE SDN. BHD.", "NO. 85, JALAN RAJA ABDULLAH\n" +
                    "KAMPUNG BARU", "0340317483"));
            ArrayList.add(new Clinic("ACTIV CARE CLINIC", "NO. 21-G,JALAN CEMPAKA SD12/2,\n" +
                    "BANDAR SRI DAMANSARA", "0340317483"));
            ArrayList.add(new Clinic("BLANC MEDICAL CLINIC", "NO. 27-G (TINGKAT BAWAH), JALAN 13/149L\n" +
                    "BANDAR BARU SERI PETALING", "0340317483"));
            ArrayList.add(new Clinic("AMAN PUTRI DISPENSARY", "NO. 85, JALAN RAJA ABDULLAH\n" +
                    "KAMPUNG BARU", "0340317483"));
            ArrayList.add(new Clinic("Aham Siswana01", "G11 GROUND FLOOR PLATINUM SENTRAL\n" +
                    "JLN STESEN SENTRAL 2", "0340317483"));
            ArrayList.add(new Clinic("ASP MEDICAL CLINIC SDN BHD", "NO. 27-G (TINGKAT BAWAH), JALAN 13/149L\n" +
                    "BANDAR BARU SERI PETALING", "0340317483"));
            ArrayList.add(new Clinic("BLANC MEDICAL CLINIC", "NO. 85, JALAN RAJA ABDULLAH\n" +
                    "KAMPUNG BARU", "0340317483"));
            ArrayList.add(new Clinic("ASP MEDICAL CLINIC SDN BHD", "NO. 27-G (TINGKAT BAWAH), JALAN 13/149L\n" +
                    "BANDAR BARU SERI PETALING", "0340317483"));
            ArrayList.add(new Clinic("AMAN PUTRI DISPENSARY", "NO. 21-G,JALAN CEMPAKA SD12/2,\n" +
                    "BANDAR SRI DAMANSARA", "0340317483"));
            ArrayList.add(new Clinic("ASP MEDICAL CLINIC SDN BHD", "NO. 85, JALAN RAJA ABDULLAH\n" +
                    "KAMPUNG BARU", "0340317483"));
            ArrayList.add(new Clinic("AMAN PUTRI DISPENSARY", "NO. 27-G (TINGKAT BAWAH), JALAN 13/149L\n" +
                    "BANDAR BARU SERI PETALING", "0340317483"));

        }

    public void GotToSignUp(View view) {
        Intent intent = new Intent(this, activity_sign_up.class);
        startActivity(intent);
    }
}




