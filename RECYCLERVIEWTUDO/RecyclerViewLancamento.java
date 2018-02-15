
*ReclycerLancamento*
//transferencia
    String JSON_id_transferencia = "id_transferencia";
    String JSON_descricao_transferencia = "descricao_transferencia";
    String JSON_valor_transferencia = "valor_transferencia";
    String JSON_praondefoi_transferencia = "praondefoi_transferencia";
    String JSON_contaondeveio_transferencia = "contaondeveio_transferencia";
    String JSON_data_transferencia = "data_transferencia";

    //depósito
    String JSON_id_deposito = "id_deposito";
    String JSON_descricao_deposito = "descricao_deposito";
    String JSON_valor_deposito = "valor_deposito";
    String JSON_praondefoi_deposito = "praondefoi_deposito";
    String JSON_contaondeveio_deposito = "contaondeveio_deposito";
    String JSON_data_deposito = "data_deposito";

    //saque
    String JSON_id_saque = "id_saque";
    String JSON_descricao_saque = "descricao_saque";
    String JSON_valor_saque = "valor_saque";
    String JSON_praondefoi_saque = "praondefoi_saque";
    String JSON_contaondeveio_saque = "contaondeveio_saque";
    String JSON_data_saque = "data_saque";

    //imóvel
    String JSON_id_prestImovel = "id_prestImovel";
    String JSON_descricao_prestImovel = "descricao_prestImovel";
    String JSON_valor_prestImovel = "valor_prestImovel";
    String JSON_conta_prestImovel = "conta_prestImovel";
    String JSON_comofoipago_prestImovel = "comofoipago_prestImovel";
    String JSON_data_prestImovel = "data_prestImovel";

    //Consórcio
    String JSON_id_consorcio = "id_consorcio";
    String JSON_descricao_consorcio = "descricao_consorcio";
    String JSON_valor_consorcio = "valor_consorcio";
    String JSON_conta_consorcio = "conta_consorcio";
    String JSON_comofoipago_consorcio = "comofoipago_consorcio";
    String JSON_data_consorcio = "data_consorcio";

    //Outros
    String JSON_id_outros = "id_outros";
    String JSON_descricao_outros = "descricao_outros";
    String JSON_id_grupo = "id_grupo";
    String JSON_id_grupo2 = "id_grupo2";
    String JSON_valor_outros = "valor_outros";
    String JSON_data_outros = "data_outros";

    *ReclycerLancamento*




    
    //region Transferencia
    public void JSON_PARSE_DATA_AFTER_WEBCALL_TRANSFERENCIA(JSONArray array){

        for(int i = 0; i<array.length(); i++) {

            final GetDataAdapter GetDataAdapter2 = new GetDataAdapter();

            JSONObject json = null;
            try {

                json = array.getJSONObject(i);
                //Transferencia
                GetDataAdapter2.setId_transferencia(json.getString(JSON_id_transferencia));
                GetDataAdapter2.setDescricao_transferencia(json.getString(JSON_descricao_transferencia));
                GetDataAdapter2.setValor_transferencia(json.getString(JSON_valor_transferencia));
                GetDataAdapter2.setPraondefoi_transferencia(json.getString(JSON_praondefoi_transferencia));
                GetDataAdapter2.setContaondeveio_transferencia(json.getString(JSON_contaondeveio_transferencia));
                GetDataAdapter2.setData_transferencia(json.getString(JSON_data_transferencia));


                mSwipeRefreshLayout.setRefreshing(false);

            }
            catch (JSONException e)
            {

                e.printStackTrace();
            }

            GetDataAdapter1.add(GetDataAdapter2);
        }

        recyclerViewadapter = new RecyclerViewAdapterTransferencia(GetDataAdapter1, getActivity());

        recyclerView.setAdapter(recyclerViewadapter);



    }

    //endregion

    //region Saque
    public void JSON_PARSE_DATA_AFTER_WEBCALL_SAQUE(JSONArray array){

        for(int i = 0; i<array.length(); i++) {

            final GetDataAdapter GetDataAdapter2 = new GetDataAdapter();

            JSONObject json = null;
            try {

                json = array.getJSONObject(i);
                //Saque
                GetDataAdapter2.setId_saque(json.getString(JSON_id_saque));
                GetDataAdapter2.setDescricao_saque(json.getString(JSON_descricao_saque));
                GetDataAdapter2.setValor_saque(json.getString(JSON_valor_saque));
                GetDataAdapter2.setPraondefoi_saque(json.getString(JSON_praondefoi_saque));
                GetDataAdapter2.setContaondeveio_saque(json.getString(JSON_contaondeveio_saque));
                GetDataAdapter2.setData_saque(json.getString(JSON_data_saque));


                mSwipeRefreshLayout.setRefreshing(false);

            }
            catch (JSONException e)
            {

                e.printStackTrace();
            }

            GetDataAdapter1.add(GetDataAdapter2);
        }

        recyclerViewadapter = new RecyclerViewAdapterSaque(GetDataAdapter1, getActivity());

        recyclerView.setAdapter(recyclerViewadapter);



    }

    //endregion

    //region Deposito
    public void JSON_PARSE_DATA_AFTER_WEBCALL_DEPOSITO(JSONArray array){

        for(int i = 0; i<array.length(); i++) {

            final GetDataAdapter GetDataAdapter2 = new GetDataAdapter();

            JSONObject json = null;
            try {

                json = array.getJSONObject(i);
                //Depósito
                GetDataAdapter2.setId_deposito(json.getString(JSON_id_deposito));
                GetDataAdapter2.setDescricao_deposito(json.getString(JSON_descricao_deposito));
                GetDataAdapter2.setValor_deposito(json.getString(JSON_valor_deposito));
                GetDataAdapter2.setPraondefoi_deposito(json.getString(JSON_praondefoi_deposito));
                GetDataAdapter2.setContaondeveio_deposito(json.getString(JSON_contaondeveio_deposito));
                GetDataAdapter2.setData_deposito(json.getString(JSON_data_deposito));


                mSwipeRefreshLayout.setRefreshing(false);

            }
            catch (JSONException e)
            {

                e.printStackTrace();
            }

            GetDataAdapter1.add(GetDataAdapter2);
        }

        recyclerViewadapter = new RecyclerViewAdapterDeposito(GetDataAdapter1, getActivity());

        recyclerView.setAdapter(recyclerViewadapter);



    }

    //endregion

    //region Imovel
    public void JSON_PARSE_DATA_AFTER_WEBCALL_IMOVEL(JSONArray array){

        for(int i = 0; i<array.length(); i++) {

            final GetDataAdapter GetDataAdapter2 = new GetDataAdapter();

            JSONObject json = null;
            try {

                json = array.getJSONObject(i);
                //Imóvel
                GetDataAdapter2.setId_prestImovel(json.getString(JSON_id_prestImovel));
                GetDataAdapter2.setDescricao_prestImovel(json.getString(JSON_descricao_prestImovel));
                GetDataAdapter2.setValor_prestImovel(json.getString(JSON_valor_prestImovel));
                GetDataAdapter2.setConta_prestImovel(json.getString(JSON_conta_prestImovel));
                GetDataAdapter2.setComofoipago_prestImovel(json.getString(JSON_comofoipago_prestImovel));
                GetDataAdapter2.setData_prestImovel(json.getString(JSON_data_prestImovel));


                mSwipeRefreshLayout.setRefreshing(false);

            }
            catch (JSONException e)
            {

                e.printStackTrace();
            }

            GetDataAdapter1.add(GetDataAdapter2);
        }

        recyclerViewadapter = new RecyclerViewAdapterImovel(GetDataAdapter1, getActivity());

        recyclerView.setAdapter(recyclerViewadapter);



    }

    //endregion

    //region Consorcio
    public void JSON_PARSE_DATA_AFTER_WEBCALL_CONSORCIO(JSONArray array){

        for(int i = 0; i<array.length(); i++) {

            final GetDataAdapter GetDataAdapter2 = new GetDataAdapter();

            JSONObject json = null;
            try {

                json = array.getJSONObject(i);
                //Consorcio
                GetDataAdapter2.setId_consorcio(json.getString(JSON_id_consorcio));
                GetDataAdapter2.setDescricao_consorcio(json.getString(JSON_descricao_consorcio));
                GetDataAdapter2.setValor_consorcio(json.getString(JSON_valor_consorcio));
                GetDataAdapter2.setConta_consorcio(json.getString(JSON_conta_consorcio));
                GetDataAdapter2.setComofoipago_consorcio(json.getString(JSON_comofoipago_consorcio));
                GetDataAdapter2.setData_consorcio(json.getString(JSON_data_consorcio));


                mSwipeRefreshLayout.setRefreshing(false);

            }
            catch (JSONException e)
            {

                e.printStackTrace();
            }

            GetDataAdapter1.add(GetDataAdapter2);
        }

        recyclerViewadapter = new RecyclerViewAdapterConsorcio(GetDataAdapter1, getActivity());

        recyclerView.setAdapter(recyclerViewadapter);



    }

    //endregion

    //region Outros
    public void JSON_PARSE_DATA_AFTER_WEBCALL_OUTROS(JSONArray array){

        for(int i = 0; i<array.length(); i++) {

            final GetDataAdapter GetDataAdapter2 = new GetDataAdapter();

            JSONObject json = null;
            try {

                json = array.getJSONObject(i);
                //Outros
                GetDataAdapter2.setId_outros(json.getString(JSON_id_outros));
                GetDataAdapter2.setDescricao_outros(json.getString(JSON_descricao_outros));
                GetDataAdapter2.setId_grupo(json.getString(JSON_id_grupo));
                GetDataAdapter2.setId_grupo2(json.getString(JSON_id_grupo2));
                GetDataAdapter2.setValor_outros(json.getString(JSON_valor_outros));
                GetDataAdapter2.setData_outros(json.getString(JSON_data_outros));


                mSwipeRefreshLayout.setRefreshing(false);

            }
            catch (JSONException e)
            {

                e.printStackTrace();
            }

            GetDataAdapter1.add(GetDataAdapter2);
        }

        recyclerViewadapter = new RecyclerViewAdapterOutros(GetDataAdapter1, getActivity());

        recyclerView.setAdapter(recyclerViewadapter);



    }

    //endregion
    
