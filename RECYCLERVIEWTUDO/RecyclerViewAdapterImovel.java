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

public class RecyclerViewAdapterImovel extends RecyclerView.Adapter<RecyclerViewAdapterImovel.ViewHolder>
{

    //Context context;
    private Activity context;

    List<GetDataAdapter> getDataAdapter;
    ImageLoader imageLoader1;

    Object mContext;
    public RecyclerViewAdapterImovel(List<GetDataAdapter> getDataAdapter, Activity context){

        super();
        this.getDataAdapter = getDataAdapter;
        this.context = context;


    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_items_imovel, parent, false);

        ViewHolder viewHolder = new ViewHolder(v);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder Viewholder, final int position)
    {

        final GetDataAdapter getDataAdapter1 =  getDataAdapter.get(position);
        final String distancia ;

        Viewholder.id_prestImovel.setText(getDataAdapter1.getId_prestImovel());
        Viewholder.descricao_prestImovel.setText(getDataAdapter1.getDescricao_prestImovel());
        Viewholder.valor_prestImovel.setText(getDataAdapter1.getValor_prestImovel());
        Viewholder.conta_prestImovel.setText(getDataAdapter1.getConta_prestImovel());
        Viewholder.comofoipago_prestImovel.setText(getDataAdapter1.getComofoipago_prestImovel());
        Viewholder.data_prestImovel.setText(getDataAdapter1.getData_prestImovel());

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

        public TextView id_prestImovel, descricao_prestImovel,valor_prestImovel,conta_prestImovel,comofoipago_prestImovel,data_prestImovel;

        public ProgressBar bar;
        CardView cad;
        RelativeLayout cdll;

        public ViewHolder(View itemView)
        {

            super(itemView);

            id_prestImovel= (TextView) itemView.findViewById(R.id.id_imovel);
            descricao_prestImovel = (TextView) itemView.findViewById(R.id.textView_item_imovel);
            valor_prestImovel= (TextView) itemView.findViewById(R.id.txtconta_imovel);
            conta_prestImovel = (TextView)itemView.findViewById(R.id.txtvalor_imovel);
            comofoipago_prestImovel = (TextView) itemView.findViewById(R.id.txtData_imovel) ;
            data_prestImovel= (TextView) itemView.findViewById(R.id.txtcomofoipago_imovel) ;

            bar=(ProgressBar)itemView.findViewById(R.id.progressBar);
            cad = (CardView)itemView.findViewById(R.id.cardview1);
            cdll= (RelativeLayout) itemView.findViewById(R.id.cdll2);


        }



    }


}