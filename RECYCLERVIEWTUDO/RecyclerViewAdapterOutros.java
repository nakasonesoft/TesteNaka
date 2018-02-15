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

public class RecyclerViewAdapterOutros extends RecyclerView.Adapter<RecyclerViewAdapterOutros.ViewHolder>
{

    //Context context;
    private Activity context;

    List<GetDataAdapter> getDataAdapter;
    ImageLoader imageLoader1;

    Object mContext;
    public RecyclerViewAdapterOutros(List<GetDataAdapter> getDataAdapter, Activity context){

        super();
        this.getDataAdapter = getDataAdapter;
        this.context = context;


    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_items_outros, parent, false);

        ViewHolder viewHolder = new ViewHolder(v);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder Viewholder, final int position)
    {

        final GetDataAdapter getDataAdapter1 =  getDataAdapter.get(position);
        final String distancia ;

        Viewholder.id_outros.setText(getDataAdapter1.getId_despesas());
        Viewholder.descricao_outros.setText(getDataAdapter1.getDescricao_despesas());
        Viewholder.id_grupo.setText(getDataAdapter1.getConta_despesas());
        Viewholder.id_grupo2.setText(getDataAdapter1.getValor_despesas());
        Viewholder.valor_outros.setText(getDataAdapter1.getData_despesas());
        Viewholder.data_outros.setText(getDataAdapter1.getComofoipago_despesas());

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

        public TextView id_outros, descricao_outros,id_grupo,id_grupo2,valor_outros,data_outros;

        public ProgressBar bar;
        CardView cad;
        RelativeLayout cdll;

        public ViewHolder(View itemView)
        {

            super(itemView);

            id_outros= (TextView) itemView.findViewById(R.id.id_outros);
            descricao_outros = (TextView) itemView.findViewById(R.id.textView_item_outros);
            id_grupo= (TextView) itemView.findViewById(R.id.txtconta_outros);
            id_grupo2 = (TextView)itemView.findViewById(R.id.txtvalor_outros);
            valor_outros = (TextView) itemView.findViewById(R.id.txtData_outros) ;
            data_outros= (TextView) itemView.findViewById(R.id.txtcomofoipago_outros) ;

            bar=(ProgressBar)itemView.findViewById(R.id.progressBar);
            cad = (CardView)itemView.findViewById(R.id.cardview1);
            cdll= (RelativeLayout) itemView.findViewById(R.id.cdll2);


        }



    }


}