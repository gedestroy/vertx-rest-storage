package org.swisspush.reststorage;

import io.vertx.core.Vertx;
import io.vertx.core.logging.LoggerFactory;

/**
 * Created by florian kammermann on 23.05.2016.
 *
 * Deploys the rest-storage to vert.x.
 * Used in the standalone scenario.
 */
public class RestStorageRunner {

    public static void main(String[] args) {
        Vertx.vertx().deployVerticle("org.swisspush.reststorage.RestStorageMod", event ->
                LoggerFactory.getLogger(RestStorageMod.class).info("rest-storage started"));
    }
}
