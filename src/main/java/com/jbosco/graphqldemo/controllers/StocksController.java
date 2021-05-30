package com.jbosco.graphqldemo.controllers;


import com.fasterxml.jackson.databind.util.JSONPObject;
import com.jbosco.graphqldemo.services.GraphQLService;
import graphql.ExecutionResult;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class StocksController {

    @Autowired
    private GraphQLService graphQLService;

    @RequestMapping(value = "/stockdata")
    public String getPreAuthDecisionData(@RequestBody String query){
        ExecutionResult executionResult = graphQLService.getGraphQL().execute(query);
        Map<String, String> data = (Map<String, String>) executionResult.getData();
        JSONObject jsonpObject = new JSONObject(data);
        return jsonpObject.toString();
    }
}
