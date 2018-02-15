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

public class RecyclerViewAdapterConsorcio extends RecyclerView.Adapter<RecyclerViewAdapterConsorcio.ViewHolder>
{

    //Context context;
    private Activity context;

    List<GetDataAdapter> getDataAdapter;
    ImageLoader imageLoader1;

    Object mContext;
    public RecyclerViewAdapterConsorcio(List<GetDataAdapter> getDataAdapter, Activity context){

        super();
        this.getDataAdapter = getDataAdapter;
        this.context = context;


    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_items_consorcio, parent, false);

        ViewHolder viewHolder = new ViewHolder(v);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder Viewholder, final int position)
    {
        final GetDataAdapter getDataAdapter1 =  getDataAdapter.get(position);
        final String distancia ;

        Viewholder.id_consorcio.setText(getDataAdapter1.getId_consorcio());
        Viewholder.descricao_consorcio.setText(getDataAdapter1.getDescricao_consorcio());
        Viewholder.valor_consorcio.setText(getDataAdapter1.getValor_consorcio());
        Viewholder.conta_consorcio.setText(getDataAdapter1.getConta_consorcio());
        Viewholder.comofoipago_consorcio.setText(getDataAdapter1.getComofoipago_consorcio());
        Viewholder.data_consorcio.setText(getDataAdapter1.getData_consorcio());

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

        public TextView id_consorcio, descricao_consorcio,valor_consorcio,conta_consorcio,comofoipago_consorcio,data_consorcio;

        public ProgressBar bar;
        CardView cad;
        RelativeLayout cdll;

        public ViewHolder(View itemView)
        {

            super(itemView);

            id_consorcio= (TextView) itemView.findViewById(R.id.id_consorcio);
            descricao_consorcio = (TextView) itemView.findViewById(R.id.textView_item_consorcio);
            valor_consorcio= (TextView) itemView.findViewById(R.id.txtconta_consorcio);
            conta_consorcio = (TextView)itemView.findViewById(R.id.txtvalor_consorcio);
            data_consorcio = (TextView) itemView.findViewById(R.id.txtData_consorcio);
            comofoipago_consorcio= (TextView) itemView.findViewById(R.id.txtcomofoipago_consorcio);

            bar=(ProgressBar)itemView.findViewById(R.id.progressBar);
            cad = (CardView)itemView.findViewById(R.id.cardview1);
            cdll= (RelativeLayout) itemView.findViewById(R.id.cdll2);


        }



    }


}