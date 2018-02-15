package com.f22labs.instalikefragmenttransaction.adapters;

import android.app.Activity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.android.volley.toolbox.ImageLoader;
import com.f22labs.instalikefragmenttransaction.R;

import java.util.List;

public class RecyclerViewAdapterTransferencia extends RecyclerView.Adapter<RecyclerViewAdapterTransferencia.ViewHolder>
{

    //Context context;
    private Activity context;

    List<GetDataAdapter> getDataAdapter;
    ImageLoader imageLoader1;

    Object mContext;
    public RecyclerViewAdapterTransferencia(List<GetDataAdapter> getDataAdapter, Activity context){

        super();
        this.getDataAdapter = getDataAdapter;
        this.context = context;


    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_items_transferencia, parent, false);

        ViewHolder viewHolder = new ViewHolder(v);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder Viewholder, final int position)
    {

        final GetDataAdapter getDataAdapter1 =  getDataAdapter.get(position);
        final String distancia ;
        Viewholder.id_transferencia.setText(getDataAdapter1.getId_transferencia());
        Viewholder.descricao_transferencia.setText(getDataAdapter1.getDescricao_transferencia());
        Viewholder.valor_transferencia.setText(getDataAdapter1.getValor_transferencia());
        Viewholder.praondefoi_transferencia.setText(getDataAdapter1.getPraondefoi_transferencia());
        Viewholder.contaondeveio_transferencia.setText(getDataAdapter1.getContaondeveio_transferencia());
        Viewholder.data_transferencia.setText(getDataAdapter1.getData_transferencia());

        Viewholder.itemView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                //Static.setIdevento(Integer.parseInt(String.valueOf(Viewholder.idEvento.getText())));

                //evento frag = new evento();

                //MainActivity mainActivity = (MainActivity) context;

                //mainActivity.switchContent(frag);
            }
        });


    }

    @Override
    public int getItemCount() {

        return getDataAdapter.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder
    {

        public TextView id_transferencia, descricao_transferencia,valor_transferencia,praondefoi_transferencia,contaondeveio_transferencia,data_transferencia;

        public ProgressBar bar;
        CardView cad;
        RelativeLayout cdll;



        public ViewHolder(View itemView)
        {

            super(itemView);
            id_transferencia= (TextView) itemView.findViewById(R.id.id_transferencia);
            descricao_transferencia = (TextView) itemView.findViewById(R.id.textView_item_transferencia);
            valor_transferencia= (TextView) itemView.findViewById(R.id.txtconta_transferencia);
            praondefoi_transferencia = (TextView)itemView.findViewById(R.id.txtvalor_transferencia);
            contaondeveio_transferencia = (TextView) itemView.findViewById(R.id.txtData_transferencia) ;
            data_transferencia= (TextView) itemView.findViewById(R.id.txtcomofoipago_transferencia) ;

            bar=(ProgressBar)itemView.findViewById(R.id.progressBar);
            cad = (CardView)itemView.findViewById(R.id.cardview1);
            cdll= (RelativeLayout) itemView.findViewById(R.id.cdll2);


        }



    }


}