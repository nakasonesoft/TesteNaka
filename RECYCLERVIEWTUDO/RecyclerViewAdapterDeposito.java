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

public class RecyclerViewAdapterDeposito extends RecyclerView.Adapter<RecyclerViewAdapterDeposito.ViewHolder>
{

    //Context context;
    private Activity context;

    List<GetDataAdapter> getDataAdapter;
    ImageLoader imageLoader1;

    Object mContext;
    public RecyclerViewAdapterDeposito(List<GetDataAdapter> getDataAdapter, Activity context){

        super();
        this.getDataAdapter = getDataAdapter;
        this.context = context;


    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_items_deposito, parent, false);

        ViewHolder viewHolder = new ViewHolder(v);

        return viewHolder;
    }
    @Override
    public void onBindViewHolder(final ViewHolder Viewholder, final int position)
    {
        final GetDataAdapter getDataAdapter1 =  getDataAdapter.get(position);
        final String distancia ;
        Viewholder.id_deposito.setText(getDataAdapter1.getId_deposito());
        Viewholder.descricao_deposito.setText(getDataAdapter1.getDescricao_deposito());
        Viewholder.valor_deposito.setText(getDataAdapter1.getValor_deposito());
        Viewholder.praondefoi_deposito.setText(getDataAdapter1.getPraondefoi_deposito());
        Viewholder.contaondeveio_deposito.setText(getDataAdapter1.getContaondeveio_deposito());
        Viewholder.data_deposito.setText(getDataAdapter1.getData_deposito());

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
        public TextView id_deposito, descricao_deposito,valor_deposito,praondefoi_deposito,contaondeveio_deposito,data_deposito;

        public ProgressBar bar;
        CardView cad;
        RelativeLayout cdll;

        public ViewHolder(View itemView)
        {
            super(itemView);
            id_deposito= (TextView) itemView.findViewById(R.id.id_deposito);
            descricao_deposito = (TextView) itemView.findViewById(R.id.textView_item_deposito);
            valor_deposito= (TextView) itemView.findViewById(R.id.txtconta_deposito);
            praondefoi_deposito = (TextView)itemView.findViewById(R.id.txtvalor_deposito);
            contaondeveio_deposito = (TextView) itemView.findViewById(R.id.txtData_deposito) ;
            data_deposito= (TextView) itemView.findViewById(R.id.txtcomofoipago_deposito) ;

            bar=(ProgressBar)itemView.findViewById(R.id.progressBar);
            cad = (CardView)itemView.findViewById(R.id.cardview1);
            cdll= (RelativeLayout) itemView.findViewById(R.id.cdll2);


        }



    }


}