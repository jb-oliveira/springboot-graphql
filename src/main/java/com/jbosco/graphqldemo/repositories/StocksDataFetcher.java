package com.jbosco.graphqldemo.repositories;

import com.jbosco.graphqldemo.model.StockDetails;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StocksDataFetcher implements DataFetcher<List<StockDetails>> {


    @Override
    public List<StockDetails> get(DataFetchingEnvironment dataFetchingEnvironment) {
        StockDetails stockDetails = new StockDetails();

        stockDetails.setTicker("AAPL");
        stockDetails.setStockValue("127.14");
        stockDetails.setVolume("111.60M");
        stockDetails.setPE_Ratio("37.75");
        stockDetails.setEPS("3.28");
        stockDetails.setDividend("0.82 (0.64%)");
        stockDetails.setMarcketCap("2.14T");
        stockDetails.setPreviousOpen("128.78");
        stockDetails.setPreviousClose("128.91");

        List<StockDetails> result = new ArrayList<>();
        result.add(stockDetails);
        return result;
    }
}
