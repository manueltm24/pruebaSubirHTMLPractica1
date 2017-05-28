package com.pruebaSubirHTMLPractica1;


import spark.Spark;
import spark.utils.IOUtils;

import static spark.Spark.get;

/**
 * Created by MT on 28/5/2017.
 */
public class Main {
    public static void main(String[] args) {

        get("/", (q, a) -> IOUtils.toString(Spark.class.getResourceAsStream("/HTML/pruebaPractica1.html")));
    }
}
