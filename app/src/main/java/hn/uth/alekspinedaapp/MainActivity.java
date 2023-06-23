package hn.uth.alekspinedaapp;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.LinearLayoutManager;

import java.util.ArrayList;
import java.util.List;

import hn.uth.alekspinedaapp.adapter.MedicamentosAdapter;
import hn.uth.alekspinedaapp.databinding.ActivityMainBinding;
import hn.uth.alekspinedaapp.entity.Medicamento;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private MedicamentosAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        List<Medicamento> listadoMedicamentos = new ArrayList<>();
        listadoMedicamentos.add(new Medicamento("Aspirina", "20 lps", "Ácido acetilsalicílico"));
        listadoMedicamentos.add(new Medicamento("Espidifen", "50 lps", "Ibuprofeno"));
        listadoMedicamentos.add(new Medicamento("Apiretal", "30 lps", "Paracetamol"));
        listadoMedicamentos.add(new Medicamento("Metalgial", "25 lps", "Metamizol"));
        listadoMedicamentos.add(new Medicamento("Clamoxyl", "40 lps", "Amoxicilina"));
        listadoMedicamentos.add(new Medicamento("Dolotren", "45 lps", "Diclofenaco"));
        listadoMedicamentos.add(new Medicamento("Adofen", "15 lps", "Fluoxetina"));
        listadoMedicamentos.add(new Medicamento("Valium", "10 lps", "Diazepam"));
        listadoMedicamentos.add(new Medicamento("Nolotil", "40 lps", "Metamizol"));
        listadoMedicamentos.add(new Medicamento("Algidol", "50 lps", "Paracetamol"));
        listadoMedicamentos.add(new Medicamento("Ativan", "55 lps", "Lorazepam"));
        listadoMedicamentos.add(new Medicamento("Rivotril", "30 lps", "Clonazepam"));
        listadoMedicamentos.add(new Medicamento("Artrotec", "40 lps", "Diclofenaco"));
        listadoMedicamentos.add(new Medicamento("Luramon", "20 lps", "Fluoxetina"));
        listadoMedicamentos.add(new Medicamento("Adolonta", "30 lps", "Tramadol"));
        listadoMedicamentos.add(new Medicamento("Omeprazol ", "35 lps", "Omeprazol "));
        listadoMedicamentos.add(new Medicamento("Lorazepam ", "45 lps", "Lorazepam"));
        listadoMedicamentos.add(new Medicamento("Orfidal", "25 lps", "Lorazepam"));
        listadoMedicamentos.add(new Medicamento("Prednisona ", "20 lps", "Prednisona"));
        listadoMedicamentos.add(new Medicamento("Metformina ", "30 lps", "Metformina"));

        adapter = new MedicamentosAdapter(listadoMedicamentos);
        setupRecyclerView();
    }
    private void setupRecyclerView(){
        LinearLayoutManager linearLayout = new LinearLayoutManager(this.getApplicationContext());
        binding.contentMed.rvDatos.setLayoutManager(linearLayout);
        binding.contentMed.rvDatos.setAdapter(adapter);
    }
}