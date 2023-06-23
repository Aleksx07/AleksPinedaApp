package hn.uth.alekspinedaapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import hn.uth.alekspinedaapp.databinding.ItemMedicamentoBinding;
import hn.uth.alekspinedaapp.entity.Medicamento;

public class MedicamentosAdapter extends RecyclerView.Adapter<MedicamentosAdapter.viewHolder> {

    private List<Medicamento> dataset;

    public MedicamentosAdapter(List<Medicamento> dataset) {
        this.dataset = dataset;
    }

    @NonNull
    @Override
    public MedicamentosAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       ItemMedicamentoBinding binding = ItemMedicamentoBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new viewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull MedicamentosAdapter.viewHolder holder, int position) {
        Medicamento medactual = dataset.get(position);
        holder.binding.txtNombre.setText(medactual.getNombre());
        holder.binding.txtCosto.setText(medactual.getCosto());
        holder.binding.txtComponente.setText(medactual.getComponente());

    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ItemMedicamentoBinding binding;
        public viewHolder(ItemMedicamentoBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
